/* DAVID LÓPEZ 	CU:173993
 * 12/04/2018
 * Ejercicio 3
 */
public class Compañia {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double ventas[];
	private String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private int totalVentas;
	
	public Compañia(){
		totalVentas = 12;
		this.ventas = new double [totalVentas];
	}
	
	public Compañia(String nombre, String direccion, String ciudad, String director) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("Dirección: " + direccion);
		cad.append("Ciudad: " + ciudad);
		cad.append("Director: " + director);
		return cad.toString();
	}
	
	public int compareTo(Compañia otro){
		return this.nombre.compareTo(otro.nombre);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compañia other = (Compañia) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public double getUnaVenta(int n){
		return ventas[n];
	}
	
	/*
	public double promedio(){
		return ManejadorArreglos.promedio(ventas, MAX);
	}
	*/
	
	// ANÁLOGAMENTE, LOS DEMÁS SE PUEDEN HACER CON MANEJADOR ARREGLOS
	
	public double promedio(){
		double promedio, suma = 0.0;
		
		for (int i=0;i<totalVentas;i++)
			suma+=ventas[i];
		promedio = suma/totalVentas;
		return promedio;
	}
	
	public int mesMayor(){
		int mayorMes = 0;
		double mayorVenta = ventas[0];
		
		for (int i=1;i<totalVentas;i++)
			if (mayorVenta<ventas[i]){
				mayorVenta = ventas[i];
				mayorMes=i;
			}
		return mayorMes;
	}
	
	public String mayorMes(){
		String res;
		
		res = meses[mesMayor()];
		return res;
	}
	
	public int mesMenor(){
		int menorMes = 0;
		double menorVenta = ventas[0];
		
		for (int i=1;i<totalVentas;i++)
			if (menorVenta>ventas[i]){
				menorVenta = ventas[i];
				menorMes=i;
			}
		return menorMes;
	}
	
	public String menorMes(){
		String res;
		
		res = meses[mesMenor()];
		return res;
	}
	
	public int arribaPromedio(){
		int cont = 0;
		
		for (int i=0;i<totalVentas;i++)
			if (ventas[i]<promedio())
				cont++;
		return cont;
	}
	
	public double totalUnidades(){
		double suma = ventas[0];
		
		for (int i=1;i<totalVentas;i++)
			suma+=ventas[i];
		return suma;
	}

}
