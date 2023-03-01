/* David L�pez	CU:173993
 * 14/05/2018
 * POK�MON
 */
public class Pokemon {
	private String nickname; // El usuario se lo puede asignar al Pok�mon
	private String nombre;	//Nombre de la especie de Pok�mon
	private String tipo;	// Pueden ser de tipo normal, fuego, agua, tierra, planta y m�s. Existen 18 tipos en total.
	private int numeroPokedex;	//Cada especie de Pok�mon tiene un n�mero registrado para poderlos identificar por grupos.
	private int puntosAtaque;
	private int puntosDefensa;
	private int puntosVida;
	// Los tres atributos de puntos se dan seg�n la fortaleza el Pok�mon.
	private boolean legendario;
	// Son los m�s raros del juego.
	private int nivel;
	// Un pok�mon puede estar entre nivel 1 y 100.
	private int claveUnica;
	// Para distinguir Pok�mon de la misma especie.
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
		cad.append("\nClave �nica: " + claveUnica);
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

