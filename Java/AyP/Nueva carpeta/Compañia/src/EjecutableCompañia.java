/* DAVID LÓPEZ 	CU:173993
 * 12/04/2018
 * Ejercicio 3
 */
public class EjecutableCompañia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compañia comp1 = new Compañia("Netflix", "Polanco 53", "CDMX", "Sr. Pérez");
		
		System.out.println("Total Unidades: " + comp1.totalUnidades());
		
		System.out.println("Ventas por mes: ");
		System.out.println(comp1.getUnaVenta(0));
		System.out.println(comp1.getUnaVenta(1));
		System.out.println(comp1.getUnaVenta(2));
		System.out.println(comp1.getUnaVenta(3));
		System.out.println(comp1.getUnaVenta(4));
		System.out.println(comp1.getUnaVenta(5));
		System.out.println(comp1.getUnaVenta(6));
		System.out.println(comp1.getUnaVenta(7));
		System.out.println(comp1.getUnaVenta(8));
		System.out.println(comp1.getUnaVenta(9));
		System.out.println(comp1.getUnaVenta(10));
		System.out.println(comp1.getUnaVenta(11));
	}

}
