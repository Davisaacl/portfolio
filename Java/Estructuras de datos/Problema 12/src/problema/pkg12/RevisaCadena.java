/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg12;

/**
 *
 * @author edi
 */
public class RevisaCadena {
    private String expression;

    public RevisaCadena() {
    }

    public RevisaCadena(String expression) {
        this.expression = expression;
    }
    
    public boolean revisaBalanceoParent(){
        PilaA<Character> pila = new PilaA();    //Ver clase Pila en notas de clase
        int i, n;
        boolean resp;
        
        i=0;
        n=expression.length();
        resp = true;
        while (i<n && resp){
            if(expression.charAt(i)=='(')
                pila.push(expression.charAt(i));
            else
                if (expression.charAt(i)==')')
                    try{
                        pila.pop();
                    }catch(EmptyCollectionException e){
                        resp = false;
                    }
            i++;
        }
        
        return pila.isEmpty() && resp;
                    
    }
    
    //Problema 12
    
    
    
    //Problema 13
}

