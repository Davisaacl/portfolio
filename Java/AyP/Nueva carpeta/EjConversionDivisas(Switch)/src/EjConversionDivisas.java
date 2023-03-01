import java.util.Scanner;	// RECORDAR HACERLO CON WHILE Y SWITCH
/* David López		cu: 173993
 * 28/02/2018
 * main para convertir divisas en JAVA
 */
public class EjConversionDivisas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pesos, dolares, euros, yenes, yuanes, libras, kunas, rupias, divisaFinal = 0;
		int divisa;
		Scanner lee;
		
		lee = new Scanner(System.in);
		System.out.println("¿Cuántos pesos quieres convertir?");
		pesos = lee.nextDouble();
		while (pesos>0){
			//dolares = pesos/18.5;
			//System.out.println("Recibes: " + dolares + "dólares");
			System.out.println("¿A qué los quieres convertir?");
			System.out.println("Puedes elegir entre (1) dólares, (2) euros, (3) yenes, (4) yuanes, (5) libras, (6) kunas, (7) rupias o (8) nada");
			divisa = lee.nextInt();
			switch (divisa){
			case 1:
				divisaFinal = pesos/18.5;
				break;
			case 2:
				divisaFinal = pesos/22.0;
			case 3:
				divisaFinal = pesos/10.0;
				break;
			case 4:
				divisaFinal = pesos*0.337;
			case 5:
				divisaFinal = pesos/25.97;
				break;
			case 6:
				divisaFinal = pesos/3.21;
				break;
			case 7:
				divisaFinal = pesos/0.29;
				break;
			case 8:
				divisaFinal = 0;
				break;
			}
			
		System.out.println("Recibes" + divisaFinal);
		}
		
	}

}