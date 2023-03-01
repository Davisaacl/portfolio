import java.util.Scanner;
/* David López	cu:173993
 * ManejadorArreglos genérico
 * 27/04/2018
 */
public class PruebaManejadorGenerico {
	private final static int MAX = 100;
	
	public static <T> void imprimeArreglo(T arr [], int n){
		for (int i=0;i<n;i++)
			System.out.println("\t" + arr[i].toString());
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr;
		Scanner lee;
		int n;
		
		arr = new String[MAX];
		lee = new Scanner(System.in);
		n = 17;
		for (int i=0;i<n;i++)
			arr[i] = lee.next();
		imprimeArreglo(arr,n);
		ManejadorArreglosGenerico.ordenamientoPorSeleccionDirecta(arr, n);
		imprimeArreglo(arr,n);
		
		
		

	}

}
