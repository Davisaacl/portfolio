/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 2 del cuadernillo de Ejercicios
 */
public class Circulo {
	private double radio;
	
	public Circulo(){
	}
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double getRadio(){
		return radio;
	}
	
	public double calculaArea(){
		return Math.PI*radio*radio;
	}
	
	public double calculaPerimetro(){
		return 2*Math.PI*radio;
	}
	
}