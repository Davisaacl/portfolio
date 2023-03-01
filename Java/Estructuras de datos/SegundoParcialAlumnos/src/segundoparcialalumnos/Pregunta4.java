/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialalumnos;

/**
 *
 * @author ZVIX0
 */
public class Pregunta4 {
    public static void main(String args[]) {
        System.out.print("El mínimo común múltiplo de 1 y 5 es: ");
        // Debería imprimir 5:
        System.out.println(mcmR(1,5));
        
        System.out.print("El mínimo común múltiplo de 2 y 7 es: ");
        // Debería imprimir 14:
        System.out.println(mcmR(2,7));
        
        System.out.print("El mínimo común múltiplo de 12 y 9 es: ");
        // Debería imprimir 36:
        System.out.println(mcmR(12,9));
        
        System.out.print("El mínimo común múltiplo de 7 y 5 es: ");
        // Debería imprimir 35:
        System.out.println(mcmR(7,5));
        
        System.out.print("El mínimo común múltiplo de 50 y 1 es: ");
        // Debería imprimir 50:
        System.out.println(mcmR(50,1));
        
        System.out.print("El mínimo común múltiplo de 0 y 503 es: ");
        // Debería imprimir 0:
        System.out.println(mcmR(0,503));
        
        System.out.print("El mínimo común múltiplo de 13 y 13 es: ");
        // Debería imprimir 13:
        System.out.println(mcmR(13,13));

        System.out.print("El mínimo común múltiplo de 5 y 10 es: ");
        // Debería imprimir 10:
        System.out.println(mcmR(5,10));
        
        System.out.print("El mínimo común múltiplo de -1 y 13 es: ");
        // Debería imprimir un mensaje de error y luego -1:
        System.out.println(mcmR(-1,13));
    }
    
    public static int mcmR(int a,int b) {
        
        try{
            if (a==0 || b==0)
            return 0;
            if (a>0 && b>0){
                if (a>b){
                    return mcmR((a/b + a%b)*b,b);
                }
                else
                    return mcmR((b/a + b%a)*a,a);
            
            }
        }catch (Exception e){
            System.out.println(e + "No se puede hallar el mímimo común múltiplo de números negativos");
            return -1;
        }
        return 0;
        
    }
}
