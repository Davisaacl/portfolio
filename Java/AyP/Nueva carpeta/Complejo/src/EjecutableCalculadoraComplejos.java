import java.util.Scanner;
/* David López	cu 173993
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
		
		System.out.println("¿Quieres hacer una operación con números complejos?");
		res = lee.nextBoolean();
		if (res){
			System.out.println("¿Cuál es el primer número que quieres utilizar?");
			System.out.println("Ingresa la parte real del número complejo");
			real = lee.nextDouble();
			System.out.println("Ingresa la parte imaginaria del número complejo");
			imaginaria = lee.nextDouble();
			x = new Complejo (real, imaginaria);
			System.out.println("¿Cuál es el segundo número que quieres utilizar?");
			System.out.println("Ingresa la parte real del número complejo");
			real = lee.nextDouble();
			System.out.println("Ingresa la parte imaginaria del número complejo");
			imaginaria = lee.nextDouble();
			y = new Complejo (real, imaginaria);
			System.out.println("¿Qué operación quieres hacer?");
			System.out.println("Puedes hacer +(suma), -(resta), *(multiplicación),/(división)");
			System.out.println("Recuerda que debes seleccionar el símbolo que presenta a cada operación");
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
