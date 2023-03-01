import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/* David López	CU:173993
 * 02/05/2018
 * LISTA ARREGLO ORDENADA
 */
public class PruebaLAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ent= new File("nombresAlus.txt");
		ListaArregloOrdenada<String> lista;
		int n;
		String x;
		
		try(Scanner lee = new Scanner(ent)){
			n = lee.nextInt();
			lista = new ListaArregloOrdenada<String>();
			for (int i=0;i<n;i++){
				x = lee.next();
				System.out.println(x);
				lista.add(x);
			}
			System.out.println(lista.toString());
			lee.close();
		}
		catch(FileNotFoundException fnfe){
			System.err.println(fnfe);
			System.exit(-1);
		}

	}

}
