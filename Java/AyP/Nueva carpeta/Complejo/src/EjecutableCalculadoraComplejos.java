import java.util.Scanner;
/* David L�pez	cu 173993
 * 14/03/2018
 * Ejercicio 18
 */
public class EjecutableCalculadoraComplejos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo x, y, resp = null;
		double real, imaginaria;
		boolean res;
		String operacion;
		char simbOpera;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("�Quieres hacer una operaci�n con n�meros complejos?");
		res = lee.nextBoolean();
		if (res){
			System.out.println("�Cu�l es el primer n�mero que quieres utilizar?");
			System.out.println("Ingresa la parte real del n�mero complejo");
			real = lee.nextDouble();
			System.out.println("Ingresa la parte imaginaria del n�mero complejo");
			imaginaria = lee.nextDouble();
			x = new Complejo (real, imaginaria);
			System.out.println("�Cu�l es el segundo n�mero que quieres utilizar?");
			System.out.println("Ingresa la parte real del n�mero complejo");
			real = lee.nextDouble();
			System.out.println("Ingresa la parte imaginaria del n�mero complejo");
			imaginaria = lee.nextDouble();
			y = new Complejo (real, imaginaria);
			System.out.println("�Qu� operaci�n quieres hacer?");
			System.out.println("Puedes hacer +(suma), -(resta), *(multiplicaci�n),/(divisi�n)");
			System.out.println("Recuerda que debes seleccionar el s�mbolo que presenta a cada operaci�n");
			operacion = lee.next();
			simbOpera = operacion.charAt(0);
			switch (simbOpera){
			case '+':
				resp = CalculadoraCompleja.suma(x, y);
				break;
			case '-':
				resp = CalculadoraCompleja.resta(x, y);
				break;
			case '*':
				resp = CalculadoraCompleja.multiplica(x, y);
				break;
			case '/':
				resp = CalculadoraCompleja.divide(x, y);
			}
			System.out.println("El resultado es: " + resp);
		}
		
	}

}
