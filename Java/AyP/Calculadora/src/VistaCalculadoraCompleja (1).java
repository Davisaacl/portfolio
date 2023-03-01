import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/* David López	cu: 173993
 * 11/05/2018
 * Vista Calculadora Compleja
 */
public class VistaCalculadoraCompleja extends JFrame{
	private JLabel labelParteReal;
	private JLabel labelParteImaginaria;
	private JLabel labelParteReal2;
	private JLabel labelParteImaginaria2;
	private JLabel labelOperacion;
	private JLabel labelRespuesta;
	private JTextField textReal;
	private JTextField textImaginaria;
	private JTextField textReal2;
	private JTextField textImaginaria2;
	private JTextField textOperacion;
	private JTextField textRespuesta;
	
	public VistaCalculadoraCompleja (String tituo){
		super();
		JPanel p = new JPanel();
		Border gap = BorderFactory.createEmptyBorder(10,10,10,10);
		
		labelParteReal = new JLabel("Parte Real");
		labelParteReal2 = new JLabel("Parte Real 2");
		labelParteImaginaria = new JLabel("Parte Imaginaria");
		labelParteImaginaria2 = new JLabel("Parte Imaginaria 2");
		labelOperacion = new JLabel ("Operación");
		labelRespuesta = new JLabel ("Respuesta");
		textReal = new JTextField (1000);
		textImaginaria = new JTextField (1000);
		textReal2 = new JTextField (1000);
		textImaginaria2 = new JTextField (1000);
		textOperacion = new JTextField (1000);
		textRespuesta = new JTextField (1000);
		
		p.setBorder(gap);
		p.setLayout(new GridLayout(6,2));
		p.add(labelParteReal);
		p.add(textReal);
		p.add(labelParteImaginaria);
		p.add(textImaginaria);
		p.add(labelParteReal2);
		p.add(textReal2);
		p.add(labelParteImaginaria2);
		p.add(textImaginaria2);
		p.add(labelOperacion);
		p.add(textOperacion);
		p.add(labelRespuesta);
		p.add(textRespuesta);
		this.add(p);
		
		this.setBounds(200, 200, 300, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaCalculadoraCompleja yo = new VistaCalculadoraCompleja("PRUEBA VISTA CONVERSIÓN");
		
	}

}
