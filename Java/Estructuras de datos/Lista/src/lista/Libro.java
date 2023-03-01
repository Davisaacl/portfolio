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
public class Libro {
    private String autor;
    private String titulo;
    private String casaEdtorial;
    private int yearPublicacion;
    private ClaveDeCatalogo claveUnica;

    public Libro(String autor, String titulo, String casaEdtorial, int yearPublicacion, ClaveDeCatalogo claveUnica) {
        this.autor = autor;
        this.titulo = titulo;
        this.casaEdtorial = casaEdtorial;
        this.yearPublicacion = yearPublicacion;
        this.claveUnica = claveUnica;
    }
    
    public Libro (ClaveDeCatalogo claveUnica){
        this.claveUnica = claveUnica;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCasaEdtorial() {
        return casaEdtorial;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public ClaveDeCatalogo getClaveUnica() {
        return claveUnica;
    }  
    
    public int compareTo(Libro otro){
        int res = 0;
        
        res = (int)(this.claveUnica.getClaveNum()-otro.getClaveUnica().getClaveNum());
        return res;
    }
}
