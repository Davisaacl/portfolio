/* David López	CU:173993
 * 14/05/2018
 * POKÉMON
 */
public class Pokemon {
	private String nickname; // El usuario se lo puede asignar al Pokémon
	private String nombre;	//Nombre de la especie de Pokémon
	private String tipo;	// Pueden ser de tipo normal, fuego, agua, tierra, planta y más. Existen 18 tipos en total.
	private int numeroPokedex;	//Cada especie de Pokémon tiene un número registrado para poderlos identificar por grupos.
	private int puntosAtaque;
	private int puntosDefensa;
	private int puntosVida;
	// Los tres atributos de puntos se dan según la fortaleza el Pokémon.
	private boolean legendario;
	// Son los más raros del juego.
	private int nivel;
	// Un pokémon puede estar entre nivel 1 y 100.
	private int claveUnica;
	// Para distinguir Pokémon de la misma especie.
	private static int folio = 1000;
	
	public Pokemon(){
		this.claveUnica = folio;
		folio++;
	}

	public Pokemon(String nickname, String nombre, String tipo, int numeroPokedex, int puntosAtaque, int puntosDefensa, int puntosVida,
			int nivel, boolean legendario) {
		this();
		this.nickname = nickname;
		this.nombre = nombre;
		this.tipo = tipo;
		this.numeroPokedex = numeroPokedex;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		this.puntosVida = puntosVida;
		this.nivel = nivel;
		this.legendario = legendario;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public int getPuntosAtaque() {
		return puntosAtaque;
	}

	public int getPuntosDefensa() {
		return puntosDefensa;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public boolean isLegendario() {
		return legendario;
	}

	public int getClaveUnica() {
		return claveUnica;
	}

	public int getNivel() {
		return nivel;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nNombre: " + nombre);
		cad.append("\nNickname: " + nickname);
		cad.append("\nTipo: " + tipo);
		cad.append("\nNumero de Pokedex: " + numeroPokedex);
		cad.append("\nNivel: " + nivel);
		cad.append("\nPuntos de ataque: " + puntosAtaque);
		cad.append("\nPuntos de defensa: " + puntosDefensa);
		cad.append("\nPuntos de vida: " + puntosVida);
		cad.append("\nEs legendario: " + legendario);
		cad.append("\nClave única: " + claveUnica);
		return cad.toString();
	}
	
	public int compareTo(Pokemon otro){
		return this.claveUnica-otro.claveUnica;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (claveUnica != other.claveUnica)
			return false;
		return true;
	}
	
	
}

