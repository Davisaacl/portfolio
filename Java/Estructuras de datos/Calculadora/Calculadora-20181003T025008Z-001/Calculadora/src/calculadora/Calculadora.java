/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 *
 * @author edi
 */
public class Calculadora {

    private String expresion;
    private double resultado;
    
    public Calculadora(){
    }
    
    public Calculadora(String expresion){
        this.expresion = expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public double getResultado() {
        return resultado;
    }
    
    
    public String[] obtieneTokens(String cadena) {
        ArrayList junta= new ArrayList();
        
        StringBuilder cad = new StringBuilder();
        StringBuilder sA=new StringBuilder();
        
        char[] nueva = cadena.toCharArray();
        String fin[];
        
        
        
        int i=0;
        while(i<nueva.length){
            if(Character.isDigit(nueva[i])){
                while(i<nueva.length&&(Character.isDigit(nueva[i])||nueva[i]=='.')){
                    sA.append(Character.toString(nueva[i]));
                    i++;
                    
                }
                junta.add(sA.toString());
            }else{
                sA.append(Character.toString(nueva[i]));
                junta.add(sA.toString());
                i++;
            }
            sA=new StringBuilder();
            
        }
        
        fin=new String[junta.size()];
        for(int s=0;s<junta.size();s++)
            fin[s]=(String) junta.get(s);
        
        return fin;
    }
    public boolean revisaBalanceoParentesis(String[] cadena){
        ArrayStack pila=new ArrayStack();
        int i,n;
        i=0;
        boolean res=true;
        while(i<cadena.length&& res){
            if(cadena[i].charAt(0)=='(')
                pila.push(cadena[i].charAt(0));
            else
                if(cadena[i].charAt(0)==')')
            try{
                    pila.pop();
            }catch(EmptyCollectionException e){
                    res=false;
            }
            i++;
        }
        return pila.isEmpty()&&res;
    }

    public boolean esOperador(char dato){
        boolean res = false;
        
        if (dato=='+' ||dato=='-' || dato=='*' || dato=='/')
            res = true;
        return res;
    }
    
    public int prioridadOperador(char dato){
        int res = 0;
        char prioridad = dato;
        
        switch (prioridad){
            case '+':
            case '-':
                res = 1;
                break;
            case '*':
            case '/':
                res = 2;
        }
        return res;
    }
    
    public String [] conviertePostfijaN (String cadena){
        StringBuilder sb=new StringBuilder();
        
        StackADT <String>pila = new ArrayStack();
        String infija[]=obtieneTokens(cadena);
        System.out.println(infija.length);
        ArrayList <String> postfija= new  ArrayList();
        int k = 0,num=1;
        char dato;
        for (int i=0;i<infija.length;i++){
            System.out.println("trabajaré con un "+ infija[i].charAt(0));
            dato=infija[i].charAt(0);
            if(Character.isDigit(dato)){ //SI ES NÚMERO
                //System.out.println("hola");
                postfija.add(infija[i]);
            }else{
                if(dato=='('){ //SI ES PARÉNTESIS IZQUIERDO
                    pila.push(infija[i]);
                    //System.out.println(pila.peek());
                }else{
                    if(dato==')'){ //SI ES PARÉNTESIS DERECHO
                        dato=pila.peek().toString().charAt(0);
                        
                        while(!pila.isEmpty()&& dato!='('){
                            postfija.add((String) pila.pop());
                            dato=pila.peek().toString().charAt(0);
                        }

                        if(!pila.isEmpty()) 
                            pila.pop();
                     }else{
                        if(pila.isEmpty())
                            pila.push(Character.toString(dato));
                        else{
                            if(prioridadOperador(dato)<pila.peek().toString().charAt(0)){
                                pila.push(Character.toString(dato));
                            }else
                                postfija.add(Character.toString(dato));
                        }
                    }
                }
            
            }
        
        num++;
        }
        
        while(!pila.isEmpty()){
            postfija.add(pila.pop());
            k++;
        }
        for(int i=0;i<postfija.size();i++)
            sb.append(postfija.get(i));
        System.out.println(sb.toString());
        
        String []fin=new String[postfija.size()];
        for(int s=0;s<postfija.size();s++)
            fin[s]= postfija.get(s);
        
        return fin;
    }
    
    public double evaluaExpresion (String [] postfija){
        StackADT<Double> pila = new ArrayStack();
        double res = 0, aux1, aux2;
        
        if (postfija != null)
            for (int i=0;i<postfija.length;i++){
                if (!esOperador(postfija[i]))
                    pila.push(Double.parseDouble(postfija[i]));
                else{
                    aux1 = pila.pop();
                    aux2 = pila.pop();
                    switch (postfija[i].charAt(0)){
                        case '+':
                            res = aux1 + aux2;
                            break;
                        case '-':
                            res = aux1 - aux2;
                            break;
                        case '*':
                            res = aux1 * aux2;
                            break;
                        case '/':
                            if (aux2 == 0)
                                throw new ArithmeticException();
                            res = aux1 / aux2;
                    }
                    pila.push(res);
                }
            }
        return pila.pop();
    }
    
    public boolean calcula(){
        boolean res = false;
        
        res = revisaBalanceoParentesis(String cadena);
        if (res){
            String [] cadenaNueva = obtieneTokens(expresion);
            cadenaNueva = conviertePostfija(cadenaNueva);
            resultado = evaluaExpresion(cadenaNueva);
        }
        return res;
    }

    
}
    
    