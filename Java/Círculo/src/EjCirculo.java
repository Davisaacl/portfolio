import java.util.Scanner;
/* David L�pez	cu: 173993
 * 04/03/2018
 * Ejercicio 2 del cuadernillo de Ejercicios
 */
public class EjCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo C1 = new Circulo();
		double radio;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("�Cu�nto mide el radio?");
		radio = lee.nextDouble();
		C1.setRadio(radio);
		System.out.println("El �rea mide " + C1.calculaArea());
		System.out.println("El per�metro mide " + C1.calculaPerimetro());
				

	}

}
