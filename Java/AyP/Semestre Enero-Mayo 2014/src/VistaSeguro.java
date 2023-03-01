import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
/* David López	CU:173993
 * Examen final Enero-Mayo 2014
 */
public class VistaSeguro extends JFrame {
	private JLabel labelEdad, labelTipo, labelAnio, labelSueldo;
	protected JTextField textEdad, textTipo, textAnio, textSueldo, textResp;
	protected JButton botonCalcula;
	
	public VistaSeguro (String tiutlo){
		super (tiutlo);
		JPanel p = new JPanel();
		Border borde = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		labelEdad = new JLabel ("Edad");
		labelTipo = new JLabel ("Tipo");
		labelAnio = new JLabel ("Años");
		labelSueldo = new JLabel ("Sueldo");
		
		textEdad = new JTextField ("");
		textTipo = new JTextField ("");
		textAnio = new JTextField ("");
		textSueldo = new JTextField ("");
		textResp = new JTextField ("");
		
		botonCalcula = new JButton ("Calcula");
		
		p.setBorder(borde);
		p.setLayout(new GridLayout(5,2));
		p.add(labelEdad);
		p.add(textEdad);
		p.add(labelTipo);
		p.add(textTipo);
		p.add(labelAnio);
		p.add(textAnio);
		p.add(labelSueldo);
		p.add(textSueldo);
		p.add(botonCalcula);
		p.add(textResp);
		this.add(p);
		
		this.setBounds(200, 200, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaSeguro yo = new VistaSeguro ("Prueba");
	}

}
