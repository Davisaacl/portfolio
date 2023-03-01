/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecursion;
import java.io.*;
import java.util.*;
/**
 *
 * @author edi
 */
public class PracticaRecursion {
    
    public static int calculaFactorial(int n){
        if(n==1 || n==0)
            return 1;
        else
            return n*calculaFactorial(n-1);
    }
    
    public static double sumaArreglo(double [] arr, int n){
        if (n==0)
            return 0;
        else
            return arr[n-1]+sumaArreglo(arr,n-1);
        
    }
    
    public static <T> void imprimeArregloDerechaIzquierda(T [] arr, int n){
        if (n>0)
            System.out.println(arr[n-1].toString());
            imprimeArregloDerechaIzquierda(arr,n-1);
    }
    
    private static <T> void imprimeArregloIzquierdaDerecha(T[] arr, int n, int i){
        
        if (i!=n){
            System.out.println(arr[i]);
            i++;
            imprimeArregloIzquierdaDerecha(arr,n,i);
        }
    
    }
    
    private static <T> void imprimeArregloIzquierdaDerecha2(T [] arr, int n){
        imprimeArregloIzquierdaDerecha2(arr,n-1);
        System.out.println(arr[n-1]);
    }
    
    public static <T> void imprimeArregloIzquierdaDerecha(T [] arr, int n){
        imprimeArregloIzquierdaDerecha(arr,n,0);
    }
    
    // Calcula el número de particiones de n
    // P(n,n)
    
    private static int calculaParticiones(int m, int n){
        int res = 0;
        
        if (m==1 || n==1)
            res = 1;
        else if (m<n)
            res += (1+calculaParticiones(m,m-1));
        else if (m>n)
            res += (calculaParticiones(m,n-1) + calculaParticiones(m-n,n));
        return res;
            
    }
    
    // cuenta palabras
    
    public static int cuentaPalabras (String nomArch){
        StringBuilder cad = new StringBuilder();
        int res = 0;
        
        try{
            File file = new File(nomArch);
            Scanner lee = new Scanner(file);
            lee.next();
            res += cuentaPalabras(nomArch);
            lee.close();
        }
        catch(Exception e){
            System.out.println("Error en la lectura del archivo");
            res = -1;
        }
        return res;
                
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // m=n=1
        System.out.println(calculaParticiones(1,1));
        
        //m<n
        System.out.println(calculaParticiones(1,2));
        
        //m>n
        System.out.println(calculaParticiones(5,5));
    }
    
}
