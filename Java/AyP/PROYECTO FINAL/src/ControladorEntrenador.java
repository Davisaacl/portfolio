import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
/* David López	CU:173993
 * 15/05/2018
 * POKÉMON CONTROLADOR ENTRENADOR
 */
public class ControladorEntrenador extends VistaEntrenador{
	protected Entrenador entrenador1 = new Entrenador ("David", "Kanto", 56);
	
	public ControladorEntrenador (String titulo){
		super(titulo);
		this.botonAgrega.addActionListener(new EscuchadorAgrega());
		
		this.botonElimina.addActionListener(new EscuchadorElimina());
		this.botonToString.addActionListener(new EscuchadorToString());
		
		this.botonMasFuerte.addActionListener(new EscuchadorMasFuerte());
	
	}
	public void leeArchivo (){
		String nickname;
		String nombre;
		String tipo;
		int numeroPokedex;
		int puntosAtaque;
		int puntosDefensa;
		int puntosVida;
		boolean legendario;
		int nivel;
		int n;
		File f1 = new File("Pokemon.txt");
		
		try (Scanner lee = new Scanner (f1)){
			n = lee.nextInt(); // Número de pokemones en el archivo
			for (int i=0;i<n;i++){
				nickname = lee.next();
				nombre = lee.next();
				tipo = lee.next();
				nivel = lee.nextInt();
				numeroPokedex = lee.nextInt();
				puntosAtaque = lee.nextInt();
				puntosDefensa = lee.nextInt();
				puntosVida = lee.nextInt();
				legendario = lee.nextBoolean();
				entrenador1.nuevoPokemon(nickname, nombre, tipo, numeroPokedex, puntosAtaque, puntosDefensa, puntosVida, 
						nivel, legendario);
			}
			lee.close();
		}
		catch (FileNotFoundException fnfe){
			System.err.println(fnfe);
			System.exit(-1);
		}
		
	}
	
	private class EscuchadorAgrega implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			int numDex, nivel, puntosA, puntosD, puntosV;
			boolean legend;
			String strNick, strNom, strTipo, strNumDex, strNivel, strPuntosA, strPuntosD, strPuntosV, strLegend;
			
			strNick = textNick.getText();
			strNom = textNom.getText();
			strTipo = textTipo.getText();
			strNumDex = textNumDex.getText();
			numDex = Integer.parseInt(strNumDex);
			strNivel = textNivel.getText();
			nivel = Integer.parseInt(strNivel);
			strPuntosA = textPuntosA.getText();
			puntosA = Integer.parseInt(strPuntosA);
			strPuntosD = textPuntosD.getText();
			puntosD = Integer.parseInt(strPuntosD);
			strPuntosV = textPuntosV.getText();
			puntosV = Integer.parseInt(strPuntosV);
			strLegend = textLegend.getText();
			legend = Boolean.parseBoolean(strLegend);
			
			entrenador1.nuevoPokemon(strNick, strNom, strTipo, numDex, puntosA, puntosD, puntosV, nivel, legend);

		}
	}
	
	private class EscuchadorElimina implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String strPos;
			int pos;
			
			strPos = textPosElimina.getText();
			pos = Integer.parseInt(strPos);
			
			entrenador1.liberaPokemon(pos);
		}
	}
	
	private class EscuchadorToString implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			
			textToString.setText(entrenador1.toString());
			
		}
	}
	
	private class EscuchadorMasFuerte implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			
			textMasFuerte.setText(entrenador1.cualEsMasFuerte().toString());
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorEntrenador controlador = new ControladorEntrenador("Pokémon");
		
		controlador.leeArchivo();

	}

}
