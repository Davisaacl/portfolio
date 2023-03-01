/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author David ISAAC
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche [] coches = new Coche[10];
        Estacionamiento itam = new Estacionamiento ("David", 5);
        
        coches[0]= new Coche("Andrés", 123456, "U78KLD");
        coches[1] = new Coche("Davi", 173993, "J27LJR");
        coches[2] = new Coche("Dav", 173993, "H27LJR");
        coches[3] = new Coche("Da", 173993, "P27LJR");
        coches[4] = new Coche("André", 173993, "R27LJR");
        coches[5] = new Coche("Anders", 173993, "G27LJR");
        coches[6] = new Coche("And", 173993, "B27LJR");
        coches[7] = new Coche("Ann", 173993, "A27LJR");
        coches[8] = new Coche("ders", 173993, "L27LJR");
        coches[9] = new Coche("David", 173993, "M27LJR");
        
        System.out.println(coches[0].toString());
        System.out.println(itam.agregaCoche(coches, "U78KLD", 10));
        System.out.println(itam.agregaCoche(coches, "J27LJR", 10));
        System.out.println(itam.agregaCoche(coches, "H27LJR", 10));
        System.out.println(itam.agregaCoche(coches, "P27LJR", 10));
        
      
   
        
    }
    
}
//(((Coche)coches.peek()).getPlacas()==placas)
