/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Shanti
 */
public class IteratorNodoD <T> implements Iterator<T> {
    
    private NodoDoble<T> actual;
    
    public IteratorNodoD (NodoDoble<T> primero){
        actual = primero;
    }
    
    @Override
    public boolean hasNext() {
        return actual != null;
    }
    
    @Override
    public T next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        else{
            T aux = actual.getDato();
            actual = actual.getSiguiente();
            return aux;
        }
    }
    
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}

