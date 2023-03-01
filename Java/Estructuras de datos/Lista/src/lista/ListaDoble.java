/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;

/**
 *
 * @author Shanti
 */
public abstract class ListaDoble <T> implements ListaADT<T>{
    protected NodoDoble<T> primero, ultimo;
    
    public ListaDoble(){
        primero = null;
        ultimo = null;
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    @Override
    public IteratorNodoD<T> iterator(){
        return new IteratorNodoD(primero);
    }
    
    @Override
    public String toString(){
        return toString(new StringBuilder(), this.iterator());
    }
    private String toString(StringBuilder cad, Iterator<T> it){
        if(it.hasNext()){
            cad.append(it.hasNext());
            return toString(cad, it);
        }
        else{
            return cad.toString();
        }
    }
    
    public int calTamano(){
        int cont=0;
        for (T x: this)
             cont++;
        return cont;    
    }
    
    @Override
    public boolean contiene(T dato){
        boolean resp;
        NodoDoble<T> act;
            resp=false;
            act=ultimo;
            while(act!=null && !act.getDato().equals(dato)){
                act=act.getAnterior();                
            }
              
            if(act!=null){
                resp=true;
            }
            return resp;
    }
    
    //lo completamos
    @Override
    public T quitaPrimero(){
        T resp=null;
        if(!estaVacia()){
            resp=primero.getDato();
            if(primero==ultimo){
                primero=null;
                ultimo=null;
            }
            else{
                primero.getSiguiente().setAnterior(null);//El segundo ya no tiene anterior el primero
                NodoDoble<T> aux = primero;///////
                primero=primero.getSiguiente();//El primero ya es el segundo
                aux.setSiguiente(null);
            }
        }
        return resp;
    }
    
    @Override
    public T quita(T dato){
        T resp;
        resp=null;
        if(!estaVacia()&& dato!=null){
            if(primero.getDato().equals(dato)){
                resp=quitaPrimero();
            }
            else{
               if(ultimo.getDato().equals(dato)){
                   resp=quitaUltimo();
               }
               else{
                   resp=quita(dato, primero.getSiguiente());
               }
            }
        }
        return resp;
    }
    
    private T quita(T dato, NodoDoble<T> act){
        if(act==null){
            return null;
        }
        else{
            if(act.getDato().equals(dato)){
                act.getAnterior().setSiguiente(act.getSiguiente());
                act.getSiguiente().setAnterior(act.getAnterior());
                act.setAnterior(null);
                act.setSiguiente(null);
                return act.getDato();
            }
            else{
                return quita(dato, act.getSiguiente());
            }
        }
    }
}

