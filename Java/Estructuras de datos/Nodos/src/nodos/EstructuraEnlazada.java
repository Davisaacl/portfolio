/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author edi
 */
public class EstructuraEnlazada <T> {
    private Nodo<T> primero;

    public EstructuraEnlazada() {
        primero = null;
    }

    public void agregaAlInicio(T dato){
        Nodo<T> nuevo = new Nodo(dato);
        primero = nuevo;
    }
    
    public void agregaAlFinal(T dato){
        Nodo<T> nuevo = new Nodo(dato);
        if (primero != null){
            Nodo<T> aux = primero;
            while(aux.getSig()!=null)
                aux = aux.getSig();
            aux.setSig(nuevo);
        }else
            primero = nuevo;
    }
    
    // Si dato viejo no existe se decidió agregar al final
    public void agregaDespuesDe(T datoViejo, T datoNuevo){
        Nodo<T> nuevo = new Nodo(datoNuevo);
        Nodo<T> aux = primero;
        if (aux == null)
            primero = nuevo;
        else{
            while(!aux.getDato().equals(datoViejo) && aux.getSig()!=null)
                aux = aux.getSig();
            if (aux.getSig() == null)
                aux.setSig(nuevo);
            else{
                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
            }
        }
    }
    
    public void agregaAlFinalR(T dato){
        Nodo<T> nuevo = new Nodo(dato);
        
        if(primero!= null)
            primero = nuevo;
        else
            agregaAlFinalR(nuevo,primero);
    }
    
    public void agregaAlFinalR(Nodo<T> nuevo, Nodo<T> aux){
        if(aux.getSig() == null)
            aux.setSig(nuevo);
        else
            agregaAlFinalR(nuevo, aux.getSig());
    }
    
    public Nodo<T> eliminaPrimero(){
        Nodo<T> res = primero;
        
        if (primero!=null)
            primero = primero.getSig();
        return res;
    }
    
    public Nodo<T> eliminaUltimo(){
        Nodo<T> aux = primero;
        Nodo<T> res = null;
        
        if(primero != null && primero.getSig() != null){
            while(aux.getSig().getSig() != null)
                aux = aux.getSig();
            res = aux.getSig();
            aux.setSig(null);
        } else if(primero != null){
            res = primero;
            primero = null;
        }
        return res;
    }
    /*
    public Nodo<T> eliminaDato(T dato){
        Nodo <T> res = buscaDato(dato);
        
        if (){
            
        }
        return res;
    }
    */
    
    public Nodo<T> buscaDato (T dato){
         return buscaDato(dato,primero);
    }
    
    public Nodo<T> buscaDato(T dato, Nodo<T> cual){
        if (cual == null)
            return null;
        else if (cual.getDato().equals(dato)){
            return cual;
        }
        else
            return buscaDato(dato, cual.getSig());
    }
    
    public boolean isEmpty(){
        boolean res = false;
        
        if(primero == null)
            res = true;
        return res;

    }
    
    public Nodo <T> muestraPrimero(){
        return primero;
    }
    /*
    eliminaDato
    contains
    first
    last
    size
    GETTER Y SETTER
    */
}
