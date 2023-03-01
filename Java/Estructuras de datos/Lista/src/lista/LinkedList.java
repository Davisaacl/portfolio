/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;

/**
 *
 * @author edi
 */
public class LinkedList <T> implements ListADT<T>{
    EstructuraEnlazada<T> datos;
    
    public LinkedList(){
        datos = new EstructuraEnlazada();
    }

    public T removeFirst() {
        return (T) datos.eliminaPrimero();
    }

    public T removeLast() {
        return (T) datos.eliminaUltimo();
    }

    public T remove(T dato) {
        return datos.eliminaDato(dato);
    }

    public T first() {
        return (T) datos.getPrimero();
    }

    public T last() {
        return (T) datos.getUltimo();
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    public int size() {
        return datos.size();
    }

    public Iterator<T> iterator() {
        return new LinkedIterator<T>(datos.getPrimero());
    }

    public boolean contains(T dato) {
        return datos.contains(dato);
    }

    public void clear() {
        while (datos.getPrimero().getDato()!=null)
            removeFirst();
    }

}
