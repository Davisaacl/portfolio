
package examenfinaledmayo2015;

/**
 * @author sguardatb
 * @param <T>
 */
public class NodoDoble <T>{
    private T dato;
    private NodoDoble<T> izq, der;
    
    public NodoDoble(T dato){
        this.dato = dato;
        izq = null;
        der = null;
    }
    
    public NodoDoble(){
        this(null);     
    }
    
    public T getDato() {
        return dato;
    }

    public NodoDoble<T> getIzq() {
        return izq;
    }

    public NodoDoble<T> getDer() {
        return der;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setIzq(NodoDoble<T> izq) {
        this.izq = izq;
    }

    public void setDer(NodoDoble<T> der) {
        this.der = der;
    }
    
    public String toString(){
        return dato + "\n";
    }   
}
