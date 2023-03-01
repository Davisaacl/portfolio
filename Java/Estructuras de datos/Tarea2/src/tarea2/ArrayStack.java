/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author David ISAAC
 */
public class ArrayStack <T> implements StackADT<T>{
    private T[] datos;
    private final int DEFAULT_CAPACITY = 100;
    private int top;
    
    public ArrayStack(){
        datos = (T[]) new Object [DEFAULT_CAPACITY];
        top=0;
    }
    
    public ArrayStack(int tam){
        datos = (T[]) new Object [tam];
        top = 0;
    }
    
    public void push (T dato){
        if(top==datos.length)
            expandCapacity();
        datos[top] = dato;
        top++;
    }
    
    private void expandCapacity(){
        T[] aux = (T[]) new Object[2*datos.length];
        
        for (int i=0;i<datos.length;i++)
            aux[i] = datos[i];
        datos = aux;
    }
    
    public T pop(){
        if(isEmpty())
            throw new EmptyCollectionException();
        else{
            top--;
            T res = datos[top];
            datos[top] = null;
            return res;
        }
    }
    
    public T peek(){
        if(isEmpty())
            throw new EmptyCollectionException();
        else
            return datos[top-1];
    }
    
    public boolean isEmpty(){
        return top==0;
    }

    public T getTop(){
    	return datos[top-1];
    }

    public int getPilaLenght(){
    	return datos.length;
    }

    
}
