

package examenfinaledmayo2015;


import java.util.*;

/**
 * Clase para implementar la interface Iterator.
 * Implementa los métodos hasNext() y next().
 * Recorre la colección de izquierda a derecha
 * @author Silvia Guardati
 */
public class IteradorDoble <T> implements Iterator <T> {
    private NodoDoble <T> actual;

    public IteradorDoble(NodoDoble <T> actual) {
        this.actual = actual;
    }

    // Regresa true si existe un elemento.
    public boolean hasNext() {
        return actual != null;
    }

    // Regresa el objeto apuntado por el iterador.
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        else {
            T resul = actual.getDato();
            actual = actual.getDer();
            return resul;
        }
    }
    /* Elimina el último elemento devuelto por el iterador.
     * Es una operación opcional.
     */
    public void remove() {
        throw new UnsupportedOperationException("No está implementada.");
    }
}
