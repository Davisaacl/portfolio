import java.util.ArrayList;
/* David López	CU:173993
 * 22/04/2018
 * Problema 1
 */
public class EncriptaNumeros {
	public static ArrayList<Integer> encripta(int arrD[]){
		ArrayList <Integer> lista = new ArrayList <Integer>();
		int aux;
		int codigo [] = {9,5,4,2,7,6,1,3,0,8};
		
		for (int i=0;i<arrD.length;i++){
			aux = arrD[i];
			lista.add(codigo[aux]);
		}
		return lista;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrP[] = {5,7,9,2,1};
		ArrayList <Integer> al = new ArrayList <Integer>();
		
		al = encripta(arrP);
		System.out.println(al);
	}
}
