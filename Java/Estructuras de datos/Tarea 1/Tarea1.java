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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpresaMinera minaUno = new EmpresaMinera ("Minar");
        
        //Dar alta camiones
        minaUno.nuevoCamionPasajero(25, "BMW", "2.2L", "UH2");
        minaUno.nuevoCamionPasajero(27, "BMW", "2.2L", "UH3");
        minaUno.nuevoCamionVolteo(4.5, "Mercdes", "5.5L", "25H");
        minaUno.nuevoCamionVolteo(4.8, "BMW", "5.6L", "25J");
        
        System.out.println(minaUno.infoCamionesPasajeros());
        
        System.out.println(minaUno.infoCamionesVolteo());
        
        minaUno.nuevaCapacidadVolteo("25H", 4.8);
        System.out.println(minaUno.infoCamionesVolteo());
        
        System.out.println(minaUno.cuantosDePasajerosMarca("BMW"));
        
        System.out.print(minaUno.totTransportarTierra());
    }
    
}
