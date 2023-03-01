/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.Objects;
/**
 *
 * @author Shanti
 */
public class Nodo <T> {
    
    private T dato;
    private Nodo <T> siguiente; 
    
    public Nodo (){
        siguiente = null; //apunta a nada
    }
    
    public Nodo (T dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> direccion) {
        this.siguiente = direccion;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente =" + siguiente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo<?> other = (Nodo<?>) obj;
        return Objects.equals(this.dato, other.dato);
    }
}

