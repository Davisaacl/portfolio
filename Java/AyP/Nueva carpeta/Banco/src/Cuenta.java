/*David López	cu:173993
 * 08/03/2018
 * Tarea Banco
 */
public class Cuenta {
	private int numCuenta;
	private String nomTitular;
	private double saldo;
	public static int folio = 10000000;
	
	public Cuenta(){
		this.numCuenta = folio;
		folio++;
	}
	
	public Cuenta(String nomTitular, double saldo){
		this();
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
	
	/*
	 public void setSaldo(double saldo){
	 
		this.saldo = saldo;
	}
*/
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
	/* public int compareTo(Cuenta otra){
	 * 		return this.numCuenta-otra.numCuenta;
	 */
	   public boolean equals (Cuenta otra){		//public boolean equals (Object){	
		boolean res = false;
		
		if (this.numCuenta==otra.numCuenta)
			res = true;
		return res;
	}
	
	public boolean retiro(double retiro){
		boolean ret = false;
		
		if(retiro<=saldo){
			saldo-=retiro;
			ret = true;
		}
		return ret;	
	}
	public boolean deposito(double deposito){
		boolean ret = false;
		
		if(deposito>0){
			saldo+=deposito;
			ret = true;
		}
		return ret;	
	}
	
	// Otra forma
	/* public void deposito (double deposito){
	 * 		saldo+=deposito;
	 * }
	 */
}
