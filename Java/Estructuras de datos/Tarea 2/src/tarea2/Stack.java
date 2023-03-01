/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author edi
 */
public class Stack <T> implements StackADT<T>{
    private int tope;
    private T[] pila;
    private int MAX=20;

    //Los métodos de la clase

    public Stack(){
        pila=(T[]) new Object[MAX];
        tope=-1; //pila vacía
    }

    public int getTope() {
        return tope;
    }

    public T[] getPila() {
        return pila;
    }
    
    

    public Stack(int max){
        pila=(T[]) new Object[max];
        tope=-1; //pila vacía
    }

    public boolean isEmpty(){
        return tope==-1;
    }
 
    
    public void push(T dato){
        if(tope==pila.length-1){
        expande();
        tope++;
        pila[tope]=dato;
        }
    }

    private void  expande(){
        T[] nuevo=(T[]) new Object[pila.length*3];
        for(int i=0; i<=tope;i++)
            nuevo[i]=pila[i];
        pila=nuevo;
    }
    
    public T pop(){  //un pop usando una excepción como respuesta
        if(isEmpty())
            throw new EmptyCollectionException("PilaVacía");
        else{
            T res=pila[tope];
            tope--;
            return res;
        }
    }

    public T peek(){  //un peek usando una excepción como respuesta
        if(isEmpty())
            throw new EmptyCollectionException("PilaVacía");
        else{
        return  pila[tope];
        }
    }
}
