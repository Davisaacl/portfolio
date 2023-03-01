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
public interface UnorderedListADT <T> extends ListADT <T>{
    public void addToFront(T dato);
    public void addToRear(T dato);
    public void addAfter(T datoNuevo, T datoViejo);
    
}
