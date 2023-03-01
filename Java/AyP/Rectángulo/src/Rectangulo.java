/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 1 del cuadernillo de Ejercicios
 */
public class Rectangulo {
	private double altura;
	private double base;
	private int claveUnica;
	private static int folio = 1000;
	
	public Rectangulo(){
		this.claveUnica = folio;
		folio++;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + claveUnica;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (claveUnica != other.claveUnica)
			return false;
		return true;
	}
/*
	public int compareTo(Rectangulo otro){
		return this.claveUnica-otro.claveUnica;
	}
	*/
}
