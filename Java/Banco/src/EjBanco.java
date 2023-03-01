import java.util.Scanner;
/*David L�pez	cu:173993
 * 08/03/2018
 * Tarea Banco
 */
public class EjBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1, c2;
		Scanner lee = new Scanner(System.in);
		int numCuenta;
		String titular;
		double saldo, retiro;
		boolean res;
		
		// Primera cuenta
		System.out.println("�Cu�l es su n�mero de cuenta?");
		numCuenta = lee.nextInt();
		System.out.println("�Cu�l es su nombre?");
		titular = lee.next();
		System.out.println("�Con qu� cantidad desea abrir la cuenta?");
		saldo = lee.nextDouble();
		c1 = new Cuenta(numCuenta,titular,saldo);
		System.out.println(c1.toString());
		System.out.println("�Desea hacer un retiro?");
		res = lee.nextBoolean();
		while (res == true){
			System.out.println("�Cu�nto quieres retirar?");
			retiro = lee.nextDouble();
			if (retiro<saldo){
				System.out.println("Se retirar� " + retiro);
				saldo-=retiro;
				c1.setSaldo(saldo);
				System.out.println("Esta es la nueva informaci�n de la cuenta");
				System.out.println(c1.toString());
			}
			System.out.println("�Desea hacer un retiro?");
			res = lee.nextBoolean();
		}
		
		// Segunda cuenta
		c2 = new Cuenta();
		System.out.println("�Cu�l es su n�mero de cuenta?");
		numCuenta = lee.nextInt();
		System.out.println("�Cu�l es su nombre?");
		titular = lee.next();
		c2.setNumCuenta(numCuenta);
		c2.setNomTitular(titular);
		System.out.println(c2.toString());
		System.out.println("�Quieres hacer un primer dep�sito?");
		res = lee.nextBoolean();
		if (res == true){
			System.out.println("�Cu�nto quieres depositar?");
			saldo = lee.nextDouble();
		}
		
		System.out.println("La informaci�n de las cuentas es la siguiente:");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		

	}

}
