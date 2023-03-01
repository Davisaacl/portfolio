
public class PruebaLAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaArregloDesordenada<String> lista = new ListaArregloDesordenada<String>();
		
		lista.addFirst("David");
		lista.addFirst("Paola");
		lista.addFirst("Hugo");
		lista.addFirst("Sofía");
		lista.addFirst("Carola");
		
		// toString
		// System.out.println(lista.toString());
		
		// elimina
		System.out.println(lista.remove("Hugo"));
		
		System.out.println(lista.toString());

	}

}
