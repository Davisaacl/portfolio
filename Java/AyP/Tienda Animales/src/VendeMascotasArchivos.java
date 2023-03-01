import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/* David López	CU:173993
 * 04/05/2018
 * Vende Mascotas
 */
public class VendeMascotasArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiendaMascotas tienda = new TiendaMascotas ("+Kota", "Lago Zurich");
		File f1 = new File("Mascotas.txt");
		int numeroAnimales;
		String nombre;
		String tipo;
		String raza;
		boolean exotico;
		
		try(Scanner lee = new Scanner(f1)){
			numeroAnimales = lee.nextInt();
			for (int i=0;i<numeroAnimales;i++){
				nombre = lee.next();
				tipo = lee.next();
				raza = lee.next();
				exotico = lee.nextBoolean();
				tienda.nuevoAnimal(nombre, tipo, raza, exotico);
				System.out.println(tienda.getUnAnimal(i));
			}
			lee.close();
		}
		catch (FileNotFoundException fnfe){
			System.err.println("ERROR" + fnfe);
			System.exit(-1);
		}
		
		System.out.println(tienda.toString());
		System.out.println("¿Cuántos perros? " + tienda.cuantosAnimalesTipo("perro"));
		System.out.println("¿Hay exótico? " + tienda.isAnimalExotico());
		System.out.println("Se vende: " + tienda.venderAnimal("Puff", "perro", "maltés", false));


	}

}
