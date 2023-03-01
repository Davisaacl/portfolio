/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author DLOPEZRO
 */
public class DeVolteo extends Camion{
    public double capacidadTon;

    public DeVolteo() {
    }

    public DeVolteo(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }

    public DeVolteo(double capacidadTon, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("Capacidad de Toneladas: " + capacidadTon);
        return cad.toString();
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }
    
    
}
