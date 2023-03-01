import java.util.ArrayList;
/* David López	cu:173993
 * ManejadorArreglos genérico
 * 16/04/2018
 */
public class ManejadorArreglosGenerico{
	
	public static <T extends Comparable <T>> int posMayor(T arr[], int n) {
		int resp=0;
	
		for(int i=1; i<n; i++) {
			if(arr[resp].compareTo(arr[i])<0) {
				resp = i;
			}
		}
		return resp;
	}
	
	public static <T extends Comparable<T>> int posMin(T arr[], int n) {
		int resp=0;
		
		for(int i=1; i<n; i++) {
			if(arr[resp].compareTo(arr[i])>0)
				resp=i;
		}
		return resp;
	}
	
	public static <T extends Comparable<T>> int cuantosMayorX(T arr[], int n, T x) {
		int cont=0;
		
		for(int i=0; i<n; i++) {
			if(arr[i].compareTo(x)>0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static <T extends Comparable <T>> int cuantosMenorX(T arr[], int n, T x) {
		int cont=0;
		
		for(int i=0; i<n; i++) {
			if(arr[i].compareTo(x)<0)
				cont++;
		}
		return cont;
	}
	
	public static <T extends Comparable <T>> ArrayList<Integer> cualesMayoresX(T arr[], int n, T x){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(arr[i].compareTo(x)>0)
				lista.add(i);
		}
		return lista;
	}
	
	public static <T extends Comparable <T>> ArrayList<Integer> cualesMenoresX(T arr[], int n, T x){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(arr[i].compareTo(x)<0)
				lista.add(i);
		}
		return lista;
	}
	
	public static <T extends Comparable <T>> void swap(T arr[], int x, int y) {
		T aux;
		
		aux=arr[x];
		arr[x]=arr[y];
		arr[y]=aux;
	}
	
	public static <T extends Comparable <T>> void invierte (T arr[], int n) {
		for(int i=0; i<(n/2); i++) {
			swap(arr,i,n-1);
		}
	}
	
	public static <T extends Comparable <T>> void corrimientoDerecha(T[] a, int n, int k){
		
		for(int j=0; j<k; j++) {
			for(int i=n-1; i>0; i--) {
					a[i]=a[i-1];
				}
			a[0]=null;
			}
		}
	

	public static <T extends Comparable <T>> void corrimientoIzquierda(T arr[], int n, int k) {
		for(int j=0; j<k; j++) {
			for(int i=0; i<n-1; i++) {
					arr[i]=arr[i+1];
			}
			arr[n-1]=null;
		}	
	}
	
	public static <T extends Comparable <T>> void corrimientoCircularDerecha(T arr[], int n, int k) {
		T x;
		
		for(int j=0; j<k; j++) {
			x=arr[n-1];
			for(int i=n-1; i>0; i--) {					
					arr[i]=arr[i-1];
				}
			arr[0]=x;
			}
	}
	public static <T extends Comparable <T>> void corrimientoCircularIzquierda(T arr[], int n, int k) {
		T x;
		
		for(int j=0; j<k; j++) {
			x=arr[0];
			for(int i=0; i<n-1; i++) {					
					arr[i]=arr[i+1];
				}
			arr[n-1]=x;
			}
	}
	
	public static <T extends Comparable <T>> int busquedaSecuencialDesordenada(T arr [], int n, T x) {
		int i=0;
		
		while (i<n && !(arr[i].equals(x))) {	
			i++;
		}
		if(i==n) { 
			i=-1;
		}
		return i;
	}
	
	public static <T extends Comparable <T>> int busquedaSecuencialOrdenada(T arr[], int n, T x) {
		int i=0;
		
		while (i<n && arr[i].compareTo(x)<0) {	
			i++;
		}
		
		if(i==n || !(arr[i].equals(x))) { 
			i=-i-1;
		}

		return i;
	}
	
	public static <T extends Comparable <T>> int posMin(T arr[], int n, int inicio) {
		int min = inicio;	
		
		for(int i=inicio+1; i<n; i++) {
			if(arr[min].compareTo(arr[i])>0) {
				min=i;
				i++;
			}
		}
		return min;
	}
	
	public static <T extends Comparable<T>> void alteraArreglo(T arr[], int n, ArrayList<Double> lista) {
		int i=0;
		
		while (i<n) {
			if(lista.contains(arr[i])) {
				corrimientoIzquierda(arr, n, 1);//es el correuni
			}
			else {
				i++;
				
			}
		}
	}
	
	public static <T extends Comparable<T>> void ordenamientoPorSeleccionDirecta(T arr[], int n){
		int x;
		
		for(int i=0; i<n; i++) {
			x=posMin(arr, n, i);
			swap(arr, i, x);
		}
	}
	
	public static <T extends Comparable <T>> int busquedaBinaria (T arr[], int n, T x) {
		int pos = 0;
		int inicio=0;
		int fin=n-1;
		int mitad=(inicio+fin)/2;
		
		while (inicio<=fin && !arr[mitad].equals(x)) {
			if(arr[mitad].compareTo(x)>0)
				fin=mitad-1;
			else 
				inicio=mitad +1;
		if (inicio > fin)
			pos=-inicio-1;
		else
			pos=mitad;
		}
		return pos;
	}
	
	public static <T extends Comparable <T>> void unCorrimientoDerecha(T[] arr, int n, int pos) {

		if(n<arr.length) {
			for(int i=n; i>pos; i--) {
					arr[i]=arr[i-1];
				}
			arr[pos]=null;
			n=n-1;
		}
	}
	
	public static <T extends Comparable <T>> void unCorrimientoIzquierda(T arr[], int n, int pos) {

		for(int i=pos-1; i<n-1; i++) {
				arr[i]=arr[i+1];
		}
		arr[n-1]=null;
		n++;
			
	}
	/*
	public static <T extends Comparable <T>> double promVacioLista(ArrayList<Integer> lista) {
		double res=0;
		int acum=0;
		
		while (0<lista.size()) {
			res=res+lista.get(0);
			lista.remove(0);
			acum++;
		}
		
		res=res/acum;
		
		return res;
	}
	*/
}
	
