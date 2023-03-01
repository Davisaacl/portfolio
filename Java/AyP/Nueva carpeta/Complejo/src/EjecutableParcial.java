/* David López	cu 173993
 * 14/03/2018
 * Ejercicio 18.1
 */
public class EjecutableParcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pruebas parciales
		Complejo x = new Complejo (4,5);
		Complejo y = new Complejo (4,5);
		Complejo z = new Complejo (3,5);
		Complejo w = new Complejo (4,4);
		Complejo u = new Complejo (5,2);
				
		System.out.println(x.toString());
		System.out.println(x.calculaMagnitud());
		System.out.println("CompareTo " + x.compareTo(y));
		System.out.println("Equals " + x.equals(y));
		System.out.println("CompareTo " + x.compareTo(z));
		System.out.println("Equals " + x.equals(z));
		System.out.println("CompareTo " + x.compareTo(w));
		System.out.println("Equals " + x.equals(w));
		System.out.println("CompareTo " + x.compareTo(u));
		System.out.println("Equals " + x.equals(u));
		
		//Suma
		System.out.println(CalculadoraCompleja.suma(x, u));
		
		//Resta
		System.out.println(CalculadoraCompleja.resta(x, u));
		
		//Multiplicación
		System.out.println(CalculadoraCompleja.multiplica(x, u));
		
		//División
		System.out.println(CalculadoraCompleja.divide(x, u));

	}

}
