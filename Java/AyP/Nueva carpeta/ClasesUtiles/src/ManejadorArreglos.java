import java.util.ArrayList;
//Baldo
public class ManejadorArreglos {

	public static double suma(double[]a, int n) {
		double res=0;
		
		for(int i=0; i<n; i++) {
			res+=a[i];
		}
		return res;
	}
	
	public static double promedio(double []a, int n) {
		double res;
		
		res=ManejadorArreglos.suma(a, n)/n;
		
		return res;
	}
	
	public static int posMayor(double a[], int n) {
		int max=0;
	
		for(int i=1; i<n; i++) {
			if(a[i]>a[max]) {
				max=i;	
			}
		}
		return max;
	}
	
	public static int posMin(double a[], int n) {
		int min=0;
		
		for(int i=1; i<n; i++) {
			if(a[i]<a[min])
				min=i;
		}
		return min;
	}
	
	public static int cuantosMayorQueX(double []a, int n, double x) {
		int cont=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]>x) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int cuantosMenorQueX(double []a, int n, double x) {
		int cont=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]<x)
				cont++;
		}
		return cont;
	}
	
	public static ArrayList<Integer> cualesMayoresX(double a[], int n, double x){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(a[i]>x)
				lista.add(i);
		}
		return lista;
	}
	
	public static ArrayList<Integer> cualesMenoresX(double a[], int n, double x){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(a[i]<x)
				lista.add(i);
		}
		return lista;
	}
	
	public static void swap(double a[], int pr, int sg) {
		double aux;
		
		aux=a[pr];
		a[pr]=a[sg];
		a[sg]=aux;
	}
	
	public static void invierte (double []a, int n) {
		for(int i=0; i<(n/2); i++) {
			swap(a, i, n-i-1);
		}
	}
	
	public static void correD2(double []a, int n, int c){
		for(int i=0; i<c; i++) {
			for(int j=n-1; j>=1; j--) {
					a[j]=a[j-1];
				}
			a[0]=0;
			}
		}
	

	public static void correI(double []a, int n, int c) {
		for(int i=0; i<c; i++) {
			for(int j=0; j<n-1; j++) {
					a[j]=a[j+1];
			}
			a[n-1]=0;
		}	
	}
	
	public static void correCircular(double a[], int n, int c) {
		double x;
		
		for(int i=0; i<c; i++) {
			x=a[n-1];
			for(int j=n-1; j>=1; j--) {					
					a[j]=a[j-1];
				}
			a[0]=x;
			}
	}
	
	public static int busSecDes(double a[], int n, double x) {
		int i=0;
		
		while (i<n && x!=a[i]) {	
			i++;
		}
		
		if(i==n) { 
			i=-1;
		}

		return i;
	}
	
	public static int busSecOrd(double a[], int n, double x) {
		int i=0;
		
		while (i<n && x>a[i]) {	
			i++;
		}
		
		if(i==n || a[i]!=x) { 
			i=-1-i;
		}

		return i;
	}
	
	public static int posMin(double a[], int n, int inicio) {
		int min = inicio;	
		
		for(int i=inicio+1; i<n; i++) {
			if(a[min]>a[i]) {
				min=i;
				i++;
			}
		}
		return min;
	}
	
	public static void alteraArr(double []a, int n, ArrayList<Double> lista) {
		int i=0;
		
		while (i<n ) {
			if(lista.contains(a[i])) {
				correI(a, n, 1);//es el correuni
			}
			else {
				i++;
				
			}
		}
	}
	
	public static void ordenamientoPorSelecDir(double a[], int n){
		int x;
		
		for(int i=0; i<n; i++) {
			x=posMin(a, n, i);
			swap(a, i, x);
		}
	}
	
	public static int busBin (double[]a, int n, double x) {
		int pos = 0;
		int inicio=0;
		int fin=n-1;
		int mitad=(inicio+fin)/2;
		
		while (inicio<=fin && a[mitad]!=x) {
			if(x<a[mitad])
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
	
	public static void unCorrimientoD(double []a, int n, int pos) {

		if(n<a.length) {
			for(int j=n; j>pos; j--) {
					a[j]=a[j-1];
				}
			a[pos]=0;
			n=n-1;
		}
	}
	
	public static void unCorrimientoI(double[]a, int n, int pos) {

		for(int j=pos-1; j<n-1; j++) {
				a[j]=a[j+1];
		}
		a[n-1]=0;
		n++;
			
	}
	
	public static double promVacioLista(ArrayList<Integer> lista) {
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
}
	
