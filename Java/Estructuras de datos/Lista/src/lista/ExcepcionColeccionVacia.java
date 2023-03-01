/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Shanti
 */
public class ExcepcionColeccionVacia extends RuntimeException {

    /**
     * Constructor sin parametros
     */
    public ExcepcionColeccionVacia() {
        super("Colección Vacía");
    }
    
    /**
     * Constructor con parametros
     * @param mensaje Mensaje en caso de atrapar expeción
     */
    public ExcepcionColeccionVacia(String mensaje) {
        super (mensaje);
    }
}
