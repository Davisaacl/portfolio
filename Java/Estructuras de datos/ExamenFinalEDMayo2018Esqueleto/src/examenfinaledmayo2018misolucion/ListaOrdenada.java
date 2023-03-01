/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaledmayo2018misolucion;

import java.util.*;

public class ListaOrdenada<T extends Comparable<T>> implements Iterable<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    
    public ListaOrdenada() {
        primero=null;
        ultimo=null;
    }
    
    public void add(T dato) {
        NodoDoble<T> nuevo=new NodoDoble(dato);        
        // Si está vacía la lista:
        if(primero==null) {
            primero=nuevo;
            ultimo=nuevo;
        }
        // En caso contrario, si hay un solo nodo en la lista:
        else if(primero==ultimo) {
            // Hay que insertar a la izq. del nodo si el valor a agregar es
            // menor que el que está en el nodo:
            if(dato.compareTo(primero.getDato())<0) {
                nuevo.setDer(primero);
                primero.setIzq(nuevo);
                primero=nuevo;
            }
            // En caso contrario hay que insertar a la der. del nodo:
            else {
                primero.setDer(nuevo);
                nuevo.setIzq(primero);
                ultimo=nuevo;
            }
        }
        // En caso contrario hay que buscar el primer nodo que tenga un valor
        // mayor al valor que se va a agregar (ahí se detendrá "aux"):
        else {
            NodoDoble<T> aux=primero;
            while(aux!=null&&dato.compareTo(aux.getDato())>0)
                aux=aux.getDer();
            // Si "aux" resulta ser "primero" quiere decir que hay que insertar
            // el nuevo valor a la izq. de todos los que ya estaban:
            if(aux==primero) {
                nuevo.setDer(primero);
                primero.setIzq(nuevo);
                primero=nuevo;
            }
            // En caso contrario, si "aux" resulta ser igual a "null" quiere
            // decir que hay que insertar el nuevo valor a la der. de todos los
            // que ya estaban:
            else if(aux==null) {
                ultimo.setDer(nuevo);
                nuevo.setIzq(ultimo);
                ultimo=nuevo;
            }
            // En caso contrario hay que insertar en algún lugar intermedio de
            // la secuencia de nodos enlazados:
            else {
                nuevo.setIzq(aux.getIzq());
                nuevo.getIzq().setDer(nuevo);
                aux.setIzq(nuevo);
                nuevo.setDer(aux);
            }
        }
    }
    //metodo auxiliar cont tamaño
    
    public int contTam(){
        return contTam(0,primero);
    }
    
    public int contTam(int cont,NodoDoble<T>ap){
        if(ap==null)
            return cont;
        else{
            while(ap!=null){
                ap=ap.getDer();
            return contTam(cont+1,ap);
            }
        }
        return cont;
    }
    public void combina1(ListaOrdenada<T> lista) {
        if(lista!=null && !isEmpty()){
            T dato=null;
           Iterator<T> it1=lista.iterator();
           Iterator<T> actual= iterator();
           if(this.contTam()==lista.contTam()){
          while(it1.hasNext()){
              dato=it1.next();
               if(dato!=null)
               this.add(dato);
            }
          }//si ambas son del mismo tamaño
           else if(this.contTam()>lista.contTam()){
               if(lista.primero.getDer()==null){//sólo hay un nodo
                   if(dato!=null){
                   dato=lista.primero.getDato();
                   this.add(dato);
                   }//si el dato no es nulo
               }else{
                   while(it1.hasNext()){
                       dato=it1.next();
                       if(dato!=null)
                           this.add(dato);
                   }
               }//si hay más de un nodo
           }else{//si la actual es más grande
               while(actual.hasNext()){
                   dato=it1.next();
                       if(dato!=null)
                           this.add(dato);
               }
           }//la actual es la más chica
        }
    }
    public boolean isEmpty(){
        return primero==null;
    }
        
    public void combina(ListaOrdenada<T> lista) {
        if(lista!=null && !isEmpty()){
            T dato = null;
            T compara;
          if(lista.primero.getDer()==null){//solo hay un nodo
              dato=lista.primero.getDato();
              while(this.primero!=null){
                  compara=this.primero.getDato();
                          if(dato.compareTo(compara)<0){//el dato de la otra es menor a la actual
                            lista.primero.setDer(this.primero);
                            this.primero.setIzq(lista.primero);
                            primero=lista.primero;
                              System.out.println(this.toString());
                          }
                          else{
                              if(dato.compareTo(compara)>0){//el dato de la otra es mayor a la actual
                             this.ultimo.setDer(lista.primero);
                             lista.primero.setIzq(this.ultimo);
                             ultimo=lista.primero;
                             System.out.println(this.toString());
                                }
                              }
                          this.primero.getDer();
                          }
              }//solo hay un nodo
        }else if(this.primero.getDer()==null){//actual tiene un nodo
            T dato,compara;
            while(lista.primero!=null && this.primero!=null){
             dato=this.primero.getDato();
             compara=lista.primero.getDato();
             if(dato.compareTo(compara)<0){//el actual es enor a otro
                 this.primero.setDer(lista.primero);
                 lista.primero.setIzq(this.primero);
                 primero=this.primero;
                 System.out.println(this.toString());
             }
             
            }//el actual sólo tiene un nodo
        }else{
            T dato = null,compara = null;
            while(this.primero!=null && dato.compareTo(compara)<0){ //dato de actual sea menor el otro
                System.out.println(this.toString());
            }
        }// están en medio
        }
    
    public Iterator<T> iterator() {
        return new IteradorLista(primero);
    }

    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        NodoDoble<T> aux=primero;
        
        while(aux!=null) {
            sb.append(aux.getDato().toString()+"\n");
            aux=aux.getDer();
        }
        
        return sb.toString();
    }
    
  
}
