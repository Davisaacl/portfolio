/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Shanti
 */
public abstract class Lista<T> implements ListaADT <T>{

    protected NodoDoble<T> primero;
    protected NodoDoble<T> ultimo;

    public Lista() {
        primero = null;
        ultimo= null;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorNodoD(primero);
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public T quitaPrimero() {
        if(estaVacia()){
            throw new ExcepcionColeccionVacia();
        }
        else{
            T dato = primero.getDato();
            NodoDoble<T> auxiliar = primero;     
            primero = primero.getSiguiente(); //recorres al nodo siguiente
            auxiliar.setSiguiente(null);          
            return dato; 
        }
    }

    @Override
    public T quitaUltimo(){
        if(estaVacia()){
            throw new ExcepcionColeccionVacia();
        }
        else{
            T dato;
            NodoDoble <T> actual = primero;
            if(actual.getSiguiente()!= null){
                NodoDoble <T> siguiente = actual.getSiguiente();
                while(siguiente.getSiguiente() != null){
                    actual = actual.getSiguiente();
                    siguiente = siguiente.getSiguiente();
                }
            actual.setSiguiente(null);
            dato = siguiente.getDato();
            }
            else{
                dato = primero.getDato();
                primero = null;
            }  
        return dato;
        }    
    }


   @Override
   public T quita(T dato) {
        T resp = null;
        if (!estaVacia()){
            if (primero.getDato().equals(dato)) {
                resp = quitaPrimero();
            } else {
                NodoDoble<T> anterior = primero;
                NodoDoble<T> actual = primero.getSiguiente();
                while (actual != null && !actual.getDato().equals(dato)) {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
                if (actual != null) {//si esta
                    anterior.setSiguiente(actual.getSiguiente());
                    resp = actual.getDato();
                    actual.setSiguiente(null);
                }
            }
        }
        return resp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodoDoble<T> auxiliar = primero;
        while (auxiliar != null) {
            sb.append("\n").append(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
        return sb.toString();
    }
    
    //To String con recursividad
    public String toStringR() {
        return toStringR(new StringBuilder(), this.iterator());
    }

    private String toStringR(StringBuilder sb, Iterator<T> it) {
        if (it.hasNext()) {
            sb.append(it.next());
            return toStringR(sb, it);
        } else {
            return sb.toString();
        }
    }

    //To string que imprime al revés
    public String imprimeVoleteado (){
        StringBuilder sb = new StringBuilder ();
        Stack pila = new Stack ();
        NodoDoble<T> auxiliar = primero;
        while (auxiliar != null){
            pila.add(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
        
        while (!pila.isEmpty()){
            sb.append(pila.pop());
            
        }
        
        return sb.toString ();
    }
    
    //To string que imprime al revés 
    public String imprimeVolteadoR() {
        return imprimeVolteadoR(new StringBuilder(), this.iterator());
    }

    private String imprimeVolteadoR(StringBuilder sb, Iterator<T> it) {
        if (it.hasNext()) {
            sb.append(it.next());
            return imprimeVolteadoR(sb, it);
        } else {
            return sb.toString();
        }
    }
    
   
    
    @Override
    public boolean contiene(T dato) {
        
        NodoDoble<T> auxiliar = primero;
        while (auxiliar != null && !auxiliar.getDato().equals(dato)) {
            auxiliar = auxiliar.getSiguiente();
        }
 
        return auxiliar != null;
    }

    public int calculaTamano() {
        int contador = 0;
        NodoDoble<T> auxiliar = primero;
        while (auxiliar != null) {
            contador++;
            auxiliar = auxiliar.getSiguiente();
        }
        return contador;
    }

    //Calcula Tamaño con recursividad
    @Override
    public int calculaTamaño() {
        return calculaTamaño(0, primero);
    }

    private int calculaTamaño(int contador, NodoDoble<T> auxiliar) {
        if (auxiliar == null) {
            return contador;
        } else {
            contador++;
            auxiliar = auxiliar.getSiguiente();
            return calculaTamaño(contador, auxiliar);
        }
    }

    @Override
    public T obtienePrimero() {
        T primerDato = null;
        if (!estaVacia()) {
            primerDato = primero.getDato();
        }
        return primerDato;
    }

    //Obtiene Ultimo sin recursvidad
    public T obtieneUltimo1() {
        NodoDoble<T> auxiliar = primero;
        if (!estaVacia()) {
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return auxiliar.getDato();
    }

    //Obtiene Ultimo con recursividad
    @Override
    public T obtieneUltimo() {
        T ultimoDato = null;
        if (!estaVacia()) {
            ultimoDato = obtieneUltimo(primero);
        }
        return ultimoDato;
    }

    private T obtieneUltimo(NodoDoble<T> auxiliar) {
        if (auxiliar.getSiguiente() == null) {
            return auxiliar.getDato();
        } else {
            return obtieneUltimo(auxiliar.getSiguiente());
        }
    }
    //Obtiene Ultimo con recursividad e Iterador
    public T obtUltimo() {
        T resp = null;
        if (!estaVacia()) {
            resp = obtUltimo(iterator(), null);
        }
        return resp;
    }

    private T obtUltimo(Iterator<T> it, T ultimo) {
        if (it.hasNext()) {
            ultimo = it.next();
            return obtUltimo(it, ultimo);
        } else {
            return ultimo;
        }
    }

    public boolean equals(Lista<T> otra) {
        boolean resp = false;
        resp = otra != null;
        resp = resp && equals(this.iterator(), otra.iterator());
        return resp;
    }

    public boolean equals(Iterator<T> it1, Iterator<T> it2) {
        if (!it1.hasNext() && !it2.hasNext()) {
            return true;
        } else {
            if (!it1.hasNext() || !it2.hasNext()) {
                return false;
            } else if (it1.next().equals(it2.next())) {
                return equals(it1, it2);
            } else {
                return false;
            }
        }
    }
}

