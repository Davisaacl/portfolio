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
public class PilaA <T> implements PilaADT<T>{
    private T[] pila;
    private int tope;
    private final int MAX = 20;
    
    public PilaA(){
        pila = (T[]) new Object [MAX];
        tope = -1;
    }
    
    public PilaA(int max){
        pila = (T[]) new Object [max];
        tope = -1;
    }
    
    public boolean isEmpty(){
        return tope==-1;
    }
    
    public void push(T dato){
        if(tope==pila.length-1)
            expande();
        tope++;
        pila[tope] = dato;
    }
    
    private void expande(){
        T[] nuevo = (T[]) new Object [pila.length];
        for(int i=0;i<=tope;i++)
            nuevo[i] = pila[i];
        pila = nuevo;
    }
    /*
    public T pop(){
        T resultado;
        
        if(isEmpty())
            resultado = null;
        else{
            resultado = pila[tope];
            pila[tope] = null;
            tope--;
        }
        return resultado;        
    }
    */
    
    public T pop(){
        if (isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        else{
            T resultado = pila[tope];
            tope--;
            return resultado;
        }
    }
    
    /*
    public T peek(){
        T resultado;
        if(isEmpty())
            resultado = null;
        else
            resultado = pila[tope];
        return resultado;
    }
*/
    public T peek(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        else
            return pila[tope];
    }
    
    // Tarea Guardati
    public boolean pilaIgual(Object obj){
        int cont;
        boolean res = false;
        
        if(obj!= null && obj instanceof PilaADT){
            PilaADT<T>pila1 = (PilaADT<T>)obj;
            PilaA<T> aux1 = new PilaA();
            PilaA<T> aux2 = new PilaA();
            cont = 0;
        
            while(!isEmpty() && !pila1.isEmpty() && peek().equals(pila1.peek())){
                aux1.push(pop());
                aux2.push(pop());
                cont++;
            }
            if (isEmpty() && pila1.isEmpty())
                res = true;
            for (int i=0;i<cont;i++){
                push(aux1.pop());
                pila1.push(aux2.pop());
            }
        }
        
        return res; 
        
    }
}
