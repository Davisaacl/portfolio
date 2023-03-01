
package exfinaledmayo2017esqueleto;

import java.util.Iterator;

/**
 *
 * @author 
 */
public class Empresa {
    private String nombre;
    private ListaDesordenada<Camion> lisCamiones;

    public Empresa() {
        lisCamiones = new ListaDesordenada();
    }

    public Empresa(String nombre) {
        this();
        this.nombre = nombre;
    }

    //Método que debes escribir para resolver el inciso 3:
    public int incrementaPasajerosPorMarca(String marca, int incremento){
        int totIncremento = 0;
        int pasajeAnt, nuevoPasaje;
        
        for (int i=0;i<lisCamiones.size();i++){
            if (lisCamiones.getElemento(i) instanceof DePasajeros){
                if (lisCamiones.getElemento(i).getMarca().equals(marca)){
                    pasajeAnt =((DePasajeros)lisCamiones.getElemento(i)).getTotalPasaje();
                    nuevoPasaje = pasajeAnt + incremento;
                    ((DePasajeros)lisCamiones.getElemento(i)).setTotalPasaje(nuevoPasaje);
                    totIncremento+=incremento;
                }    
            }
        }
        return totIncremento;
    }
    
    /*
    El método debe sumar
    el número recibido a la cantidad de pasajeros de todos los camiones de pasajeros
    que sean de la marca especificada. El método debe regresar un entero que
    representa la cantidad total de cambios realizados. 

*/
   
    public boolean altaCamion(String marca, String numMotor, String placas, int totalPasaje){
        DePasajeros nuevo = new DePasajeros(totalPasaje, marca, numMotor, placas);
        boolean resp = false;
        
        if(!lisCamiones.contiene(nuevo)){
            resp = true;
            lisCamiones.agregaFinal(nuevo);
        }
        return resp;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double capacidadTon){
        DeVolteo nuevo = new DeVolteo(capacidadTon, marca, numMotor, placas);
        boolean resp = false;
        
        if(!lisCamiones.contiene(nuevo)){
            resp = true;
            lisCamiones.agregaFinal(nuevo);
        }
        return resp;
    }
    
    public String generaReporteCamiones(){
        return lisCamiones.toString();
    }
}
