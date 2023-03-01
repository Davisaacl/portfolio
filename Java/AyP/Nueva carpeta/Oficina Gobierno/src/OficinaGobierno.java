import java.util.Arrays;

/* David López	cu: 173993
 * 08/04/2018
 * Ejercicio Arreglos Paralelos
 */
public class OficinaGobierno {
	private String encargado;
	private double [] poblacion;
	private String [] nombreEstado;
	private int numEstado;
	private final int TOT_EDOS = 32;
	
	public OficinaGobierno(){
		numEstado=0;
		this.poblacion = new double [TOT_EDOS];
		this.nombreEstado = new String [TOT_EDOS];
	}
	
	public OficinaGobierno(String encargado){
		this();
		this.encargado = encargado;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public double[] getPoblacion() {
		return poblacion;
	}

	public String[] getNombreEstado() {
		return nombreEstado;
	}

	public int getNumEstado() {
		return numEstado;
	}
	
	public double getUnaPoblacion(int n){
		return poblacion[n];
	}
	
	public String getUnEstado(int n){
		return nombreEstado[n];
	}
	
	public boolean altaInfo(String estado, double poblacion){
		boolean resp = false;
		
		if (numEstado<TOT_EDOS){
			nombreEstado[numEstado] = estado;
			this.poblacion[numEstado]=poblacion;
			resp = true;
			numEstado++;
		}
		return resp;
	}
	
	public String estadoMayorPoblacion(){
		String estadoMayor = null;
		int mayorPoblacion = 0;
		
		mayorPoblacion = ManejadorArreglos.posMayor(poblacion, TOT_EDOS);
		estadoMayor=nombreEstado[mayorPoblacion];
		return estadoMayor;
	}

/*	public String MayorPoblacion(){
	int posM;
	
	posM=ManejadorArreglos.posMayor(poblacion,numEstado);
	return numEstado;
	}

	public double promHabitantesNacion(){
		double promedio;
		
		promedio = ManejadorArreglos.promedio(poblacion, numEstado);
		return promedio;
	}

	public int totEdosMenorPoblacion(){
		double prom = 0;
		
		prom = promHabitantesNacion();
		return ManejadorArreglos.cuantosMenorX(poblacion, numEstado,prom);;
	}
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nNombre encargado: " + encargado);
		cad.append("\nNúmero de estados: " + numEstado);
		cad.append(¨\Información de los estados: ");
		for (int i = 0;i<numEstado;i++){
			cad.append("Estado " + nombreEstado[i]);
			cad.append("Poblacion " + poblacion[i]);
		}
		return cad.toString();
	}
*/
	public double promHabitantesNacion(){
		double promedio;
		
		promedio = ManejadorArreglos.promedio(poblacion, TOT_EDOS);
		return promedio;
	}
	
	public int totEdosMenorPoblacion(){
		int cont = 0;
		
		cont = ManejadorArreglos.cuantosMenorX(poblacion, TOT_EDOS, promHabitantesNacion());
		return cont;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("Nombre encargado: " + encargado);
		cad.append("Número de estados: " + numEstado);
		for (int i = 0;i<TOT_EDOS;i++){
			cad.append("Estado " + nombreEstado[i]);
			cad.append("Poblacion " + poblacion[i]);
		}
		return cad.toString();
	}

	public int compareTo(OficinaGobierno otro){
		return this.encargado.compareTo(otro.encargado);
	}

	public boolean equals(OficinaGobierno otro){
		return this.encargado.equals(otro.encargado);
	}
	
	//equals solo con el atributo encargado	
	
	// GENERADO AUTOMÁTICAMENTE
	public boolean equals2(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OficinaGobierno other = (OficinaGobierno) obj;
		if (TOT_EDOS != other.TOT_EDOS)
			return false;
		if (encargado == null) {
			if (other.encargado != null)
				return false;
		} else if (!encargado.equals(other.encargado))
			return false;
		if (!Arrays.equals(nombreEstado, other.nombreEstado))
			return false;
		if (numEstado != other.numEstado)
			return false;
		if (!Arrays.equals(poblacion, other.poblacion))
			return false;
		return true;
	}

	

}
