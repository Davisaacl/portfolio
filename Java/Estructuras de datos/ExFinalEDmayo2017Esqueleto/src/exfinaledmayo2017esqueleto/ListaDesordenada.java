
package exfinaledmayo2017esqueleto;

import java.util.Iterator;

public class ListaDesordenada<T> {
    private Nodo<T> primero;    
    
    public ListaDesordenada() {
        primero = null;
    }    
   
    //Método que debes escribir para resolver el inciso 2: 
    public void cambiaOrden(T dato){
       if (dato!=null){
            Nodo<T> anterior = primero;
            Nodo<T> actual = primero;
            Nodo<T> var;
            while (actual!=null){
                if(actual.getDato().equals(dato)){
                    if (actual!=primero){
                        
                    
                        var = new Nodo(actual.getDato());
                        var.setSig(primero);
                        primero = var;
                        anterior.setSig(actual.getSig());
                        actual = anterior;
                    }
               }
            anterior = actual;
            actual = actual.getSig();
           }
       }
    }
    
    public void agregaFinal(T dato) {
        Nodo <T> nuevo = new Nodo (dato);
        if (isEmpty())
            primero = nuevo;
        else{
            Nodo <T> apuntador = primero;
            while (apuntador.getSig() != null)
                apuntador = apuntador.getSig();
            apuntador.setSig(nuevo);
        }
    }
    
    public boolean isEmpty() {
        return primero == null;
    }

    public Iterator<T> iterator() {
        return new Iterador (primero);
    }
    
    @Override
    public String toString(){
        StringBuilder cad = new StringBuilder();
        Nodo<T> apuntador = primero;
        
        while (apuntador != null){
           cad.append(apuntador.getDato()).append("  ");
           apuntador = apuntador .getSig();
        }
        return cad.toString();
    }
    
    public boolean contiene(T dato){
        boolean resp = false;        
        Nodo<T> apuntador = primero;
        
        while (apuntador != null && !resp){
            resp = apuntador.getDato().equals(dato);
            apuntador = apuntador.getSig();
        }
        return resp;
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
}
