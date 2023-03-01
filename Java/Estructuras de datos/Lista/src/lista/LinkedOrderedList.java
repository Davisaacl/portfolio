/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.Iterator;

/**
 *
 * @author edi
 */
public class LinkedOrderedList <T extends Comparable<T>> extends LinkedList <T> implements OrderedListADT <T>{
    
    public LinkedOrderedList(){
        super();
    }
    /*
    public void add(T dato){
        if (!isEmpty()){
            Nodo <T> anterior = datos.getPrimero();
            Nodo <T> actual = datos.getPrimero();
            Nodo <T> siguiente = datos.getPrimero();
            while (siguiente!=null && siguiente.getDato().compareTo(dato)<0){
                anterior = actual;
                actual = siguiente;
                siguiente = siguiente.getSig();
            }
            if (!actual.getDato().equals(dato)){
                if(actual.equals(datos.getPrimero()))
                    datos.agregaAlInicio(dato);
                else
                    datos.agregaDespuesDe(actual.getDato(), dato);
            }
        }
        else{
            datos.agregaAlInicio(dato);
        }  
    }
    */
    
    public void add (T dato){
        if (dato != null){
            if (datos.isEmpty()){
                datos.agregaAlInicio(dato);
            }
            else {
                Nodo<T> anterior = datos.getPrimero();
                Nodo<T> actual = datos.getPrimero();
                int cont = 0;
                while (actual!=null && actual.getDato().compareTo(dato)<0){
                    anterior = actual;
                    actual = actual.getSig();
                    cont++;
                }
                if (cont==0){
                    datos.agregaAlInicio(dato);
                }
                    
                else if (!actual.getDato().equals(dato)){
                    datos.agregaDespuesDe(anterior.getDato(), dato);
                }
                    
                    
            }
        }
    }
    // if (!actual.getDato().equals(dato) && !actual.equals(datos.getPrimero()))
    /*
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
    */
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        T var = null;
        
        Nodo<T> aux = datos.getPrimero();
        
        while (aux!=null){
            cad.append(aux.getDato().toString() + "\n");
            aux = aux.getSig();
        }
        return cad.toString();
            
    }
    
    
}
