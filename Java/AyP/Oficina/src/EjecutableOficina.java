import java.util.Scanner;
/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 4 del cuadernillo de Ejercicios
 */
public class EjecutableOficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo oficina = new Rectangulo();
		double largo;
		double ancho;
		double areaOfi;
		double areaLlena;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("¿Cuál es el largo de la oficina?");
		largo = lee.nextDouble();
		oficina.setAltura(largo);
		System.out.println("¿Cuál es el ancho de la oficina?");
		ancho = lee.nextDouble();
		oficina.setBase(ancho);
		areaOfi = oficina.calculaArea();
		
		Circulo tapete1 = new Circulo();
		double radio;
		double areaTap1;
		
		System.out.println("¿Cuál es el radio del tapete 1?");
		radio = lee.nextDouble();
		tapete1.setRadio(radio);
		areaTap1 = tapete1.calculaArea();
		
		Circulo tapete2 = new Circulo();
		double radio2;
		double areaTap2;
		
		System.out.println("¿Cuál es el radio del tapete 2?");
		radio2 = lee.nextDouble();
		tapete2.setRadio(radio2);
		areaTap2 = tapete2.calculaArea();
		
		Circulo tapete3 = new Circulo();
		double radio3;
		double areaTap3;
		
		System.out.println("¿Cuál es el radio del tapete 3?");
		radio3 = lee.nextDouble();
		tapete3.setRadio(radio3);
		areaTap3 = tapete3.calculaArea();
		
		areaLlena = areaTap1 + areaTap2 + areaTap3;
		System.out.println("El área desocupada por los tapetes es: " + (areaOfi-areaLlena));	
	}

}
