import java.util.ArrayList;
import java.util.Scanner;
/* David López	cu: 173993
 * 07/03/2018
 * Clase calculadora
 */
public class PruebaCalculadora {
	private final static int MAX=100;
	
	public static void imprimeArreglo(double []a, int n){
		for (int i=0; i<a.length;i++)
			System.out.print("\t" + a[i]);
		System.out.println("");
	}
	
	public static int leeArreglo(double []a){
		Scanner lee = new Scanner(System.in);
		int n;
		
		System.out.println("¿Cuántas celdas quieres leer del arreglo? El máximo es " + MAX);
		n = lee.nextInt();
		System.out.println("Escribe el valor de cada celda");
		for (int i=0; i<n;i++)
			a[i] = lee.nextDouble();
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Calculadora.esImpar(7));
		String ull, fib;
		ArrayList<Double> resUll;
		double [] arrFib;
		double [] arreglo = new double[MAX];
		int n;
		double [] prueba = {3,73,6,2,53};
		
		/*
		ull = Calculadora.calculaUllman(10);
		System.out.println(ull);
		fib = Calculadora.calculaFibonacci(10);
		System.out.println(fib);
		
		resUll = Calculadora.calculaUllman(10.0);
		System.out.println(resUll.toString());
		
		arrFib = Calculadora.calculaFibonacciArr(10);
		imprimeArreglo(arrFib,arrFib.length);
		

		n=leeArreglo(arreglo);
		System.out.println(arreglo.length + " " +n);
		imprimeArreglo(arreglo,arreglo.length);
		
		
		System.out.println("Suma: " + ManejadorArreglos.suma(prueba, prueba.length));
		
		System.out.println("Promedio: " + ManejadorArreglos.promedio(prueba, prueba.length));
		
		System.out.println("Posición del Mayor" + ManejadorArreglos.posMayor(prueba, prueba.length));
		
		System.out.println("Posición del Menor" +ManejadorArreglos.posMenor(prueba, prueba.length));
		
		System.out.println("¿Cuántos mayor? " + ManejadorArreglos.cuantosMayorX(prueba, prueba.length, 50));
		
		System.out.println("¿Cuántos menor? " + ManejadorArreglos.cuantosMenorX(prueba, prueba.length, 50));
		
		System.out.println("¿Cuáles mayor? " + ManejadorArreglos.cualesMayorX(prueba,  prueba.length, 20));
		
		System.out.println("¿Cuáles menor? " + ManejadorArreglos.cualesMenorX(prueba, prueba.length, 20));
		
		System.out.println("Arreglo original");
		imprimeArreglo(prueba, prueba.length);
		
		ManejadorArreglos.swap(prueba,  0,  4);
		System.out.println("Swap");
		imprimeArreglo(prueba, prueba.length);
		
		ManejadorArreglos.swap(prueba,  0,  4);
		System.out.println("Swap de regreso");
		imprimeArreglo(prueba, prueba.length);
		
		ManejadorArreglos.invierte(prueba, prueba.length);
		System.out.println("Invierte");
		imprimeArreglo(prueba, prueba.length);
		
		ManejadorArreglos.invierte(prueba, prueba.length);
		System.out.println("Invierte de regreso");
		imprimeArreglo(prueba, prueba.length);
		
		*/
	}

}
