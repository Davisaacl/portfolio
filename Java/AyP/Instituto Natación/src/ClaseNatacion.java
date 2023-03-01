/* David López	cu:173993
 * 15/04/2018
 * Ejercicio 5
 */
public class ClaseNatacion {
	private String nombre;
	private String domicilio;
	private int numAlbercas;
	private double tamañoAlbercas;
	private Rectangulo [] arrAlbercas;
	private final int MAX = 100;
	
	public ClaseNatacion() {
		this.numAlbercas = 0;
		this.arrAlbercas = new Rectangulo[MAX];		
	}

	public ClaseNatacion(String nombre, String domicilio) {
		this();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumAlbercas() {
		return numAlbercas;
	}

	public void setNumAlbercas(int numAlbercas) {
		this.numAlbercas = numAlbercas;
	}

	public double getTamañoAlbercas() {
		return tamañoAlbercas;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("\nDomicilio: " + domicilio);
		cad.append("\nNúmero de albercas: " + numAlbercas);
		cad.append("\nTamaño de las albercas: " + tamañoAlbercas);
		for (int i=0;i<=numAlbercas;i++){
			cad.append("\nAlberca: " + i+1 + arrAlbercas[i]);
		}
		return cad.toString();
	}
	
	public int compareTo(ClaseNatacion otro){
		return this.nombre.compareTo(otro.nombre);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaseNatacion other = (ClaseNatacion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public boolean nuevaAlberca(double altura, double base){
		boolean resp = false;
		Rectangulo alberca = new Rectangulo(altura,base);
		
		if (this.numAlbercas<MAX){
			arrAlbercas[this.numAlbercas] = alberca;
			numAlbercas++;
		}
		resp = true;
		return resp;
	}
	
	public double calculaTamañoAlbercas(){
		double resp=0;
		
		for (int i=0;i<numAlbercas;i++){
			resp+=arrAlbercas[i].calculaArea();
			this.tamañoAlbercas = resp;
		}
		return resp;
	}
	
	public double calculaCostoTecho(){
		double resp;
		
		resp = calculaTamañoAlbercas()*1000;
		return resp;
	
	}
}