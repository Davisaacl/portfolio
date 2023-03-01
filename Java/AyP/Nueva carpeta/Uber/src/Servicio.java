/* David L�pez	cu:173993
 * 16/03/2019
 * Segundo examen parcial oto�o 2016
 */
public class Servicio {
	public int numConductor;
	public int numVehiculo;
	public int numPasajero;
	public int numServicio;
	public char turno;
	public int zona;
	public double numKm;
	public boolean pool;
	public static int folio = 1;
	

	public Servicio(int numConductor, int numVehiculo, int numPasajero, char turno, int zona, double numKm, boolean pool){
		this.numServicio=folio;
		folio++;
		this.numConductor = numConductor;
		this.numVehiculo = numVehiculo;
		this.numPasajero = numPasajero;
		this.turno = turno;
		this.zona = zona;
		this.numKm = numKm;
		this.pool = pool;
	}
	
	public int getNumConductor(){
		return this.numConductor;
	}
	
	public int getNumVehiculo(){
		return this.numVehiculo;
	}
	
	public int getNumPasajero(){
		return this.numPasajero;
	}
	
	public int getNumServicio(){
		return this.numServicio;
	}
	
	public char getTurno(){
		return this.turno;
	}
	
	public int getZona(){
		return this.zona;
	}
	
	public double getNumKm(){
		return this.numKm;
	}
	
	public boolean isPool(){
		return this.pool;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("N�mero del conductor: " + numConductor);
		cad.append("N�mero del Veh�culo: " + numVehiculo);
		cad.append("N�mero del Pasajero: " + numPasajero);
		cad.append("N�mero del servicio: " + numServicio);
		cad.append("Turno del viaje: " + turno);
		cad.append("Zona del viaje: " + zona);
		cad.append("N�mero de kil�metros: " + numKm);
		cad.append("Pool: " + pool);
		return cad.toString();
	}
	

}

