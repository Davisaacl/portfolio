/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3andrés;

/**
 *
 * @author edi
 */
public interface ColaADT <T> {
    public void enqueue (T dato);
    public T dequeue();
    public T first();
    public boolean isEmpty();
    
}

