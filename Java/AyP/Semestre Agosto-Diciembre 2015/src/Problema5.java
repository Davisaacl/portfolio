/* David López	CU:173993
 * Examen final Agosto-Diciembre 2015
 */
public class Problema5 {
	
	public static <T> boolean isIguales (T[] arr1, int n, T[] arr2, int m){
		boolean resp = false, prueba;
		int i=0;
		
		if (n==m)
			while (!resp && i<n){
				prueba = arr1[i].equals(arr2[i]);
				if (prueba)
					i++;
			}
		if (i==n)
			resp = true; 
		return resp;
	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo a = new Rectangulo (5,5);
		Rectangulo b = new Rectangulo (5,5);
		Rectangulo c = new Rectangulo (5,5);
		T a1 =(T) a, a2 =(T) b, a3 = (T) c;
		
		T arr1[] = (T[]) new Object[3];
		T arr2[] = (T[]) new Object[3];
		
		arr1[0] = a1;
		arr2[0] = a1;
		arr1[1] = a2;
		arr2[1] = a2;
		arr1[2] = a3;
		arr2[2] = a3;
		
		// prueba
		
		System.out.println(isIguales(arr1,3,arr2,3));
	}

}
