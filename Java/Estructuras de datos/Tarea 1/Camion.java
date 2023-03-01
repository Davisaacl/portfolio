/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Objects;

/**
 *
 * @author DLOPEZRO
 */
public class Camion {
    private String marca;
    private String numMotor;
    private String placas;

    public Camion() {
    }

    public Camion(String marca, String numMotor, String placas) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Marca: " + marca);
        cad.append("Número de motor: " + numMotor);
        cad.append("Placas " + placas);
        return cad.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlacas() {
        return placas;
    }
    
    
}