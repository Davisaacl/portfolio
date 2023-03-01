import java.util.Scanner;
/* David López	cu:173993
 * 12/03/2018
 * Ejercicio 37 java
 */
public class EjecutableAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1, auto2, auto3, auto4, auto5;
		auto1 = new Auto ("BMW", 2004,40000.0);
		auto2 = new Auto ("KIA", 2018,2000.0);
		auto3 = new Auto ("Mercedes-Benz", 2003,30000.0);
		auto4 = new Auto ("Mini Cooper", 2015,10000.0);
		auto5 = new Auto ("Mazda", 2017,5000.0);
		Scanner lee = new Scanner(System.in);
		boolean res;
		int auto, autoDos;
		String nombre;
		int numLic;
		int diasRent;
		double kmRecor;
		
		// Renta primer auto
		System.out.println("¿Quieres rentar un auto?");
		res = lee.nextBoolean();
		if (res){
			System.out.println("Dígame su nombre, número de licencia y días que quiere rentar");
		nombre = lee.next();
		numLic = lee.nextInt();
		diasRent = lee.nextInt();
			System.out.println("¿Cuál quieres rentar?");
			System.out.println("(1)BMW, (2)KIA, (3)Mercedes-Benz, (4)Mini Cooper, (5)Mazda");
			auto = lee.nextInt();
			System.out.println("Su renta es válida");
			switch (auto){
			case 1:
					System.out.println("El precio a pagar es: " + auto1.rentar(nombre, numLic, diasRent));
					break;
			case 2:
					System.out.println("El precio a pagar es: " + auto2.rentar(nombre, numLic, diasRent));
					break;
			case 3:
					System.out.println("El precio a pagar es: " + auto3.rentar(nombre, numLic, diasRent));
					break;
			case 4:
					System.out.println("El precio a pagar es: " + auto4.rentar(nombre, numLic, diasRent));
					break;
			case 5:
					System.out.println("El precio a pagar es: " + auto5.rentar(nombre, numLic, diasRent));
			}
		// Renta segundo auto
		System.out.println("¿Quieres rentar un auto?");
		res = lee.nextBoolean();
		if (res){
			System.out.println("Dígame su nombre, número de licencia y días que quiere rentar");
		nombre = lee.next();
		numLic = lee.nextInt();
		diasRent = lee.nextInt();
			System.out.println("¿Cuál quieres rentar?");
			System.out.println("(1)BMW, (2)KIA, (3)Mercedes-Benz, (4)Mini Cooper, (5)Mazda");
			autoDos = lee.nextInt();
			if (autoDos!=auto){
				System.out.println("Su renta es válida");
				switch (autoDos){
				case 1:
						System.out.println("El precio a pagar es: " + auto1.rentar(nombre, numLic, diasRent));
						break;
				case 2:
						System.out.println("El precio a pagar es: " + auto2.rentar(nombre, numLic, diasRent));
						break;
				case 3:
						System.out.println("El precio a pagar es: " + auto3.rentar(nombre, numLic, diasRent));
						break;
				case 4:
						System.out.println("El precio a pagar es: " + auto4.rentar(nombre, numLic, diasRent));
						break;
				case 5:
						System.out.println("El precio a pagar es: " + auto5.rentar(nombre, numLic, diasRent));
					}
				}
				// Devolución segundo carro
				System.out.println("¿Ya quieres devolver tu auto?");
				res = lee.nextBoolean();
				System.out.println("¿Cuántos km recorrió el auto?");
				kmRecor = lee.nextDouble();
				if (res){
					switch(autoDos){
					case 1:
						auto1.devolver(kmRecor);
						System.out.println(auto1.toString());
						break;
					case 2:
						auto1.devolver(kmRecor);
						System.out.println(auto2.toString());
						break;
					case 3:
						auto1.devolver(kmRecor);
						System.out.println(auto3.toString());
						break;
					case 4:
						auto1.devolver(kmRecor);
						System.out.println(auto4.toString());
						break;
					case 5:
						auto1.devolver(kmRecor);
						System.out.println(auto5.toString());
					}
				}
			}
		}
	}
}
