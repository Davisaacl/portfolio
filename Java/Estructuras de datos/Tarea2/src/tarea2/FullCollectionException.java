/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author edi
 */
public class FullCollectionException extends RuntimeException{
    
    public FullCollectionException(){
        super("El estacionamiento está lleno");
    }
    
    public FullCollectionException(String mensaje){
        super(mensaje);
    }
}
