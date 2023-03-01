/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg12;

import java.util.ArrayList;
/**
 *
 * @author edi
 */
public class MetodosPila {
    
    public static <T> void inviertePila(PilaA pila){
        PilaA p;
        p = new PilaA();
        
        while (!pila.isEmpty())
            p.push(pila.pop());
        pila = p;
    }
    
    public static <T> void eliminaRepetidos(PilaA pila){
        ArrayList lista;
        int cont;
        
        cont=0;
        lista = new ArrayList<T>();
        while (!pila.isEmpty()){
            lista.add(pila.pop());
            cont++;
            if(cont!=1 && lista.get(cont).equals(lista.get(cont-1))){
                lista.remove(cont);
            }
        }
        while (cont>0)
            pila.push(lista.get(cont));
    }
    
    public static void compararPilas(){
   
    }
    
    public static<T>boolean equals(PilaADT<T> pila1, PilaADT<T> pila2){
        if(pila1 == null || pila2 == null)
            throw new NullPointerException();
        if(pila1.isEmpty() || pila2.isEmpty())
            throw new EmptyCollectionException();
        
        boolean res = true;
        PilaADT<T> aux1 = new PilaA();
        PilaADT<T> aux2 = new PilaA();
        while(!pila1.isEmpty() && res && !pila2.isEmpty()){
            if(pila1.peek().equals(pila2.peek())){
                aux1.push(pila1.pop());
                aux2.push(pila2.pop());
            }
            else{
                res = false;
            }
        }
        return res;
    }
}
