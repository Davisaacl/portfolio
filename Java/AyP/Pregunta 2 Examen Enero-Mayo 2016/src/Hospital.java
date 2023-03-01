/* David López	cu: 173993
 * Problema 2
 * 22/04/2018
 */
public class Hospital {
	private String nombre;
	private int yearFundacion;
	private Medico arrMedicos [];
	private int lleno;
	private final int MAX = 20;
	
	public Hospital(){
		this.lleno = 0;
		this.arrMedicos = new Medico[MAX];
	}
	
	public Hospital(String nombre, int yearFundacion) {
		this();
		this.nombre = nombre;
		this.yearFundacion = yearFundacion;
	}
	// b)
	public boolean darAltaMedico(String nombreMed, boolean homenaje, String especialidad){
		boolean resp = false;
		Medico nuevo;
		
		if (lleno<MAX){
			nuevo = new Medico(nombreMed,homenaje,especialidad);
			this.lleno++;
			resp = true;
		}
		return resp;
	}
	//c)
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nNombre: " + nombre);
		cad.append("\nAño de fundación: " + yearFundacion);
		cad.append("\nNúmero de médicos: " + lleno);
		cad.append("\nCapcidad máxima" + MAX);
		for (int i=0;i<lleno;i++)
			cad.append(arrMedicos[i].toString());
		return cad.toString();
	}
	// d)
	public int cuantosHomenaje(){
		int resp = 0;
		
		for(int i=0;i<lleno;i++){
			if(arrMedicos[i].isHomenaje())
				resp++;
		}
		return resp;
	}
	// e)
	public int cuantosEspecialidad(String especialidad){
		int resp = 0;
		
		for (int i=0;i<lleno;i++){
			if(arrMedicos[i].getEspecialidad().equals(especialidad))
				resp++;
		}
		return resp;
	}
}
