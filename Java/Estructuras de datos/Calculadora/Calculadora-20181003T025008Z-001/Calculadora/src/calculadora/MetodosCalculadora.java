/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author edi
 */
public class MetodosCalculadora {
    private ArrayStack calculadora;
    private String expresion;
    
    public MetodosCalculadora(){
    }
    
    public static boolean revisaBalanceoParentesis(Character [] expresion){
        boolean res = true;
        ArrayStack<Character> pila = new ArrayStack();
        int n, i=0;
        
        n=expresion.length;
        while(i<n && res){
            if(expresion[i] =='(')
                pila.push(expresion[i]);
            else
                if(expresion[i] == ')')
                    try{
                        pila.pop();
                    }catch(EmptyCollectionException e){
                        res = false;
                    }
            i++;
        }
        return pila.isEmpty() && res;
    }
    
}
