/* David López	CU:173993
 * 04/05/2018
 * Tienda Mascotas
 */
public class TiendaMascotas {
	private String nombre;
	private String direccion;
	private ListaArregloOrdenada <Animal> listaAnimales;
	
	public TiendaMascotas(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaAnimales = new ListaArregloOrdenada <Animal> ();
	}
	
	public boolean nuevoAnimal(String nombre, String tipo, String raza, boolean exotico){
		Animal objA = new Animal (nombre, tipo, raza, exotico);
		
		return listaAnimales.add(objA);
	}
	
	public Animal venderAnimal(String nombre, String tipo, String raza, boolean exotico){
		Animal objA = new Animal (nombre, tipo, raza, exotico);
		
		return listaAnimales.remove(objA);
	}
	
	public String setDireccion(String direccion){
		this.direccion = direccion;
		return this.direccion;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("Dirección: " + direccion);
		for (int i=0;i<listaAnimales.size();i++)
			cad.append("Animal: " + listaAnimales.get(i).toString());
		return cad.toString();
	}
	
	public int cuantosAnimalesTipo(String tipo){
		int resp = 0;
		
		for (int i=0;i<listaAnimales.size();i++){
			if (listaAnimales.get(i).getNombre().compareTo(tipo)==0)
				resp++;
		}
		return resp;
	}
	
	public boolean isAnimalExotico(){
		boolean resp = false;
		int i=0;
		
		while (i<listaAnimales.size() || !listaAnimales.get(i).isExotico())
			i++;
		if (i<listaAnimales.size())
			resp = true;
		return resp;
	}
}
