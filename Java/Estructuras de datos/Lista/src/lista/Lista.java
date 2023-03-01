/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author edi
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca prueba = new Biblioteca("Hola","Lago Andrómaco 53", 1978);
        
        ClaveDeCatalogo l1,l2,l3,l4,l5;
        l1 = new ClaveDeCatalogo (36.5,"HJQ");
        l2 = new ClaveDeCatalogo (78.5,"HJQ");
        l3 = new ClaveDeCatalogo (34.22,"LEK");
        l4 = new ClaveDeCatalogo (34.22,"LAK");
        l5 = new ClaveDeCatalogo (209.71,"ABC");
        
        prueba.agregaNuevoLibro(l1);
        prueba.agregaNuevoLibro(l2);
        prueba.agregaNuevoLibro(l3);
        prueba.agregaNuevoLibro(l4);
        prueba.agregaNuevoLibro(l5);
        
    }
    
}
