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
import java.util.Scanner;

public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        String placas;
        double nuevaCapacidad;
        String dato;
        boolean datoCorrecto = false;
        
        EmpresaMinera minaUno = new EmpresaMinera ("Minar");
        
        //Dar alta camiones
        minaUno.nuevoCamionPasajero(25, "BMW", "2.2L", "UH2");
        minaUno.nuevoCamionPasajero(27, "BMW", "2.2L", "UH3");
        minaUno.nuevoCamionVolteo(4.5, "Mercdes", "5.5L", "25H");
        minaUno.nuevoCamionVolteo(4.8, "BMW", "5.6L", "25J");
        
        //a)
        System.out.println(minaUno.infoCamionesPasajeros());
        //b)
        System.out.println(minaUno.infoCamionesVolteo());
        
        System.out.println("Puedes cambiarle la capacidad a un camión de volteo, elige a cuál por sus placas");
        placas = lee.next();
        
        while(!datoCorrecto){
            System.out.print("Ingresa la capacidad ");
            dato = lee.next();
            try{
                nuevaCapacidad = Double.parseDouble(dato);
                if (nuevaCapacidad>0){
                    minaUno.nuevaCapacidadVolteo(placas, nuevaCapacidad);
                    datoCorrecto = true;
                }
                else{
                    System.out.println("Debe ser positivo");
                }
            }
            catch (Exception e){
                System.out.println("El dato debe ser un número real");
            
            }
        }
        //c)
        System.out.println(minaUno.infoCamionesVolteo());
        
        //d)
        System.out.println(minaUno.cuantosDePasajerosMarca("BMW"));
        //e)
        System.out.print(minaUno.totTransportarTierra());
    }
    
}
