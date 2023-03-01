/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author david
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedOrderedList <Integer> prueba = new LinkedOrderedList<Integer>();
        
        prueba.add(4);
        prueba.add(1);
        prueba.add(2);
        prueba.add(0);
        prueba.add(-38172430);
        
        System.out.println(prueba.toString());
        //System.out.println(prueba.size());
        
        
        prueba.datos.eliminaDato(1);
        System.out.println(prueba.toString());
        prueba.datos.eliminaDato(4);
        
        System.out.println(prueba.toString());
        
        prueba.datos.eliminaDato(2);
        System.out.println(prueba.toString());
        
        prueba.datos.eliminaDato(0);
        System.out.println(prueba.toString());
        System.out.println(prueba.isEmpty());
        System.out.println(prueba.size());

    }
    
}
