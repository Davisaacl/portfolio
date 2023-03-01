/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 3 del cuadernillo de Ejercicios
 */
public class EjecutableMesas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double espacioLleno;
		
		Rectangulo R1 = new Rectangulo(2.0,1.8);
		Rectangulo R2 = new Rectangulo(1.0,1.5);
		Rectangulo R3 = new Rectangulo(3,2);
		
		espacioLleno = (R1.calculaArea()+R2.calculaArea()+R3.calculaArea());
		System.out.println("El espacio ocupado es: " + espacioLleno);
		
	
	}
}
