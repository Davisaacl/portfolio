/* David L�pez	cu: 173993
 * Problema 2
 * 22/04/2018
 */
public class EjecutableHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hosp1 = new Hospital("INPER IER", 1977);
		
		hosp1.darAltaMedico("Silvia",true,"Pediatr�a");
		hosp1.darAltaMedico("David",true,"Pediatr�a");
		
		System.out.println("Informaci�n Hospital: " + hosp1.toString());
		
		System.out.println("�Cu�ntos m�dicos a homaneje? " + hosp1.cuantosHomenaje());
		
		System.out.println("�Cu�ntos m�dicos en Pediatr�a? " + hosp1.cuantosEspecialidad("Pediatr�a"));
		

	}

}
