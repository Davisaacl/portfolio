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
public class Biblioteca{
    
    private String nombre;
    private String direccion;
    private int yearFundacion;
    private OrderedListADT listaLibro;

    public Biblioteca(){
        listaLibro = new LinkedOrderedList ();
    }
    
    public Biblioteca(String nombre, String direccion, int yearFundacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.yearFundacion = yearFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }
    
    public void agregaNuevoLibro(ClaveDeCatalogo claveLibro){
        
        Libro nuevo = new Libro(claveLibro);
        listaLibro.add((Comparable) nuevo);
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n" + nombre);
        cad.append("\n" + direccion);
        cad.append("\n" + yearFundacion);
        cad.append("\n" + listaLibro);
        cad.append(listaLibro.toString());
        return cad.toString();
    }
}
