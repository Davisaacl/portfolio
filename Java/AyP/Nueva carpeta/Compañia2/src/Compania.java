/* David López	cu: 173993
 * 13/04/2018
 * Ejercicio 4
 */
public class Compania {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double ventas[];
	private String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private int totalVentas;
	private final int MAX = 12;
	
	public Compania(String nombre){
		totalVentas = 0;
		this.ventas = new double [totalVentas];
		this.nombre = nombre;
	}
	
	public Compania(String nombre, String direccion, String ciudad, String director) {
		this(nombre);
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDirector() {
		return director;
	}

	public double getUnaVentas(int mes) {
		return ventas[mes-1];
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public boolean altaVenta(double venta){
		boolean res = false;
		
		if (totalVentas<MAX){
			ventas[totalVentas] = venta;
			totalVentas++;
		}
		res = true;
		return res;
	}
	
	public double promedio(){
		return ManejadorArreglos.promedio(ventas, totalVentas);
	}
	
	public String mesMayor(){
		int pos;
		
		pos =ManejadorArreglos.posMayor(ventas, totalVentas);
		return meses[pos];
	}
	
	public int cuantosMesesMayorPromedio(){
		double prom;
		
		prom = promedio();
		return ManejadorArreglos.cuantosMayorX(ventas, totalVentas, prom);
	}
	
	public double totalVentas(){
		return ManejadorArreglos.suma(ventas, totalVentas);
	}
	
	public String mesMenor(){
		int pos;
		
		pos = ManejadorArreglos.posMenor(ventas, totalVentas);
		return meses[pos];
	}
	
	public String toString(){ // TERMINAR
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n Compañíade nombre: " + nombre);
		
		for(int i=0;i<totalVentas;i++){
			cad.append("\n mes: " + meses[i]);
			cad.append("\n mes: " + ventas[i]);
		}
		return cad.toString();
		
		
	}
}
