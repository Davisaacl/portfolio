/*David López	cu:173993
 * 08/03/2018
 * Tarea Banco
 */
public class Cuenta {
	private int numCuenta;
	private String nomTitular;
	private double saldo;
	
	public Cuenta(){
	}
	
	public Cuenta(int numCuenta, String nomTitular, double saldo){
		this.numCuenta = numCuenta;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
	}
	
	public void setNumCuenta(int numCuenta){
		this.numCuenta = numCuenta;
	}
	
	public int getNumCuenta(){
		return this.numCuenta;
	}
	
	public void setNomTitular(String nomTitular){
		this.nomTitular = nomTitular;
	}
	
	public String getNomTitular(){
		return this.nomTitular;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Número de cuenta: " + this.numCuenta);
		cad.append("\nTitular: " + this.nomTitular);
		cad.append("\nSaldo disponible" + this.saldo);
		return cad.toString();
	}
	
	public int compareTo(Cuenta otra){
		int res = 0;
		if (this.numCuenta>otra.numCuenta)
			res = 1;
		else
			if (this.numCuenta<otra.numCuenta)
				res = -1;
		return res;
	}
	
	public boolean equals (Cuenta otra){
		boolean res = false;
		
		if (this.numCuenta==otra.numCuenta)
			res = true;
		return res;
	}
}
