import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/* David López	CU:173993
 * 15/05/2018
 * Archivos
 */
public class PruebaArchivos {
	protected Entrenador entrenador1 = new Entrenador ("David", "Kanto", 56);;
	
	public PruebaArchivos(){
	}
	
	public void leeArchivo (){
		String nickname;
		String nombre;
		String tipo;
		int numeroPokedex;
		int puntosAtaque;
		int puntosDefensa;
		int puntosVida;
		boolean legendario;
		int nivel;
		int n;
		File f1 = new File("Prueba.txt");
		
		try (Scanner lee = new Scanner (f1)){
			n = lee.nextInt(); // Número de pokemones en el archivo
			System.out.println(n);
			for (int i=0;i<n;i++){
				nickname = lee.next();
				nombre = lee.next();
				tipo = lee.next();
				nivel = lee.nextInt();
				numeroPokedex = lee.nextInt();
				puntosAtaque = lee.nextInt();
				puntosDefensa = lee.nextInt();
				puntosVida = lee.nextInt();
				legendario = lee.nextBoolean();
				entrenador1.nuevoPokemon(nickname, nombre, tipo, numeroPokedex, puntosAtaque, puntosDefensa, puntosVida, nivel, legendario);
				System.out.println(entrenador1.getUnPokemon(i));
			}
			lee.close();
		}
		catch (FileNotFoundException fnfe){
			System.err.println(fnfe);
			System.exit(-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaArchivos arch = new PruebaArchivos();
		
		arch.leeArchivo();

	}
}
