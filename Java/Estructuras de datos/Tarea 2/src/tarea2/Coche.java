/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Objects;

/**
 *
 * @author David ISAAC
 */
public class Coche {
    String nombrePropietario;
    int claveUnica;
    String placas;

    public Coche() {
    }
    
    public Coche(String nombrePropietario, int claveUnica, String placas) {
        
        if(verificaClaveUnica(claveUnica) && verificaPlacas(placas)){
             this.nombrePropietario = nombrePropietario;
             this.claveUnica = claveUnica;
             this.placas = placas;
        }
    
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
        
        cad.append("Nombre del propietario: "  + nombrePropietario+ "\t");
        cad.append("Clave Única: "  +claveUnica+ "\t");
        cad.append("Placas: "  + placas+ "\t");
        return cad.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
    
    public boolean verificaPlacas(String placas){
        boolean res = false;
        char primera, segunda, tercera;

        tercera = placas.charAt(2);
        if(placas.length()==6){
            primera = placas.charAt(0);
            if(Character.isUpperCase(primera) && (primera!='I' || primera!='O')){
                segunda = placas.charAt(1);
                tercera = placas.charAt(2);
                if (Character.isDigit(segunda) && Character.isDigit(tercera)){
                    primera = placas.charAt(3);
                    segunda = placas.charAt(4);
                    tercera = placas.charAt(5);
                    if (Character.isUpperCase(primera) && Character.isUpperCase(segunda) && Character.isUpperCase(tercera))
                        if ((primera!='I' || primera!='O') && (segunda!='I' || segunda!='O') && (tercera!='I' || tercera!='O'))
                        res = true; 
                }
            }
        }
        return res;
    }
    
    public boolean verificaClaveUnica(int claveUnica){
        boolean res = false;
        
        if (Integer.toString(claveUnica).length()==6 && claveUnica>0)
            res = true;
        return res;
    }
    
}
// número entero positivo de
//seis dígitos que representa la clave única de la persona asociada con el ITAM que conducirá el coche
