/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author edi
 */
public class Cola {
    
    // Cada vez que se supera el recorrimiento de 26, regresamnos al inicio
    // A = 65
    // A es congruente con 39 modulo 26
    
    public static ArrayQueue invierteCola(ArrayQueue cola){        
        
        if (cola!=null){
            ArrayQueue aux = new ArrayQueue();
            while (!cola.isEmpty()){
                aux.enqueue(cola.dequeue());
            }
            while(!aux.isEmpty())
                cola.enqueue(aux.dequeue());
        }
        return cola;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayQueue prueba = new ArrayQueue();
        
        prueba.enqueue(2);
        prueba.enqueue(5);
        prueba.enqueue(6);
        
        System.out.println(prueba.toString());
       
    }
    
}
