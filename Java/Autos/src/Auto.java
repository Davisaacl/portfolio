/* David López	cu:173993
 * 12/03/2018
 * Ejercicio 37 java
 */
public class Auto {
	private int claveUnica;
	private String marca;
	private int year;
	private double numKm;
	private String nombreCliente;
	private int licenciaCliente;
	private static int folio = 1000;
	
	public Auto(){
		this.claveUnica=folio;
		folio++;
	}
	
	public Auto(String marca, int year, double numKm){
		this();
		this.marca = marca;
		this.year = year;
		this.numKm = numKm;
	}
	
	public int getClaveUnica(){
		return this.claveUnica;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public double getNumKm(){
		return this.numKm;
	}
	
	public String getNombreCliente(){
		return this.nombreCliente;
	}
	
	public int getLicenciaCliente(){
		return this.licenciaCliente;
	}
	
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente = nombreCliente;
	}
	
	public void setLicenciaCliente(int licenciaCliente){
		this.licenciaCliente = licenciaCliente;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n Clave única: " + claveUnica);
		cad.append("\n Marca: " + marca);
		cad.append("\n Año: " + year);
		cad.append("\n Número de km: " + numKm);
		cad.append("\n Nombre del cliente: " + nombreCliente);
		cad.append("\n Licencia del cliente: " + licenciaCliente);
		return cad.toString();
	}
	
	public int compareTo(Auto otro){
		int res = 0;
		
		if (this.claveUnica>otro.claveUnica)
			res = 1;
		else
			if(this.claveUnica==otro.claveUnica)
				res = 0;
			else
				res = -1;
		return res;
	}
	
	public boolean equals (Auto otro){
		boolean res = false;
		
		if (this.claveUnica==otro.claveUnica)
			res = true;
		return res;
	}
	
	public double rentar(String nombreCliente, int licenciaCliente, int diasRenta){
		double res = 0;
		
		this.nombreCliente = nombreCliente;
		this.licenciaCliente = licenciaCliente;
		if (this.year<2005)
			res = diasRenta*200;
		else
			res = diasRenta*300;
		if (this.numKm<20000)
			for (int i=0;i<diasRenta;i++)
				res+=20;
		return res;
	}
	
	public void devolver(double kmRecorrido){
		this.nombreCliente = "";
		this.licenciaCliente = 0;
		this.numKm+=kmRecorrido;
	}

}
