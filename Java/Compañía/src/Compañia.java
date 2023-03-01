/* David López	cu: 173993
 * 
 */
public class Compañia {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double [] ventas;
	private int totalVentas;
	private final int MAX = 1000000;
	
	public Compañia(){
		totalVentas = 0;
		this.ventas = new double [MAX];
	}
	
	public Compañia (String nombre, String direccion, String ciudad, String director){
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
	}
	
	
}
