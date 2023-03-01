/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.*;
import java.util.function.Consumer;
/**
 *
 * @author edi
 */
public class LinkedIterator <T> implements Iterator<T>{
    private Nodo<T> current;
    
    public LinkedIterator (Nodo<T> current){
        this.current = current;
    }
    
    public boolean hasNext() {
        return current!=null;
    }

    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        else {
            T res = current.getDato();
            current = current.getSig();
            return res;
        }
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
