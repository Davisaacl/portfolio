/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nododoblementeenlazado;

/**
 *
 * @author edi
 */
public class NodoD <T>{
    private T dato;
    private NodoD<T> sig;
    private NodoD<T> ant;
    
    public NodoD(){
        dato = null;
        sig = null;
        ant = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoD<T> getSig() {
        return sig;
    }

    public void setSig(NodoD<T> sig) {
        this.sig = sig;
    }

    public NodoD<T> getAnt() {
        return ant;
    }

    public void setAnt(NodoD<T> ant) {
        this.ant = ant;
    }
    
    public String toString(){
        return dato.toString();
    }
}
