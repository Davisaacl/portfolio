import java.util.Scanner;
/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 1 del cuadernillo de Ejercicios
 */
public class EjRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo R1 = new Rectangulo();
		double altura;
		double base;
		
		Scanner lee = new Scanner(System.in);
		System.out.println("¿Cuánto mide de altura del rectángulo?");
		altura = lee.nextDouble();
		R1.setAltura(altura);
		System.out.println("¿Cuánto mide de base del rectángulo?");
		base = lee.nextDouble();
		R1.setBase(base);
		
		System.out.println("El área del rectángulo es: "+ R1.calculaArea());
		System.out.println("El perímetro del rectángulo es: " + R1.calculaPerimetro());
		System.out.println(R1.toString());

	}

}
