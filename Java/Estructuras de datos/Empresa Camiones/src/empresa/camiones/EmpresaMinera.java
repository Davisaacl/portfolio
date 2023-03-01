/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.camiones;

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
    //a)
    public String infoCamionesPasajeros(int numCamiones){ //
        StringBuilder cad = new StringBuilder();
        
        for (int i=0;i<numCamiones;i++){
            if(camiones[i] instanceof DePasajeros)
                cad.append(((DePasajeros)camiones[i]).toString());
        }
        return cad.toString();
    }
    //b)
    public String infoCamionesVolteo(){
         StringBuilder cad = new StringBuilder();
        
        for (int i=0;i<totCamiones;i++){
            if(camiones[i] instanceof DeVolteo)
                cad.append(((DeVolteo)camiones[i]).toString());
        }
        return cad.toString();
    }
    //c)
    public double nuevaCapacidadVolteo(String placa, double capacidad){
        int i=0;
        
        while (i<totCamiones && (camiones[i] instanceof DeVolteo) && (camiones[i].getPlacas().equals(placa))){
            if (camiones[i].getPlacas().equals(placa)){
                ((DeVolteo)camiones[i]).capacidadTon = capacidad;
                i=totCamiones;
            }
            else{
                i++;
            }
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
        int totTierra = 0;
        
        for (int i=0;i<totCamiones;i++){
            if(camiones[i] instanceof DeVolteo)
                totTierra += ((DeVolteo)camiones[i]).capacidadTon;
        }
        return totTierra;
    }

}
/*
d) calcular e imprimir la cantidad total de camiones de pasajeros que sean de una marca
específica (el usuario indicará cuál), y 
e) calcular e imprimir la cantidad total de toneladas de tierra que 
puede ser transportada simultáneamente (por todos los camiones
de volteo de la empresa).

*/