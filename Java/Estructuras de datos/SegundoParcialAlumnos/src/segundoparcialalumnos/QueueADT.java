/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package segundoparcialalumnos;

/**
 *
 * @author agomezdg
 */
public interface QueueADT<T> {
    public void enqueue(T dato);

    public T dequeue();

    public T first();

    public boolean isEmpty();
}
