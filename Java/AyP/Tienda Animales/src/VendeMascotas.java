/* David López	CU:173993
 * 04/05/2018
 * Vende Mascotas
 */
public class VendeMascotas {
	private TiendaMascotas tienda;
	private ListaArregloOrdenada listaAnimalesVendidos;
	
	public VendeMascotas(String nombre, String direccion){
		TiendaMascotas tienda;
		
		tienda = new TiendaMascotas (nombre, direccion);
		this.tienda = tienda;
		this.listaAnimalesVendidos = new ListaArregloOrdenada<Animal>();
	}
	
	public Animal vendeAnimal(String nombre, String tipo, String raza, boolean exotico){
		Animal resp = tienda.venderAnimal(nombre, tipo, raza, exotico);
		
		listaAnimalesVendidos.add(resp);
		return resp; 
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append(tienda.toString());
		for (int i=0; i<listaAnimalesVendidos.size();i++)
			cad.append(listaAnimalesVendidos.get(i).toString());
		return cad.toString();
	}
}