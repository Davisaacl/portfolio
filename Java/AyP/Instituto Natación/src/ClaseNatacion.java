/* David L�pez	cu:173993
 * 15/04/2018
 * Ejercicio 5
 */
public class ClaseNatacion {
	private String nombre;
	private String domicilio;
	private int numAlbercas;
	private double tama�oAlbercas;
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

	public double getTama�oAlbercas() {
		return tama�oAlbercas;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("\nDomicilio: " + domicilio);
		cad.append("\nN�mero de albercas: " + numAlbercas);
		cad.append("\nTama�o de las albercas: " + tama�oAlbercas);
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
	
	public double calculaTama�oAlbercas(){
		double resp=0;
		
		for (int i=0;i<numAlbercas;i++){
			resp+=arrAlbercas[i].calculaArea();
			this.tama�oAlbercas = resp;
		}
		return resp;
	}
	
	public double calculaCostoTecho(){
		double resp;
		
		resp = calculaTama�oAlbercas()*1000;
		return resp;
	
	}
}