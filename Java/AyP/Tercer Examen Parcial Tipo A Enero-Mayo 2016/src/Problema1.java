import java.util.ArrayList;
/* David López	cu: 173993
 * Problema 1
 * 22/04/2018
 */
public class Problema1 {
	public static ArrayList <String> repetirPalabras(int [] arrV, String [] arrP){
		ArrayList <String> lista = new ArrayList<String>();
		
		for(int i=0;i<arrV.length;i++){
			for(int j=0;j<arrV[i];j++){
				lista.add(arrP[i]);
			}
		}
		return lista;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrVeces[] = {2,3,5,1,4};
		String arrPalabras[] = {"a", "ese", "i", "hola", "u"};
		ArrayList<String> repPal = new ArrayList<String>();
		
		repPal = repetirPalabras(arrVeces,arrPalabras);
		System.out.println(repPal.toString());

	}

}
