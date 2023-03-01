/* David López	cu:173993
 * Alumno de escuela
 * 16/04/2018
 */
public class Alumno {
	private int claveUnica;
	private String nombre;
	private String carrera;
	private int semestre;
	private boolean beca;
	private String genero;
	private int yearNacimiento;

	public Alumno(int claveUnica, String nombre, String carrera, int semestre, boolean beca, String genero, int yearNacimiento){
		this.claveUnica = claveUnica;
		this.nombre = nombre;
		this.carrera = carrera;
		this.semestre = semestre;
		this.beca = beca;
		this.genero = genero;
		this.yearNacimiento = yearNacimiento;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public boolean isBeca() {
		return beca;
	}

	public void setBeca(boolean beca) {
		this.beca = beca;
	}

	public int getClaveUnica() {
		return claveUnica;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSemestre() {
		return semestre;
	}

	public String getGenero() {
		return genero;
	}

	public int getYearNacimiento() {
		return yearNacimiento;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n ");
		cad.append("\n Nombre: " + nombre);
		cad.append("\n Clave única: " + claveUnica);
		cad.append("\n Carrera: " + carrera);
		cad.append("\n Semestre: " + semestre);
		cad.append("\n Beca: " + beca);
		cad.append("\n Género: " + genero);
		cad.append("\n Año de Nacimiento: "+ yearNacimiento);
		return cad.toString();
	}
	
	public int compareTo(Alumno otro){
		return this.claveUnica-otro.claveUnica;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (claveUnica != other.claveUnica)
			return false;
		return true;
	}
	
	public int calculaEdad(){
		int resp = 2018;
		
		resp-=yearNacimiento;
		return resp;
	}
}