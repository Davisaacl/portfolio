/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 1 del cuadernillo de Ejercicios
 */
public class Rectangulo {
	private double altura;
	private double base;
	
	public Rectangulo(){
	}
	
	public Rectangulo(double altura, double base){
		this.altura = altura;
		this.base = altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public double getBase(){
		return this.base;
	}
	
	public double calculaPerimetro(){
		return altura*2 + base*2;
	}
	
	public double calculaArea(){
		return altura*base;
	}
	
	public String toString(){
		return "El rectángulo tiene de altura " + altura + " y tiene de base " + base;
	}
}
