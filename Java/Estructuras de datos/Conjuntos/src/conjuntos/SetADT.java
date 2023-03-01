/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

/**
 *
 * @author edi
 */
public interface SetADT <T> extends Iterable <T> {
    public void add(T dato);
    public boolean contains (T target);
    public T removeRandom();
    public T remove (T dato);
    public boolean isEmpty();
    public int size();
    public void addAll(SetADT<T> set);
             
}
