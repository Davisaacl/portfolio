import java.util.ArrayList;
/* David López	cu: 173993
 * 07/03/2018
 * Clase calculadora
 */
public class Calculadora {
	public static double factorial(int n){			//Método estático, no se necesita un objeto
		double fac = 1;
		
		for (int i=2;i<=n;i++)
			fac = fac*i;
		return fac;
	}
	
	public static boolean estaOrdenCreciente(int a, int b){
		boolean resp = false;
		
		if (a<b)
			resp = true;
		return resp;
	}
	
	public static String ordenaCreciente(int a, int b){
		StringBuilder cad = new StringBuilder();
		
		if (a<b)
			cad.append("Ordenados en forma creciente" + a + b);
			else
				cad.append("Ordenados en forma creciente " + b + "-" + a);
		return cad.toString();
	}
	
	public static boolean esImpar(int a){
		boolean resp= false;
		
		if (a % 2 != 0)
			resp = true;
		return resp;
	}
	
	public static double calculaFuncion1(double x){
		double resp = 0;
		
		if (x<=11)
			resp = 3*x+36;
		else
			if (x>11 && x<=33)
				resp = Math.pow(x, 2)-10;
			else 
				if (x>33 && x<=64)
					resp = x+6;
		return resp;
	}
	
	public static double calculaFuncion2(int x){
		double resp = 0;
		
		switch (x%4){
		case 0: resp = Math.pow(x, 2);
				break;
		case 1: resp = (double) (x/6);
				break;
		case 2: resp = Math.sqrt(x);
				break;
		case 3: resp = ((Math.pow(x, 3))+5); //Último case no lleva break
		}
		return resp;
	}
	
	public static double calculaFuncion3(int num, int v){// Como Lourdes es el método que regresa int y, además, se usa un Switch
		double resp = 0;
		
		if (num == 1)
			resp = 100*v;
		else
			if (num == 2)
				resp = Math.pow(100, v);
			else 
				if (num == 3)
					resp = (double) (100/v);
		return resp;
	}
		
	public static double multiplicacion(double num, int mult){		// public intmultiplica(int m, int n){
		double resp = num;									// int mult = 0;
															
		for (int i=2;i<=mult;i++)							// for (int i=1;i<=n;i++)
			resp = resp + num;	//resp+=num					// multi+=m
		return resp;										// return multi		}
	}
	
	public static double potencia (double num, int pot){
		double resp = num;
		
		for (int i=2;i<=pot;i++)
			resp = num*num;				//resp*=m
		return resp;
	}
	
	public static String calculaUllman (int n){
		StringBuilder cad = new StringBuilder();
		
		cad.append(n);
		do{
			if (n%2==0)
				n = n/2;
			else
				n = n*3+1;
		cad.append(" " + n);
		}
		while (n!=1);
		return cad.toString();
	}
	
	public static ArrayList<Double> calculaUllman(Double n){
		ArrayList<Double> lista;
		
		lista = new ArrayList<Double>();
		lista.add(n);
		while(n>1){
			if (n%2==0)
				n = n/2;
			else
				n = n*3+1;
		lista.add(n);
		}
		return lista;
	}
	
	public static boolean esArmstrong(int n){
		int digitos = 0, aux, res, resp = 0, guarda = n;
		boolean armstrong = false;
		
		aux = n;
		while (aux!=0){
			aux = (int) aux/10;
			digitos++;
		}
		for(int i=1;i<=digitos;i++){
			aux = n%10;
			n = (int) n/10;
			res = (int) Math.pow(aux, digitos);
			resp = resp + res;
		}
		if (resp==guarda)
			armstrong = true;
		return armstrong;
	}
	
	public static double calculaSeno(double x){
		int cont = 1, potencia = 1, elemento = 0;
		double resFin = 0, res = 0;
		
		while (elemento<0.0001){
			res = Math.pow(x, potencia);
			res = res/Calculadora.factorial(potencia);
			if (cont%2==0)
				res = res*(-1);
			resFin = resFin + res;
			cont+=2;
			potencia++;
		}
		return resFin;
	}
	
	public static String calculaFibonacci(int n){
		StringBuilder cad = new StringBuilder();
		int a, b, c;
		
		a=0;
		b=1;
		cad.append(a+ " " + b + " ");
		for(int i=3; i<=n; i++){
			c = a+b;
			cad.append(c + " ");
			a = b;
			b = c;
		}
		return cad.toString();
	}
	
	public static double[] calculaFibonacciArr(int n){
		double [] arr;
		
		arr = new double[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<n; i++){
			arr[i] = arr[i-2]+arr[i-1];
		}
		return arr;
	}

}
