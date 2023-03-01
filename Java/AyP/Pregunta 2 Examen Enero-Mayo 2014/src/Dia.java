/* David López	CU: 173993
 * Pregunta 2
 * 22/04/2018
 */
public class Dia {	
	private int num;
	private double montoProd1, montoProd2;
	private int numVentas1, numVentas2;
		
	public Dia() {			
	}
	public Dia(int num, int numV1, double monto1, int numV2, double monto2) {			this.num=num;
		this.numVentas1=numV1;
		this.montoProd1=monto1;
		this.numVentas2=numV2;
		this.montoProd2=monto2;
	}
	public int getNum() {
		return num;
	}
	public double getMontoProd1() {
		return montoProd1;
	}
	public double getMontoProd2() {
		return montoProd2;
	}
	public int getNumVentas1() {
		return numVentas1;
	}
	public int getNumVentas2() {
		return numVentas2;
	}
	public void setMontoProd1(double montoProd1) {
		this.montoProd1 = montoProd1;
	}
	public void setMontoProd2(double montoProd2) {
		this.montoProd2 = montoProd2;
	}
	public void setNumVentas1(int numVentas1) {
		this.numVentas1 = numVentas1;
	}
	public void setNumVentas2(int numVentas2) {
		this.numVentas2 = numVentas2;
	}
	public String toString() {
		StringBuilder cad;
		cad= new StringBuilder();
		
		cad.append("          Número de día: "+this.num+"\n");
		cad.append("Número de ventas Prod 1: "+this.numVentas1+"\n");
		cad.append(" Monto de ventas Prod 1: "+this.montoProd1+"\n");
		cad.append("Número de ventas Prod 2: "+this.numVentas2+"\n");
		cad.append(" Monto de ventas Prod 1: "+this.montoProd2+"\n");
		
		return cad.toString();
	}
}