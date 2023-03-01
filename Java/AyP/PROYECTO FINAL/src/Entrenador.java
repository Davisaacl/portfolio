/* David L�pez	CU:173993
 * 14/05/2018
 * POK�MON
 */
public class Entrenador {
	public String nombre;
	public String region;	// El juego cuenta con siete regiones diferentes
	public int numMedallas;	// en cada regi�n se derrotan gimnasios y eso da en�mero de medallas del entrenador
	public int claveEntrenador;	// todo entrenador tiene clave �nica. Se pueden crear varios entrenadores en otros proyectos
	public static int generador = 1000;
	private ListaArregloDesordenada <Pokemon> listaPokemon; //lista de Pok�mones del entrenador
	
	public Entrenador(){
		claveEntrenador = generador;
		generador++;
	}

	public Entrenador(String nombre, String region, int numMedallas) {
		this();
		this.nombre = nombre;
		this.region = region;
		this.numMedallas = numMedallas;
		this.listaPokemon = new ListaArregloDesordenada <Pokemon> ();
	}

	public int getNumMedallas() {
		return numMedallas;
	}

	public void setNumMedallas(int numMedallas) {
		this.numMedallas = numMedallas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRegion() {
		return region;
	}

	public int getClaveEntrenador() {
		return claveEntrenador;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nNombre: " + nombre);
		cad.append("\nRegion " + region);
		cad.append("\nN�mero de medallas: " + numMedallas);
		cad.append("\nClave del entrenador: " + claveEntrenador);
		for (int i=0;i<listaPokemon.size();i++)
			cad.append(listaPokemon.get(i).toString());
		return cad.toString();
	}
	
	public int compareTo(Entrenador otro){	//los entrenadores se diferencian, principalmente, por su clave �nica
		return this.claveEntrenador-otro.claveEntrenador;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrenador other = (Entrenador) obj;
		if (claveEntrenador != other.claveEntrenador)
			return false;
		return true;
	}
	
	public String getUnPokemon(int pos){
		String resp = null;
		
		if (pos>=0 && pos<listaPokemon.size())	//Se valida pos para ver si existe esa posici�n y verificar si tiene Pok�mon
			resp = listaPokemon.get(pos).toString();
		return resp;
	}
	
	public boolean nuevoPokemon (String nickname, String nombre, String tipo, int numeroPokedex, int puntosAtaque, int puntosDefensa, int puntosVida,
			int nivel, boolean legendario){		// Los entrenadores al capturar un Pok�mon, tienen uno nuevo en su lista, por lo que se agrega un nuevo Pok�mon
		boolean resp = false;
		Pokemon a = new Pokemon (nickname, nombre, tipo, numeroPokedex, puntosAtaque, puntosDefensa, puntosVida, 
				nivel, legendario);
		
		resp = listaPokemon.add(a, listaPokemon.size());
		return resp;
	}
	
	public Pokemon liberaPokemon(int pos){	// Los entrenadores pueden dejar en libertad a los Pok�mones que deseen. Ellos pueden hacerlo sin ninguna condici�n
		Pokemon resp = null;
		
		if (pos>=0 && pos<listaPokemon.size())
			resp = listaPokemon.remove(pos);
		return resp;
	}
	
	
	public boolean existeUnPokemon(String nickname, String nombre, String tipo, int numeroPokedex, int puntosAtaque, int puntosDefensa, int puntosVida,
			int nivel, boolean legendario){	// En la lista, los entrenadores pueden verificar si hay un Pok�mon con las caracter�sticas que ellos quieren.
		Pokemon a = new Pokemon (nickname, nombre, tipo, numeroPokedex, puntosAtaque, puntosDefensa, puntosVida, 
				nivel, legendario);
		
		return listaPokemon.contains(a);
	}
	
	public int cuantosTipoX (String tipo){ //El tipo es de los diversos tipos que pueden ser los Pok�mon, como fuego, agua, planta, tierra, entre otros
		int resp = 0;
		
		for (int i=0;i<listaPokemon.size();i++){
			if (listaPokemon.get(i).getTipo().equals(tipo))
				resp++;
		}
		return resp;
	}
	
	public boolean algunoEsLegendario(){	// Los legendarios son muy raros, por lo que siempre se intentar� verificar si uno tiene Pok�mones legendarios. 
		boolean resp = false;
		int i=0;
		
		while (i<listaPokemon.size() && !listaPokemon.get(i).isLegendario())
			i++;
		if (i<listaPokemon.size())
			resp = true;
		return resp;
	}
	
	public String cualEsMasFuerte(){	//El pok�mon m�s fuerte se define por el ataque.
		Pokemon a = listaPokemon.get(0);
		
		for (int i=1;i<listaPokemon.size();i++)
			if (listaPokemon.get(i).getPuntosAtaque()>a.getPuntosAtaque())
				a = listaPokemon.get(i);
		return a.toString();
	}
}
