/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleddiciembre2012;

/**
 *
 * @author AGOMEZDG
 */
import java.util.*;

public class ListaDoblementeEnlazada<T> implements ListADT<T> {
    protected DoublyLinkedNode<T> primero,último;
    
    public ListaDoblementeEnlazada() {
        primero=último=null;
    }
    
    public Iterator<T> iterator() {
        return new DoublyLinkedIterator(último);
    }

    @Override
    public T removeFirst() {
        T res = primero.getElement();
        
        if (primero != null){
            primero = primero.getNext();
        }
        return res;
    }

    @Override
    public T removeLast() {
        T res = último.getElement();
        
        if (último!=null){
            último = último.getPrevious();
        }
        return res;
    }

    @Override
    public T remove(T dato) {
        if (primero.getElement().equals(dato))
            removeFirst();
        else if (último.getElement().equals(dato))
            removeLast();
        else{
            
        }
        return dato;
        
    }

    @Override
    public T first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T last() {
        return último.getElement();
    }

    public boolean isEmpty() {
        return primero==null && último==null;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T dato) {
        boolean res = false;
        
        if (primero.getElement().equals(dato) || último.getElement().equals(dato))
            res = true;
        else{
            DoublyLinkedNode<T> aux = new DoublyLinkedNode();
            while (!aux.getElement().equals(dato) || aux.getNext()!=null){
                aux = aux.getNext();
            }
            if (aux.getNext()!=null)
                res = true;
        }
        return res;
            
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
