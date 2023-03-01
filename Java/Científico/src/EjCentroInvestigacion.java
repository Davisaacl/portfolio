/* David López	cu: 173993
 * 07/03/2018
 * Clase calculadora
 */
public class EjCentroInvestigacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cientifico c1, c2;
		int res;
		
		c1 = new Cientifico("Frida","Ingeniería", 19);
		c2 = new Cientifico("Jesús","Ingeniería", 20);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		if(c1.equals(c2))
			System.out.println("Ambos objetos son iguals");
		else
			System.out.println("Ambos objetos no son iguales");
		
		res = c1.compareTo(c1);
		if(res == 0)
			System.out.println("Los objetos son iguales");
		else
			if(res>0)
				System.out.println("El primer objeto es menor que el segundo");
			else 
				System.out.println("El primer objeto es menor que el segundo");

	}

}
