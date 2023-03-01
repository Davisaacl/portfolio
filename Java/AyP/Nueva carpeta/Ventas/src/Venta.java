/* David López	cu:173993
 * 07/03/2018
 * Ejercicio 19
 */
public class Venta {
	private double monto;
	private String nomVendedor;
	
	public Venta(){
	}
	
	public Venta(double monto, String nomVendedor){
		this.monto = monto;
		this.nomVendedor = nomVendedor;
	}
	
	public double calculaComision(){
		double comision = 0;
		
		if (monto<1000)
			comision = monto*0.03;
		else
			comision = monto*0.05;
		return comision;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		
		str.append("\nVenta realidzada por: " + nomVendedor);
		str.append("\n monto:" + monto);
		return str.toString();
	}
	
	public int compareTo(Venta otro){
		int res = 0;
		
		if(monto>otro.monto)
			res= 1;
		else
			if(monto<otro.monto)
			res= -1;
		return res;
	}
	
	public boolean equals(Venta otro){
		boolean res = false;
		
		if (monto==otro.monto)
			res = true;
		return res;
	}

}
