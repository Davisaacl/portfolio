import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/* David López	cu:173993
 * ManejadorArreglos genérico
 * 27/04/2018
 */
public class PruebaManejadorArreglosConArchivos {
	private final static int MAX = 100;
	
	public static <T> void imprimeArreglo(T arr [], int n){
		for (int i=0;i<n;i++)
			System.out.println("\t" + arr[i].toString());
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr;
		File archivo =new File("nombreAlus.txt");
		int n;
		
		try (Scanner lee = new Scanner(archivo)){
			arr = new String[MAX];
			n = 17;
			for (int i=0;i<n;i++)
				arr[i] = lee.next();
			imprimeArreglo(arr,n);
			ManejadorArreglosGenerico.ordenamientoPorSeleccionDirecta(arr, n);
			imprimeArreglo(arr,n);
			lee.close();
		}
		catch (FileNotFoundException fnfe){
			System.err.println("E R R O R " + fnfe);
			System.exit(-1);
		}
		
		
		
		

	}

}


