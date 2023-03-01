/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3andrés;

/**
 *
 * @author edi
 */
public class Tarea3Andrés {

    public static String cifraMensajeCesar(String mensaje, ColaA<Integer> llave){
        StringBuilder cad = new StringBuilder("");
        int aux=0;
        int llaveFirst=0;
        
        for (int i=0;i<mensaje.length();i++){
            
            if (mensaje.charAt(i)!=' '){
                aux = llave.dequeue();
                if (i==0)
                    llaveFirst = aux;
                llave.enqueue(aux);
                if (mensaje.charAt(i) + aux > 'Z'){
                    cad.append((char)(mensaje.charAt(i) + aux - 26));
                } else {
                    if (mensaje.charAt(i) + aux < 'A'){
                        cad.append((char)(mensaje.charAt(i) + aux + 26));
                    } else
                        cad.append((char)(mensaje.charAt(i) + aux));
                }
            } else
                cad.append(' ');
            
            
        }
        while (llaveFirst!=llave.first()){
            llave.enqueue(llave.dequeue());
        }
        
    return cad.toString();
    }
    
    public static String descifraMensajeCesar(String mensaje, ColaA<Integer> llave){
        StringBuilder cad = new StringBuilder("");
        int aux = 0;
        int llaveFirst = ' ';
        
        for (int i=0;i<mensaje.length();i++){
            
            if (mensaje.charAt(i)!=' '){
                aux = llave.dequeue();
                if (i==0)
                    llaveFirst = aux;
                
                llave.enqueue(aux);
                
                if (mensaje.charAt(i) - aux > 'Z'){
                    cad.append((char)(mensaje.charAt(i)- aux - 26));
                } else {
                    if (mensaje.charAt(i) - aux < 'A'){
                        cad.append((char)(mensaje.charAt(i)- aux + 26));
                    }
                    else
                        cad.append((char)(mensaje.charAt(i) - aux));
                }
            }
            else
                cad.append(' ');
            
        }
        while (llaveFirst!=llave.first()){
            llave.enqueue(llave.dequeue());
        }
        return cad.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ColaA llaveEn = new ColaA<Integer>(); 
        
        llaveEn.enqueue(17);
        llaveEn.enqueue(6);
        llaveEn.enqueue(25);
        llaveEn.enqueue(-13);
        llaveEn.enqueue(-8);
        llaveEn.enqueue(4);
        
        //char pruebaAscii = 'A';
        
        //int prueba = (int) pruebaAscii;
        
        //System.out.println(prueba);
        
        System.out.println("ITAM");
        
        String prueba2 = cifraMensajeCesar("ITAM", llaveEn);
        System.out.println(prueba2);
        
        
        prueba2 = descifraMensajeCesar(prueba2,llaveEn);
        System.out.println(prueba2);
        
        prueba2 = descifraMensajeCesar("DK FHKXRT KNK IJZQHUXLXZF VI UGSBK", llaveEn);
        System.out.println(prueba2);
        
        
    }
    
}
