import java.util.Scanner;
/* David López	cu: 173993
 * 02/03/2018
 * Instanciar científicos
 */
public class EjCientifico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cientifico objC1, objC2;
		boolean resp;
		String nombre, especialidad;
		int edad;
		Scanner lee = new Scanner (System.in);
		
		System.out.println("¿Quieres crear un científico?");
		resp = lee.nextBoolean();
		
		System.out.println("¿Cómo quieres que se llame el cientifico 1?");
		nombre = lee.next();
		System.out.println("¿Cuál es su especialidad?");
		especialidad = lee.next();
		System.out.println("¿Qué edad tiene?");
		edad = lee.nextInt();
		objC1 = new Cientifico ();
		objC1.setNombre(nombre);
		objC1.setEspecialidad(especialidad);
		objC1.setEdad(edad);
		System.out.println("Nombre " + nombre + " especialidad " + especialidad + " edad " + edad);
		
		
		System.out.println("¿Cómo quieres que se llame el cientifico 2?");
		nombre = lee.next();
		System.out.println("¿Cuál es su especialidad?");
		especialidad = lee.next();
		System.out.println("¿Qué edad tiene?");
		edad = lee.nextInt();
		objC1 = new Cientifico (nombre, especialidad, edad);
		objC1.getNombre();
		objC1.getEspecialidad();
		objC1.getEdad();
		System.out.println("Nombre " + nombre + " especialidad " + especialidad + " edad " + edad);
		
		
		//TAREAS ENTREGA 19/03/2018
		// TAREAS 8,9,10,11,12,13,14,15,23,24
		
		Cientifico objC3 = new Cientifico("Einstein","física",63);
		System.out.println(objC3.toString());
		System.out.println(objC3.compareTo(objC1));
		
		//System.out.println(objC3.equals(objC2));
		
		System.out.println(objC3.estaOrdenCreciente(2, 4));
		System.out.println(objC3.ordenaCreciente(5, 1));
		System.out.println(objC3.esImpar(4));
		
		System.out.println(objC3.calculaFuncion1(1));
		System.out.println(objC3.calculaFuncion1(12));
		System.out.println(objC3.calculaFuncion1(34));
		System.out.println(objC3.calculaFuncion1(65));
		
		
		System.out.println(objC3.calculaFuncion2(4));
		System.out.println(objC3.calculaFuncion2(5));
		System.out.println(objC3.calculaFuncion2(6));
		System.out.println(objC3.calculaFuncion2(7));
		
		
		System.out.println(objC3.calculaFuncion3(1,2));
		System.out.println(objC3.calculaFuncion3(2,2));
		System.out.println(objC3.calculaFuncion3(3,2));
		System.out.println(objC3.calculaFuncion3(4,2));
		
		System.out.println(objC3.calculaUllman(3));
	}

}
