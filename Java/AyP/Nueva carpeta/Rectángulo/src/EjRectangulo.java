import java.util.Scanner;
/* David L�pez	cu: 173993
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
		System.out.println("�Cu�nto mide de altura del rect�ngulo?");
		altura = lee.nextDouble();
		R1.setAltura(altura);
		System.out.println("�Cu�nto mide de base del rect�ngulo?");
		base = lee.nextDouble();
		R1.setBase(base);
		
		System.out.println("El �rea del rect�ngulo es: "+ R1.calculaArea());
		System.out.println("El per�metro del rect�ngulo es: " + R1.calculaPerimetro());
		System.out.println(R1.toString());

	}

}
