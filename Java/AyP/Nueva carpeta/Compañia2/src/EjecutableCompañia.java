import java.util.Scanner;
/* David L�pez	cu: 173993
 * 13/04/2018
 * Ejercicio 4
 */
public class EjecutableCompa�ia {
	
	public static void main(String[] args){
		Compania c;
		Scanner lee = new Scanner(System.in);
		int n;
		double venta;
		
		c = new Compania("XXX","Conocido","CDMX","Yo");
		System.out.println("�Cu�ntas ventas quieres dar de alta?");
		n = lee.nextInt();
		for (int i=0;i<n;i++){
			System.out.println("Dime la venta del mes");
			venta = lee.nextDouble();
			if(c.altaVenta(venta))
				System.out.println("Alta de venta exitosa");
		}
		
	}

}
