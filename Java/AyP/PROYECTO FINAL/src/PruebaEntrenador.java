/* David López	CU:173993
 * 14/05/2018
 * POKÉMON prueba 1
 */
public class PruebaEntrenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon p1 = new Pokemon("Bulbasaur", "Bulbasaur", "Planta", 1, 13, 17, 20, 5, false);
		
		System.out.println(p1.toString());
		
		Entrenador entrenador1 = new Entrenador ("David", "Kanto", 56);
		
		entrenador1.nuevoPokemon("Chimchar", "Chimchar", "fuego", 390, 15, 15, 20, 5, false);
		entrenador1.nuevoPokemon("Torchic", "Torchic", "fuego", 255, 16, 14, 20, 5, false);
		entrenador1.nuevoPokemon("Dios", "Arceus", "Normal", 493, 300, 300, 300, 80, true);
		
		
		System.out.println(entrenador1.toString());
		
		entrenador1.liberaPokemon(0);
		
		System.out.println("\n Después de eliminar a Chimchar" + entrenador1.toString());
		
		System.out.println(entrenador1.existeUnPokemon("Chimchar", "Chimchar", "fuego", 390, 15, 15, 20, 5, false));
		
		System.out.println("¿Cuántos de tipo fuego? " + entrenador1.cuantosTipoX("fuego"));
		
		System.out.println("¿Hay alguno legendario? " + entrenador1.algunoEsLegendario());
		
		System.out.println("¿Cuál es el más fuerte? " + entrenador1.cualEsMasFuerte());

	}

}
