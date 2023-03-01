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
    
    public static int cifraMensaje(String mensaje){
        ArrayQueue llave = new ArrayQueue <Integer>();
        char letra;
        int valorLetra, aux;
        StringBuilder cad = new StringBuilder("");
        
        for (int i=0;i<mensaje.length();i++){
            letra = mensaje.charAt(i);
            if (letra != ' '){
                valorLetra = (int)letra;
                aux = valorLetra%26;
                if (aux==0){
                    cad.append(mensaje.charAt(i));
                }
                else{
                    
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        
        char pruebaAscii = 'A';
        
        int prueba = (int) pruebaAscii;
        
        System.out.println(prueba);
       
    }
    
}
