/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primerparcialalumnos;

/**
 *
 * @author agomezdg
 */
public class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException(){
        super("La colección está vacía");
    }

    public EmptyCollectionException(String mensaje){
        super("La colección está vacía: "+mensaje);
    }
}
