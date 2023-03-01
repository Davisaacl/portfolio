/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadordepromedios;

import java.util.Scanner;

/**
 *
 * @author edi
 */
public class CalculadorDePromedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr;
        String dato;
        int intDato = 0;
        double res;
        Scanner lee = new Scanner(System.in);
        boolean datoCorrecto = false;
        while(!datoCorrecto){
            System.out.print("¿Cuántos datos van a ser? ");
            dato = lee.next();
        
            try{
                intDato =Integer.parseInt(dato);
                datoCorrecto = true;
                
            }
            catch (Exception e){
                System.out.println("El dato debe ser entero");
            
            }
        }
        arr = new int[intDato];
        for (int i=0;i<=arr.length;i++){
            datoCorrecto = false;
            while(!datoCorrecto){
                System.out.print("Indique el dato "+ (i+1) +" ; ");
                dato = lee.next();
                try{
                    arr[i] = Integer.parseInt(dato);
                    datoCorrecto = true;
                }
                catch(NumberFormatException e){
                    System.out.println("El dato debe ser entero");
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Mi diseñador no sabe programar... está queriendo acceder a una posición inexistente del arreglo.");
                    datoCorrecto = true;
                }
            }
            
            //arr[i] = intDato;
        }
        res = calculaPromedio(arr);
        System.out.println(res);
        
        
    }
    
    public static double calculaPromedio(int [] a){
        double suma=0;
        
        for (int i=0;i<a.length;i++)
            suma+=a[i];               //suma = suma + arr[i];
        return suma/a.length;
        
    }
}
