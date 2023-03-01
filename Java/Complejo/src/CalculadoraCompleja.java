/* David López	cu 173993
 * 14/03/2018
 * Ejercicio 17
 */
public class CalculadoraCompleja {
	
	public static Complejo suma(Complejo a, Complejo b){
		double parteReal, parteImaginaria;
		Complejo res;
		
		parteReal = a.getParteReal()+b.getParteReal();
		parteImaginaria = a.getParteImaginaria() + b.getParteImaginaria();
		res = new Complejo(parteReal, parteImaginaria);
		return res;
	}
	
	public static Complejo resta(Complejo a, Complejo b){
		double parteReal, parteImaginaria;
		Complejo res;
		
		parteReal = a.getParteReal()-b.getParteReal();
		parteImaginaria = a.getParteImaginaria()-b.getParteImaginaria();
		res = new Complejo(parteReal, parteImaginaria);
		return res;
	}
	
	public static Complejo multiplica(Complejo a, Complejo b){
		double parteReal, parteImaginaria;
		Complejo res;
		
		parteReal = a.getParteReal()*b.getParteReal()-a.getParteImaginaria()*b.getParteImaginaria();
		parteImaginaria = a.getParteReal()*b.getParteImaginaria()+a.getParteImaginaria()*b.getParteReal();
		res = new Complejo(parteReal, parteImaginaria);
		return res;
	}
	
	public static Complejo divide (Complejo a, Complejo b){
		double parteReal, parteImaginaria;
		Complejo res;
		
		if ((Math.pow(b.getParteReal(), 2) + Math.pow(b.getParteImaginaria(), 2))!=0){
			parteReal =  (a.getParteReal()*b.getParteReal()+a.getParteImaginaria()*b.getParteImaginaria())/(Math.pow(b.getParteReal(), 2)+Math.pow(b.getParteImaginaria(), 2));
			parteImaginaria = (a.getParteImaginaria()*b.getParteReal()-a.getParteReal()*b.getParteImaginaria())/(Math.pow(b.getParteReal(), 2)+Math.pow(b.getParteImaginaria(), 2));
			res = new Complejo(parteReal, parteImaginaria);
		}
		else
			res = null;
		return res;
	}
	
}
