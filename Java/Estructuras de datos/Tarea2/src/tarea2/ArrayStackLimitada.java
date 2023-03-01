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
public class ArrayStackLimitada <T> extends ArrayStack<T>{
    private int capacidad;

    public ArrayStackLimitada() {
    }

    public ArrayStackLimitada(int capacidad) {
        super(capacidad);
    }
    
    public T push (T dato){
        if(top==capacidad)
            throw FullCollectionException();
        
    }
    
}
