/* David López	cu: 173993
 * 28/02/2018
 * clase Científico de Alice
 */
public class Cientifico {	// USB ESTÁ COMPLETO
	private String nombre;
	private String especialidad;
	private int edad;
	
	public Cientifico(){
	}
	
	public Cientifico(String nombre, String especialidad, int edad){
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.edad = edad;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEspecialidad(){
		return especialidad;
	}
	
	public int getEdad(){
		return edad;
	}
	
	//Métodos
	public double convierteCaF(double grados){
		double res;
		
		res = grados*9.0/5.0+32;
		return res;
	}
	
	public double convierteFaC(double grados){
		double res;
		
		res = (grados-32)-5.0/9.0;
		return res;
	}
	
	public double factorial(int n){
		double fac = 1;
		
		for (int i=2;i<=n;i++)
			fac = fac*i;
		return fac;
	}
	
	//TAREAS ENTREGA 07/03/2018
	//TAREAS 8,9,10,11,12,13,14,15,23,24
	public boolean estaOrdenCreciente(int a, int b){
		boolean resp = false;
		
		if (a<b)
			resp = true;
		return resp;
	}
	
	public String ordenaCreciente(int a, int b){
		StringBuilder cad = new StringBuilder();
		
		if (a<b)
			cad.append("Ordenados en forma creciente" + a + b);
			else
				cad.append("Ordenados en forma creciente " + b + "-" + a);
		return cad.toString();
	}
	
	public boolean esImpar(int a){
		boolean resp= false;
		
		if (a % 2 != 0)
			resp = true;
		return resp;
	}
	
	public double calculaFuncion1(double x){
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
	
	public double calculaFuncion2(int x){
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
	
	public double calculaFuncion3(int num, int v){// Como Lourdes es el método que regresa int y, además, se usa un Switch
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
		
	public double multiplicacion(double num, int mult){		// public intmultiplica(int m, int n){
		double resp = num;									// int mult = 0;
															
		for (int i=2;i<=mult;i++)							// for (int i=1;i<=n;i++)
			resp = resp + num;	//resp+=num					// multi+=m
		return resp;										// return multi		}
	}
	
	public double potencia (double num, int pot){
		double resp = num;
		
		for (int i=2;i<=pot;i++)
			resp = num*num;				//resp*=m
		return resp;
	}
	
	public String calculaUllman (int n){
		StringBuilder cad = new StringBuilder();
		
		cad.append(n);
		do{
			if (n%2==0)
				n = n/2;
			else
				n = n*3+1;
		cad.append(n);
		}
		while (n!=1);
		return cad.toString();
	}
	
	// Funcionalidades mínimas
	public String toString(){
		StringBuilder cad;
		cad = new StringBuilder();
		
		cad.append("\n Soy un científico de nombre: " + nombre);
		cad.append("\n mi especialidad es " + especialidad);
		cad.append("\n mi edad es " + edad);
		return cad.toString();
	}
	
	public int compareTo(Cientifico otro){
		int res;
		
		if (this.edad==otro.edad)
			res = 0;
		else
			if (this.edad>otro.edad)
				res = 1;
			else
				res = -1;
		return res;
	
	}
	
	public boolean equals (Cientifico otro){
		boolean res = false;
		
		if (this.edad ==otro.edad)
			res = true;
		return res;
	}
}

