import java.util.ArrayList;
/* David López	CU:173993
 * Examen final Enero-Mayo 2014
 */
public class Problema4 {
	public static ArrayList <Integer> incrementa (double arr1[], double arr2[]){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		if (arr1.length==arr2.length)
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]*1.1 <= arr2[i])
					lista.add(i);
			}
		return lista;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costos1 [] = {45.30,56.00,10.20,4.20,23.50,6.00,4.00,3.00};
		double costos2 [] = {45.30,62.72,10.20,4.20,23.50,6.90,4.30,3.00};
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista = incrementa(costos1, costos2);
		System.out.println(lista);

	}

}
