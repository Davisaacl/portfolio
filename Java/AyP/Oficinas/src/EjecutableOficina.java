import java.util.Scanner;
/* David López	cu: 173993
 * 04/03/2018
 * Ejercicio 5 del cuadernillo de Ejercicios
 */
public class EjecutableOficina {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalOfi;
		int totalTap;
		double areaTotOfi = 0;
		double areaTotTap = 0;
		double areaVacia;
		Scanner lee = new Scanner(System.in);
		
		totalOfi = lee.nextInt();
		totalTap = lee.nextInt();
		
		for (int i=1; i<=totalOfi;i++){
			Rectangulo ofi = new Rectangulo();
			double largo;
			double ancho;
			double areaOfi;
			
			System.out.println("¿Cuál es el largo de la oficina?");
			largo = lee.nextDouble();
			ofi.setAltura(largo);
			System.out.println("¿Cuál es el ancho de la oficina?");
			ancho = lee.nextDouble();
			ofi.setBase(ancho);
			areaOfi = ofi.calculaArea();
			areaTotOfi = areaTotOfi+areaOfi;
		}
		
		for (int k=1; k<=totalTap;k++){
			Circulo tapete = new Circulo();
			double radio;
			double areaTap;
			
			System.out.println("¿Cuál es el radio del tapete 1?");
			radio = lee.nextDouble();
			tapete.setRadio(radio);
			areaTap = tapete.calculaArea();
			areaTotTap = areaTotTap + areaTap;
		}
		
		areaVacia = areaTotOfi-areaTotTap;
		System.out.println("El área desocupada por los tapetes es: " + areaVacia);
	}	

}
