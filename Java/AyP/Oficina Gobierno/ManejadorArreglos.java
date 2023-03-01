import java.util.ArrayList;
/* David López	cu:173993
 * Arreglos dos
 * 06/04/2018
 */
public class ManejadorArreglos {
	
	public static double suma(double[] arr, int n){
		double suma = 0.0;
		
		for (int i=0;i<n;i++)
			suma = suma + arr[i];
		return suma;
	}
	
	public static double promedio(double[] arr,int n){
		double promedio;
		
		promedio = suma(arr, n)/n;
		return promedio;
	}
	
	public static int posMayor(double [] arr, int n){
		int posMayor = 0;
		double numMayor = arr[0];
		
		for (int i=1;i<n;i++){
			if (numMayor<arr[i]){
				numMayor = arr[i];
				posMayor= i;
			}
		}
		return posMayor;
	}
	
	public static int posMenor(double [] arr, int n){
		int posMenor = 0;
		double numMenor = arr[0];
		
		for (int i=1;i<n;i++){
			if(numMenor>arr[i]){
				numMenor = arr[i];
				posMenor = i;
			}
		}
		return posMenor;
	}
	
	public static int cuantosMayorX (double [] arr, int n, double x){
		int cont = 0;
		
		for (int i=0;i<n;i++)
			if (arr[i]>x)
				cont++;
		return cont;
	}
	
	public static int cuantosMenorX (double [] arr, int n, double x){
		int cont = 0;
		
		for (int i=0;i<n;i++)
			if(arr[i]<x)
				cont++;
		return cont;
	}
	
	public static ArrayList<Integer> cualesMayorX(double [] arr, int n, double x){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++){
			if (arr[i]>x)
				lista.add(i);
		}
		return lista;	
	}
	
	public static ArrayList<Integer> cualesMenorX(double [] arr, int n, double x){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++){
			if(arr[i]<x)
				lista.add(i);
		}
		return lista;
	}
	
	public static void swap (double [] arr, int n, int m){
		double aux = arr[n];
		
		arr[n] = arr[m];
		arr[m] = aux;
	}
	
	public static void invierte (double [] arr, int n){
		int k = n-1;
		
		for (int i=0;i<n/2;i++){
			swap(arr,i,k);
			k--;
		}
	}
	
	public static void recorreArregloDerecha(double arr[], int n, int k){
		
		for (int j=1;j<=k;j++)
			for (int i=n-1;i>0;i++)
				arr[i] = arr[i-1];		
		arr[0] = 0;
	}
	
	public static void recorreArregloIzquierda(double arr[], int n, int k){
		
		for (int j=1;j<=k;j++)
			for (int i=0;i<n-1;i++)
				arr[i] = arr[i+1];
		arr[n-1] = 0;
			
	}
}
