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
public class Profesor extends Empleado{
    private String [] materias;
    private final int MAX = 10;

    public Profesor(double salario, String horario, int extension, int cu, String nombre, String direccion, int genero, String telefono) {
        super(salario, horario, extension, cu, nombre, direccion, genero, telefono);
        this.materias = new String[MAX];
        
    }
    
    
    
}
