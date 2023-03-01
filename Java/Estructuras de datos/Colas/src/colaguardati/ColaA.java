/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaguardati;

/**
 *
 * @author edi
 */
public class ColaA <T> implements ColaADT <T>{
    private T cola[];
    private int frente, fin;
    private final int MAX = 10;

    /* Se construye un arreglo de Object y se lo convierte explícitamente a tipo T.
     * Inicialmente la cola está vacía, lo cual se indica con -1 en frente y fin.
     */
    public ColaA() {
        cola = (T[]) new Object[MAX];
        frente = -1;
        fin = -1;
    }
    
    public ColaA(int max) {
        cola = (T[]) new Object[max];
        frente = -1;
        fin = -1;
    }

    public void enqueue(T dato) {            
        if ((fin + 1) % cola.length  == frente) // Cola llena
                expandCapacity();
        else
            if (isEmpty())
                frente = 0;
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;      
    }

    private void expandCapacity(){
        T nuevo[] = (T[]) (new Object[cola.length * 2]);
        int j;
        
        j = 0;
        while (!isEmpty()){
            nuevo[j] = dequeue();
            j++;
        }
        cola = nuevo;
        frente = 0;
        fin = j - 1;
    }
    
    public boolean isEmpty() {
        return frente == -1;
    }

    public T first() {
        if (isEmpty())
            throw new EmptyCollectionException("Cola vacía");
        else
            return cola[frente];            
    }

    public T dequeue() {       
        if (isEmpty())
            throw new EmptyCollectionException("Cola vacía");
        else {
            T resul = cola[frente];
            if (frente == fin){  // Tiene un único elemento.
                frente = -1;
                fin = -1;
            }
            else
                frente = (frente + 1) % cola.length;
            return resul;
        }      
    }
}

