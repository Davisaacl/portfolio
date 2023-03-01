package lista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        nuevo.setSig(primero);
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
    
    public T eliminaDato(T dato){
        T res = null;

        if (!isEmpty()){
            if (dato.equals(primero.getDato())){
                res = primero.getDato();
                eliminaPrimero().getDato();
            }
            else {
                Nodo<T> actual = primero;
                Nodo<T> anterior = primero;
                while (actual != null && !actual.getDato().equals(dato)){
                    anterior = actual;
                    actual = actual.getSig();
                }
                if (actual != null){ // El dato está en la estructura enlazada.
                    anterior.setSig(actual.getSig());
                    res = actual.getDato();
                    actual.setSig(null);
                }
            }
        }
            
        return res;
    }

     
    public boolean isEmpty(){
        return primero == null;
    }
    
    public boolean contains(T dato){
        Nodo <T> aux = primero;
        boolean res = false;
        
        while (aux != null && !aux.getDato().equals(dato)){
            if (!aux.getSig().getDato().equals(dato))
                res = true;
            aux = aux.getSig();
        }
        return res;
    }
    
    public int size(){
        int res = 0;
        Nodo<T> aux = primero;
        
        while (aux!=null){
            aux = aux.getSig();
            res++;
        }
        return res;
        
    }
    
    public Nodo <T> getPrimero(){
        return primero;
    }
    
    public Nodo <T> getUltimo(){
        Nodo<T> aux = primero;
        
        while (aux.getSig()!=null)
            aux.getSig();
        return aux;
    }
    
    public T getElemento(int num){
        Nodo <T> auxiliar = primero;
        int cont = 1;
        T elemento;
        
        while (auxiliar != null && cont < num){
            auxiliar = auxiliar.getSig();
            cont++;
        }
        if (cont < num || auxiliar == null)
            elemento = null;
        else 
            elemento = auxiliar.getDato();
        return elemento;
    }
    
    /*
    first
    last
    GETTER Y SETTER
    */
}
