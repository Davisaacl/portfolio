/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ee;

/**
 *
 * @author David ISAAC
 */
public class LinkedStack <T> implements StackADT<T>{
    private EstructuraEnlazada <T> contents;
    
    public LinkedStack(){
        contents = new EstructuraEnlazada();
    }
    
    public void push(T dato){
        contents.agregaAlInicio(dato);
    }
    
    public T pop(){
        
        if (isEmpty())
            throw new EmptyCollectionException();
        else
            return contents.eliminaPrimero().getDato();
    }
    
    public T peek(){
        
        if (isEmpty())
            throw new EmptyCollectionException();
        else
            return contents.muestraPrimero().getDato();
    }

    public boolean isEmpty() {
        return contents.muestraPrimero() == null;
    }

}
