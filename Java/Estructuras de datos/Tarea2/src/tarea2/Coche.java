/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Objects;

/**
 *
 * @author edi
 */
public class Coche {
    String nombrePropietario;
    int claveUnica;
    String placas;

    public Coche() {
    }
    
    public Coche(String nombrePropietario, int claveUnica, String placas) {
        
        
        this.nombrePropietario = nombrePropietario;
        this.claveUnica = claveUnica;
        this.placas = placas;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public int getClaveUnica() {
        return claveUnica;
    }

    public String getPlacas() {
        return placas;
    }

    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Nombre del propietario: " + "\t" + nombrePropietario);
        cad.append("Clave Única: " + "\t" +claveUnica);
        cad.append("Placas: " + "\t" + placas);
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }
    
    
}
