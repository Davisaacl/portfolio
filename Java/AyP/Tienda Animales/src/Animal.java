/* David López	CU:173993
 * 04/05/2018
 * Mascotas
 */
public class Animal implements Comparable<Animal>{
	private String nombre;
	private String tipo;
	private String raza;
	private boolean exotico;

	public Animal (String nombre, String tipo, String raza, boolean exotico){
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.exotico = exotico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public String getRaza() {
		return raza;
	}

	public boolean isExotico() {
		return exotico;
	}

	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("Tipo: " + tipo);
		cad.append("Raza " + raza);
		cad.append("Exótico: " + exotico);
		return cad.toString();
	}
	
	public int compareTo(Animal otro){
		return this.nombre.compareTo(otro.nombre);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
}
