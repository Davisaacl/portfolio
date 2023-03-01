/* David López	CU:173993
 * 04/05/2018
 * LISTA ARREGLO ORDENADA
 */
public class Animal implements Comparable<Animal>{
	private String especie;
	private String genero;
	private String familia;
	private String clase;
	private String filum;
	private String reino;
	private String dominio;
	
	public String getEspecie() {
		return especie;
	}

	public String getGenero() {
		return genero;
	}

	public String getFamilia() {
		return familia;
	}

	public String getClase() {
		return clase;
	}

	public String getFilum() {
		return filum;
	}

	public String getReino() {
		return reino;
	}

	public String getDominio() {
		return dominio;
	}

	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n Especie: " + especie);
		cad.append("\n Género: " + genero);
		cad.append("\n Familia: " + familia);
		cad.append("\n Clase: " + clase);
		cad.append("\n Filum: " + filum);
		cad.append("\n Reino: " + reino);
		cad.append("\n Domino: " + dominio);
		return cad.toString();
	}
	
	public int compareTo(Animal otro){
		return this.especie.compareTo(otro.especie);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		return true;
	}
	
	

}
