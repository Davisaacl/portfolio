import java.util.ArrayList;
/* David López	CU:173993
 * Examen final Agosto-Diciembre 2015
 */
public class Problema3 {
	
	public static ArrayList<Integer> cualesSonMultiplosX(int arr[], int n, int num){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++){
			if (num%arr[i] == 0)
				lista.add(arr[i]);
		}
		return lista;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista = cualesSonMultiplosX(arr,5,10);
		System.out.println(lista);

	}

}
