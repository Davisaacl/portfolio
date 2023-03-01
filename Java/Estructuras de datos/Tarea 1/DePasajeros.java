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
public class DePasajeros extends Camion{
    private int totPasajeros;

    public DePasajeros() {
    }

    public DePasajeros(int totPasajeros) {
        this.totPasajeros = totPasajeros;
    }

    public DePasajeros(int totPasajeros, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.totPasajeros = totPasajeros;
    }

    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("Total de Pasajeros: " + totPasajeros);
        return cad.toString();
    }
   
    
    
}