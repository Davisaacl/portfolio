/* David López	cu: 173993
 * Problema 2
 * 22/04/2018
 */
public class Medico {
	private String nombre;
	private boolean homenaje;
	private String especialidad;
	
	public Medico(String nombre, boolean homenaje, String especialidad){
		this.nombre = nombre;
		this.homenaje = homenaje;
		this.especialidad = especialidad;
	}

	public boolean isHomenaje() {
		return homenaje;
	}

	public void setHomenaje(boolean homenaje) {
		this.homenaje = homenaje;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre: " + nombre);
		cad.append("\n Especialidad: " + especialidad);
		cad.append("\n Homenaje" + homenaje);
		return cad.toString();
	}
	
	public int compareTo(Medico otro){
		return this.nombre.compareTo(otro.nombre);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
