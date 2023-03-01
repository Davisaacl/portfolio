import java.util.Scanner;
/*David López	cu:173993
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
		System.out.println("¿Cuál es su número de cuenta?");
		numCuenta = lee.nextInt();
		System.out.println("¿Cuál es su nombre?");
		titular = lee.next();
		System.out.println("¿Con qué cantidad desea abrir la cuenta?");
		saldo = lee.nextDouble();
		c1 = new Cuenta(numCuenta,titular,saldo);
		System.out.println(c1.toString());
		System.out.println("¿Desea hacer un retiro?");
		res = lee.nextBoolean();
		while (res == true){
			System.out.println("¿Cuánto quieres retirar?");
			retiro = lee.nextDouble();
			if (retiro<saldo){
				System.out.println("Se retirará " + retiro);
				saldo-=retiro;
				c1.setSaldo(saldo);
				System.out.println("Esta es la nueva información de la cuenta");
				System.out.println(c1.toString());
			}
			System.out.println("¿Desea hacer un retiro?");
			res = lee.nextBoolean();
		}
		
		// Segunda cuenta
		c2 = new Cuenta();
		System.out.println("¿Cuál es su número de cuenta?");
		numCuenta = lee.nextInt();
		System.out.println("¿Cuál es su nombre?");
		titular = lee.next();
		c2.setNumCuenta(numCuenta);
		c2.setNomTitular(titular);
		System.out.println(c2.toString());
		System.out.println("¿Quieres hacer un primer depósito?");
		res = lee.nextBoolean();
		if (res == true){
			System.out.println("¿Cuánto quieres depositar?");
			saldo = lee.nextDouble();
		}
		
		System.out.println("La información de las cuentas es la siguiente:");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		

	}

}
