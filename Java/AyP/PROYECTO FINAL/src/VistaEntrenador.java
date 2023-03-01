import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/* David López	CU:173993
 * 15/05/2018
 * POKÉMON VISTA ENTRENADOR
 */
public class VistaEntrenador extends JFrame{
	private JLabel labelNick, labelNom, labelTipo, labelNumDex, labelNivel, labelPuntosA, labelPuntosD, labelPuntosV, labelLegend, labelCu;
	protected JTextField textNick, textNom, textTipo, textNumDex, textNivel, textPuntosA, textPuntosD, textPuntosV, textLegend, textCu;
	protected JTextField textAgrego, textPosElimina;
	protected JButton botonAgrega, botonElimina, botonToString, botonMasFuerte;
	protected JTextArea textToString, textMasFuerte;
	
	public VistaEntrenador(String titulo){
		super(titulo);
		JPanel p = new JPanel();
		JScrollPane scrollPane;
		Border borde = BorderFactory.createEmptyBorder(8, 8, 8, 8);
		
		labelNick = new JLabel ("Nickname");
		labelNom = new JLabel ("Nombre");
		labelTipo = new JLabel ("Tipo");
		labelNumDex = new JLabel ("Número Pokédex");
		labelNivel = new JLabel ("Nivel");
		labelPuntosA = new JLabel ("Puntos de Ataque");
		labelPuntosD = new JLabel ("Puntos de Defensa");
		labelPuntosV = new JLabel ("Puntos de Vida");
		labelLegend = new JLabel ("Legendario");
		
		botonAgrega = new JButton ("Nuevo Pokémon");
		botonElimina = new JButton ("Libera Pokémon");
		botonToString = new JButton ("Información de los Pokémon");
		botonMasFuerte = new JButton ("El más fuerte");
		
		textNick = new JTextField("");
		textNom = new JTextField("");
		textTipo = new JTextField("");
		textNumDex = new JTextField("");
		textNivel = new JTextField("");
		textPuntosA = new JTextField("");
		textPuntosD = new JTextField("");
		textPuntosV = new JTextField("");
		textLegend = new JTextField("");
		textAgrego = new JTextField("");
		textPosElimina = new JTextField("");
		
		textToString = new JTextArea("");
		textMasFuerte = new JTextArea("");
		
		textToString.setBounds(5, 5, 100, 200);
		scrollPane = new JScrollPane(textToString);
		scrollPane.setBounds(3, 3, 400, 400);
		
		p.setBorder(borde);
		p.setLayout(new GridLayout (13,2));
		p.add(labelNick);
		p.add(textNick);
		p.add(labelNom);
		p.add(textNom);
		p.add(labelTipo);
		p.add(textTipo);
		p.add(labelNumDex);
		p.add(textNumDex);
		p.add(labelNivel);
		p.add(textNivel);
		p.add(labelPuntosA);
		p.add(textPuntosA);
		p.add(labelPuntosD);
		p.add(textPuntosD);
		p.add(labelPuntosV);
		p.add(textPuntosV);
		p.add(labelLegend);
		p.add(textLegend);
		p.add(botonAgrega);
		p.add(textAgrego);
		p.add(botonElimina);
		p.add(textPosElimina);
		p.add(botonToString);
		p.add(scrollPane);	//Aparecerá toda la información del entrenador y sus respectivos Pokémones
		p.add(botonMasFuerte);
		p.add(textMasFuerte);
		this.add(p);
		
		this.setBounds(200, 200, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	
		scrollPane.setBounds(10,60,780,500);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	
	}
}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VistaEntrenador yo = new VistaEntrenador("PRUEBA VISTA ENTRENADOR");

	}

}

 */
