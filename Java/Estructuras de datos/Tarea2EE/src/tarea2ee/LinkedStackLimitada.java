/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ee;

/**
 *
 * @author David ISAAC
 */
public class LinkedStackLimitada <T> extends LinkedStack<T>{
    private int capacidad;
    private int ocupados;
    
    public LinkedStackLimitada(int capacidad) {
        this.capacidad = capacidad;
        ocupados = 0;

    }
    
    public void push(T dato){
        if (ocupados<capacidad){
            super.push(dato);
            ocupados++;
        }
    }
    
    public T pop(){
        ocupados--;
        return super.pop();
    }
    
    public boolean isFull(){
        boolean res = false;
        if(ocupados==capacidad)
            res = true;
        return res;
    }
}


