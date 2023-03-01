/* David López	cu 173993
 * 14/03/2018
 * Ejercicio 16
 */
public class Complejo {
	private double parteReal;
	private double parteImaginaria;
	
	public Complejo(){
	}
	
	public Complejo(double parteReal, double parteImaginaria){
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public double getParteReal(){
		return this.parteReal;
	}
	
	public double getParteImaginaria(){
		return this.parteImaginaria;
	}
	
	public void setParteReal(double parteReal){
		this.parteReal = parteReal;
	}
	
	public void setParteImaginaria(double parteImaginaria){
		this.parteImaginaria = parteImaginaria;
	}
	
	public double calculaMagnitud(){
		double magnitud = 0;
		
		magnitud = Math.sqrt(Math.pow(this.parteReal, 2)+ Math.pow(this.parteImaginaria, 2));
		return magnitud;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Parte Real: " + this.parteReal);
		cad.append("Parte Imaginaria: " + this.parteImaginaria);
		return cad.toString();
	}
	
	public int compareTo(Complejo otro){
		int res = 0;
		
		if (this.parteReal == otro.parteReal){
			if (this.parteImaginaria>otro.parteImaginaria)
				res = 1;
			else
				res =-1;
		}
		else
			if (this.parteReal > otro.parteReal)
				res = 1;
			else
				res = -1;	
		return res;
	}
	
	public boolean equals (Complejo otro){
		boolean res = false;
		
		if(this.parteReal==otro.parteReal && this.parteImaginaria==otro.parteImaginaria)
			res = true;
		return res;
	}

}
