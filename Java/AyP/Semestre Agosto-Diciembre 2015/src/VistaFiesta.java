import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/* David López	CU:173993
 * Examen final Agosto-Diciembre 2015
 */
public class VistaFiesta extends JFrame{
	private JLabel labelEdad, labelSexo, labelInvitacion, labelResp,labelNada;
	protected JTextField textEdad, textSexo, textInvitacion, textResp;
	protected JButton buttonResp;
	
	public VistaFiesta(String titulo){
		super (titulo);
		JPanel p = new JPanel();
		Border borde = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		labelEdad = new JLabel("Edad:");
		labelSexo = new JLabel("Sexo:");
		labelInvitacion = new JLabel("Invitación:");
		labelResp = new JLabel("Respuesta:");
		labelNada = new JLabel("");
		
		textEdad = new JTextField("");
		textSexo = new JTextField("");
		textInvitacion = new JTextField("");
		
		buttonResp = new JButton("¿Pasa?");
		
		textResp = new JTextField("");
		
		p.setBorder(borde);
		p.setLayout(new GridLayout(5,2));
		p.add(labelEdad);
		p.add(textEdad);
		p.add(labelSexo);
		p.add(textSexo);
		p.add(labelInvitacion);
		p.add(textInvitacion);
		p.add(buttonResp);
		p.add(labelNada);
		p.add(labelResp);
		p.add(textResp);
		this.add(p);
		
		this.setBounds(200, 200, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaFiesta yo = new VistaFiesta("PRUEBA VISTA FIESTA");

	}

}