/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author edi
 */
public class EmpresaMinera {
    private String nombre;
    private int totCamiones;
    private Camion [] camiones;
    private final int MAX = 50;

    public EmpresaMinera() {
        camiones = new Camion[MAX];
        totCamiones = 0;
    }

    public EmpresaMinera(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public boolean nuevoCamionPasajero(int totPasajeros, String marca, String numMotor, String placas){
        DePasajeros a;
        boolean res = false;
        
        if(totCamiones<MAX){
            a = new DePasajeros(totPasajeros, marca, numMotor, placas);
            camiones[totCamiones] = a;
            totCamiones++;
            res = true;
        }
        return res;
    }
    public boolean nuevoCamionVolteo(double capacidadTon, String marca, String numMotor, String placas){
        DeVolteo a;
        boolean res = false;
        
        if(totCamiones<MAX){
            a = new DeVolteo(capacidadTon, marca, numMotor, placas);
            camiones[totCamiones] = a;
            totCamiones++;
            res = true;
        }
        return res;
    }
    //a)
    public String infoCamionesPasajeros(){ //
        StringBuilder cad = new StringBuilder();
        
        for (int i=0;i<totCamiones;i++){
            if(camiones[i] instanceof DePasajeros)
                cad.append("\n" + ((DePasajeros)camiones[i]).toString());
        }
        return cad.toString();
    }
    //b)
    public String infoCamionesVolteo(){
         StringBuilder cad = new StringBuilder();
        
        for (int i=0;i<totCamiones;i++){
            if(camiones[i] instanceof DeVolteo)
                cad.append("\n" + ((DeVolteo)camiones[i]).toString());
        }
        return cad.toString();
    }
    //c)
    public double nuevaCapacidadVolteo(String placa, double capacidad){
        int i=0;
        
        while (i<totCamiones && !(camiones[i].getPlacas().equals(placa))){
            i++;
            }
            if(i<totCamiones){
                ((DeVolteo)camiones[i]).setCapacidadTon(capacidad);
            }
        return capacidad;
 
    }
    //d)
    public int cuantosDePasajerosMarca(String marca){
        int cont = 0;
        
        for (int i=0;i<totCamiones;i++){
            if (camiones[i] instanceof DePasajeros && camiones[i].getMarca().equals(marca))
               cont++;    
        }
        return cont;
    }
    //e)
    public double totTransportarTierra(){
        double totTierra = 0;
        
        for (int i=0;i<totCamiones;i++){
            if(camiones[i] instanceof DeVolteo)
                totTierra += ((DeVolteo)camiones[i]).getCapacidadTon();
        }
        return totTierra;
    }

} 