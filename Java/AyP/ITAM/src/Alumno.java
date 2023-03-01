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
	private int numeroMaterias;
	private double calificaciones[];
	private String materias[];
	private final int MAX = 100;
	
	public Alumno(){
		this.numeroMaterias = 0;
		this.calificaciones = new double [MAX];
		this.materias = new String [MAX];
		
	}
	
	public Alumno(int claveUnica, String nombre, String carrera, int semestre, boolean beca, String genero, int yearNacimiento){
		this();
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
	
	public int getNumeroMaterias() {
		return numeroMaterias;
	}

	public double getUnaCalificacion(int index){
		double resp = 0;
		
		resp = calificaciones[index];
		return resp;
	}
	
	public String getUnaMateria(int index){
		String resp;
		
		resp = materias[index];
		return resp;
	}
	
	public int calculaEdad(){
		int resp = 2018;
		
		resp-=yearNacimiento;
		return resp;
	}
	
	public boolean altaCalificacion(String materia, double calificacion){
		boolean resp = false;
		
		if (this.numeroMaterias<MAX){
			calificaciones[numeroMaterias] = calificacion;
			materias[numeroMaterias] = materia;
			numeroMaterias++;
			resp = true;
		}
		return resp;
	}
	
	public double promedio(){
		return ManejadorArreglos.promedio(calificaciones, numeroMaterias);
	}
	
	public double promedioSinManejador(){
		double promedio = 0;
		
		for(int i=0;i<numeroMaterias;i++){
			promedio+=calificaciones[i];
		}
		promedio/=numeroMaterias;
		return promedio;
	}
	
	public double getUnaCalif(String materia){
		double calif = 0;
		int posMateria = 0;
		
		for (int i=0;i<numeroMaterias;i++){
			if(materias[i].equals(materia))
				posMateria = i;
		}
		calif = calificaciones[posMateria];
		return calif;
	}

}
