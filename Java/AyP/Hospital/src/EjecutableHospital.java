/* David López	cu: 173993
 * Problema 2
 * 22/04/2018
 */
public class EjecutableHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hosp1 = new Hospital("INPER IER", 1977);
		
		hosp1.darAltaMedico("Silvia",true,"Pediatría");
		hosp1.darAltaMedico("David",true,"Pediatría");
		
		System.out.println("Información Hospital: " + hosp1.toString());
		
		System.out.println("¿Cuántos médicos a homaneje? " + hosp1.cuantosHomenaje());
		
		System.out.println("¿Cuántos médicos en Pediatría? " + hosp1.cuantosEspecialidad("Pediatría"));
		

	}

}
