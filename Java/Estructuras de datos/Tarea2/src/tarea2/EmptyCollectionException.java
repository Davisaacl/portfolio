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
public class EmptyCollectionException extends RuntimeException{
    
    public EmptyCollectionException(){
        super("El estacionamiento está vacío");
    }
    
    public EmptyCollectionException(String mensaje){
        super(mensaje);
    }
    
}
