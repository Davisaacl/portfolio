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
public class Empleado extends PersonaITAM{
    private double salario;
    private String horario;
    private int extension;

    public Empleado(double salario, String horario, int extension, int cu, String nombre, String direccion, int genero, String telefono) {
        super(cu, nombre, direccion, genero, telefono);
        this.salario = salario;
        this.horario = horario;
        this.extension = extension;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder("");
        
        cad.append(super.toString());
        cad.append("Salario: " + salario);
        cad.append("Extensión; " + extension);
        cad.append("Horario: " + horario);
        return cad.toString();
    }
    
}
