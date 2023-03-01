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
public class ClaveDeCatalogo {
    private double claveNum;
    private String claveCad;

    public ClaveDeCatalogo(double claveNum, String claveCad) {
        this.claveNum = claveNum;
        this.claveCad = claveCad;
    }

    public double getClaveNum() {
        return claveNum;
    }

    public String getClaveCad() {
        return claveCad;
    }
    
    
}
