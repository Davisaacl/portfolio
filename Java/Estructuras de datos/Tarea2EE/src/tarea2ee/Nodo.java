/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ee;

/**
 *
 * @author edi
 */
public class Nodo <X>{
    private X dato;
    private Nodo<X> sig;
    
    public Nodo(){
        dato = null;
        sig = null;
    }
    
    public Nodo(X d){
        dato = d;
        sig = null;
    }

    public X getDato() {
        return dato;
    }

    public void setDato(X dato) {
        this.dato = dato;
    }

    public Nodo<X> getSig() {
        return sig;
    }

    public void setSig(Nodo<X> sig) {
        this.sig = sig;
    }
    
    public String toString(){
        return dato.toString();
    }
    
}
