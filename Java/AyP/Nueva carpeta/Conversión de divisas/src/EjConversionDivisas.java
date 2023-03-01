import java.util.Scanner;	// RECORDAR HACERLO CON WHILE Y SWITCH
/* David López		cu: 173993
 * 28/02/2018
 * main para convertir divisas en JAVA
 */
public class EjConversionDivisas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pesos, dolares, euros, yenes, yuanes, libras, kunas, rupias, divisaFinal = 0;
		String divisa;
		Scanner lee;
		
		lee = new Scanner(System.in);
		System.out.println("¿Cuántos pesos quieres convertir?");
		pesos = lee.nextDouble();
		while (pesos>0){
			//dolares = pesos/18.5;
			//System.out.println("Recibes: " + dolares + "dólares");
			System.out.println("¿A qué los quieres convertir?");
			System.out.println("Puedes elegir entre dólares, euros, yenes, yuanes, libras, kunas, rupias o nada");
			divisa = lee.next();
			if (divisa == "dólares"){
				dolares = pesos/18.5;
				divisaFinal = dolares;
			}
			else
				if (divisa == "euros"){
					euros = pesos/22.0;
					divisaFinal = euros;
				}
				else
					if (divisa == "yenes"){
						yenes = pesos/10.0;
						divisaFinal = yenes;
					}
					else 
						if (divisa == "yuanes"){
							yuanes = pesos*0.337;
							divisaFinal = yuanes;
						}
						else
							if (divisa == "libras"){
								libras = pesos/25.97;
								divisaFinal = libras;
							}
							else
								if (divisa == "kunas"){
									kunas = pesos/3.21;
									divisaFinal = kunas;
								}
								else
									if (divisa == "rupias"){
										rupias = pesos/0.29;
										divisaFinal = rupias;
									}
		}
		
		System.out.println("Recibes" + divisaFinal);
	}

}