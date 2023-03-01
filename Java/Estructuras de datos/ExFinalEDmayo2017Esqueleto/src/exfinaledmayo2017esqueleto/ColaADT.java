package exfinaledmayo2017esqueleto;

/**
 *
 * @author 
 * @param <T>
 */
public interface ColaADT <T> {
    public void agrega(T dato);
    public T quita();
    public boolean estaVacia();
    public T primero();
}
