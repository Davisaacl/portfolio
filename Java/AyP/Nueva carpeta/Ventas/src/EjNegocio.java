/* David López	cu:173993
 * 07/03/2018
 * Ejercicio 19
 */
public class EjNegocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venta v1, v2;
		
		v1 = new Venta(850,"Rodrigo");
		v2 = new Venta(2350,"Baldomero");
		
		System.out.println("La comisión de Rodrigo es " + v1.calculaComision());
		System.out.println("La comisión de Baldomero es " + v2.calculaComision());
	}

}
