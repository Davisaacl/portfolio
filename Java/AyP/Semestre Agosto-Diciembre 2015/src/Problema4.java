/* David López	CU:173993
 * Examen final Agosto-Diciembre 2015
 */
public class Problema4 {
	
	public static boolean isEspejo(int arr[], int n){
		boolean resp = true;
		int i = 0;
		int aux = n-1;
		
		while (i<(n/2) && resp){
			if (arr[i]==arr[aux-i])
				resp = true;
			else
				resp = false;
			i++;
		}
		return resp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,3,2,1};
		
		System.out.println(isEspejo(arr,6));

	}

}
