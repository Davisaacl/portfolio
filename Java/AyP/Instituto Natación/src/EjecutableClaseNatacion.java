/* David López	cu:173993
 * 15/04/2018
 * Ejercicio 5
 */
public class EjecutableClaseNatacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseNatacion claseNat = new ClaseNatacion("Sport City","Lago Zurich");
		
		claseNat.nuevaAlberca(10, 7);
		claseNat.nuevaAlberca(20, 50);
		
		System.out.println("Calcula el costo del techo: " + claseNat.calculaCostoTecho());

	}

}
