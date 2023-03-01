/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrecursividadandres;

/**
 *
 * @author edi
 */
public class EjerciciosRecursividadAndres {

    /**
     * @param args the command line arguments
     */
    
    // Ejercicio 1
    /*
    1) Imprimir los valores almacenados en un arreglo (lleno) de enteros de izquierda a derecha
(máximo dos variables).
    */
    public static void imprimeIzquierdaDerechaArrLleno (int [] a){
        imprimeIzquierdaDerechaArrLleno(a,0);
    }
    
    public static void imprimeIzquierdaDerechaArrLleno (int [] a, int i){
        if (i<a.length){
            System.out.print(a[i] + " ");
            imprimeIzquierdaDerechaArrLleno(a,i+1);
        }
        else
            System.out.println("");
    }
    
    //Ejercicio 2 
    /*
    Imprimir los valores almacenados en un arreglo (no lleno) de enteros de izquierda a
derecha (es decir, empezando por imprimir el valor que está en el índice 0 y terminando por
imprimir el valor que está en algún índice n, donde n<tam y tam es la cantidad de casillas
que contiene el arreglo) (máximo dos variables).
    */
    
    

    
    // Ejercicio 3
    /*
    3) Imprimir los valores almacenados en un arreglo (no lleno) de enteros de derecha a
izquierda (del valor que está en algún índice n al valor que está en el índice 0…ver notas en
el ejercicio 2 arriba) (máximo dos variables).
    */
    public static void imprimeDerechaIzquierdaArrNoLleno (int [] a, int n){
        if (n>0){
            System.out.print(a[n-1] + " ");
            imprimeDerechaIzquierdaArrNoLleno(a,n-1);
        }
        else
            System.out.println(" ");
    }
    
    // Ejercicio 4
    /*
    4) Sumar los valores almacenados en un arreglo (no lleno) de enteros (máximo dos
variables).
    */
    public static int sumaEnteros (int [] a, int n){
        if(n==0){
            return a[n];
            
        }else
            return a[n]+sumaEnteros(a,n-1);
    }
    
    // Ejercicio 5
    /*
    5) Contar cuántos valores impares hay en un arreglo (no lleno) de enteros (máximo dos
variables).
    */
    public static int contarImparesEnArreglo(int [] a, int n){
        
        if (n>=0){
            if (a[n]%2==0)
                return 1 + contarImparesEnArreglo(a, n-1);
            else 
                return 0 + contarImparesEnArreglo(a, n-1);
        }
        else
            return 0;
    }
    
    // Ejercicio 6
    /*
    6) Encontrar el valor máximo de los valores almacenados en un arreglo (no lleno) de
enteros (máximo tres variables).
    */
    
    public static double hallarValorMaximo(double [] a, int n){
        double max = a[n];
        return hallarValorMaximo(a,n,max);
    }
    
     public static double hallarValorMaximo(double [] a, int n, double max){
         
         if (n>=0){
             if (max<a[n])
                 max = a[n];
             return hallarValorMaximo(a,n-1,max);
         }
         else
             return max;
    }
    
    // Ejercicio 7
    /*
    7) Calcular (sin hacer uso del método predefinido Math.pow) el valor de x^n
, donde x es un
número real y n es un número entero mayor o igual a cero (máximo dos variables)
    */
    
    public static double calculaPotencias(double n, int m){
        if (m==0)
            return 1;
        else if (m>0){
            return n*calculaPotencias(n,m-1);
        }
        else
            return -1;
    }
    // Ejercicio 8
    /*
    8) Contar cuántos dígitos tiene un número entero positivo sin convertirlo en un String
equivalente (máximo una variable).
    */
    
    public static int contarDigitos(int n){
        
        if (n!=0){
            return 1 + contarDigitos(n/10);
        }
        else
            return 0;
    }
    
    // Ejercicio 9
    /*
    9) Dado un valor entero, imprimir sus dígitos en sentido inverso sin convertirlo en un
String equivalente (máximo una variable).
    */
    
    public static void imprimirDigitosInverso(int n){
        if (n!=0){
            if (n%10!=0){
                System.out.print(n%10);
                imprimirDigitosInverso(n/10);
            }
            else
                System.out.println("0");
        }
        else
            System.out.println(" ");
    }
    
    // Ejercicio 10
    /*
    10) Implementar recursivamente el método de búsqueda secuencial de un dato dentro de un
arreglo (no lleno) de enteros, regresando un -1 en caso de no encontrar el dato buscado y el
índice donde se encuentra en caso de que sí aparezca el dato en el arreglo (máximo tres
variables). El diagrama de flujo del algoritmo de búsqueda secuencial se encuentra en
ComunidadITAM.
    */
    
    public static int busquedaSecuencialOrdenadaRecursiva(int [] a, int n, int dato){
        if (n>=0){
            if (a[n]==dato){
                return n;
            }
            else
                return busquedaSecuencialOrdenadaRecursiva(a,n-1,dato);
        }
        else
            return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        //Ejercicio 1
        int [] arr ={-17,0,23,4,8,-2};
        System.out.println("Imprime de izquieda a derecha (lleno):");
        imprimeIzquierdaDerechaArrLleno(arr);
        
        // Ejercicio 2
        int [] arr2 = new int [3];
        arr2[0]=1;
        arr2[1]=2;
        
        //imprimeIzquierdaDerechaArrNoLleno(arr2);
        
        // Ejercicio 3
        System.out.println("Imprime de derecha a izquierda (no lleno):");
        imprimeDerechaIzquierdaArrNoLleno(arr2, 2);
        
        // Ejercicio 4
        System.out.println("Suma de los números: " + sumaEnteros(arr,3));
        
        // Ejercicio 5
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Contar impares: " + contarImparesEnArreglo(arr3,9));
        
        // Ejercicio 6
        double [] arr4 = {1,2,3,53,-2};
        System.out.println("Hallar valor máximo: " + hallarValorMaximo(arr4,4));

        
        // Ejercicio 7
        System.out.println("Calcula potencias: " + calculaPotencias(10,8));
        
        // Ejercicio 8
        System.out.println("Contar dígitos: " + contarDigitos(-89026783));
        
        // Ejercicio 9
        System.out.println("Imprimir dígitos en orden inverso: ");
        imprimirDigitosInverso(7689264);
        
        // Ejercicio 10
        System.out.println("Búsqueda secuencial ordenada recursiva: " + busquedaSecuencialOrdenadaRecursiva(arr,5,23));
    }
    
}
