import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/* David López	cu: 173993
 * 09/05/2018
 * Vista
 */
public class VistaConvertidor extends JFrame{
	private JLabel labelMillas, labelKm;
	protected JTextField textKm, textMillas;
	
	public VistaConvertidor(String titulo){
		super(titulo);	// invoca al constructor del padre, en este caso, a JFrame
		
		// instanciar componentes GUIs
		labelMillas = new JLabel("Millas: ");
		labelKm = new JLabel ("Kilómetros: ");
		textMillas = new JTextField(10);
		textKm = new JTextField(10);
		
		// declaración de JPanel e inserción de componenetes GUIs
		JPanel p = new JPanel();
		Border gap = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		p.setBorder(gap);
		p.setLayout(new GridLayout(2,2));
		p.add(labelKm);
		p.add(textKm);
		p.add(labelMillas);
		p.add(textMillas);
		this.add(p);
		
		// visualización
		this.setBounds(100, 100, 200, 120);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaConvertidor yo = new VistaConvertidor("PRUEBA VISTA CONVERSIÓN");
		
	}

}
