/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author David ISAAC
 */
public class ArrayStackLimitada <T> extends ArrayStack<T>{
    private int capacidad;
    
    public ArrayStackLimitada(int capacidad) {
        super(capacidad);

    }
 
/*
    public void push(T dato){
        if(!ifFull()){
            super.push(dato);
            }else
                throw IndexOutOfBoundsException("Está llena la pila");
    }

*/
    public boolean isFull(){
	boolean res = false;
	    
	    if(super.getPilaLenght()-1==capacidad)
		res = true;
	return res;
    }

    



}


