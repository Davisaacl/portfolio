/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatostring;

/**
 *
 * @author edi
 */
public class X {
    private int atrib;
    
    public X(int x){
        this.atrib = x;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(atrib);
        return cad.toString();
    }
    
    
}
