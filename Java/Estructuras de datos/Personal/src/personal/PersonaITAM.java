/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author edi
 */
public class PersonaITAM {
    private int claveUnica;
    private String nombre;
    private String direccion;
    private int genero;
    private String telefono;
    
    public PersonaITAM(){
        
    }

    public PersonaITAM(int cu, String nombre, String direccion, int genero, String telefono) {
        claveUnica = cu;            // no es necesario "this." si tienen nombre diferente
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder("");
        
        cad.append ("Nombre: \n" + nombre);
        cad.append ("Clave Única \n" + claveUnica);
        cad.append ("Dirección: \n" + direccion);
        cad.append ("Género: \n" + genero);
        cad.append ("Teléfono: \n" + telefono);
        return cad.toString();
    }
    
     
    
    
}
