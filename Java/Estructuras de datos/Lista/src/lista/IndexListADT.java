/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author edi
 */
public interface IndexListADT <T> extends ListADT<T>{
    public void add(int i, T dato);
    public void add(T dato);
    public void set(int i, T dato);
    public T get(int i);
    public int indexOf(T dato);
    public T remove(int i);
    
}
