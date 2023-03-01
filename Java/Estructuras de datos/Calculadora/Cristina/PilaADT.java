/*
CCS
13 de febrero del 2018
interface de pila
 */
package proyecto;


public interface PilaADT <T> {
    public void push(T dato);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
