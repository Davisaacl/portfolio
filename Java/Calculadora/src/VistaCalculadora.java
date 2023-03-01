import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/* David López	cu: 173993
 * 11/05/2018
 * Vista Calculadora
 */
public class VistaCalculadora extends JFrame{
	protected JButton button1;
	protected JButton button2;
	protected JButton button3;
	protected JButton button4;
	protected JButton button5;
	protected JButton button6;
	protected JButton button7;
	protected JButton button8;
	protected JButton button9;
	protected JButton button0;
	protected JButton buttonSuma;
	protected JButton buttonResta;
	protected JButton buttonMultiplicacion;
	protected JButton buttonDivision;
	protected JButton buttonPunto;
	protected JButton buttonIgual;
	protected JTextField textRespuesta;
	
	public VistaCalculadora(String titulo){
		super(titulo);
		JPanel p = new JPanel();
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonSuma = new JButton("+");
		buttonResta = new JButton("-");
		buttonMultiplicacion = new JButton("*");
		buttonDivision = new JButton("/");
		buttonPunto = new JButton(".");
		buttonIgual = new JButton("=");
		textRespuesta = new JTextField (100000);
		
		p.setBorder(gap);
		p.setLayout(new GridLayout(5,4));
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(buttonSuma);
		p.add(button4);
		p.add(button5);
		p.add(button6);
		p.add(buttonResta);
		p.add(button7);
		p.add(button8);
		p.add(button9);
		p.add(buttonMultiplicacion);
		p.add(buttonPunto);
		p.add(button0);
		p.add(buttonIgual);
		p.add(buttonDivision);
		p.add(textRespuesta);
		this.add(p);
		
		this.setBounds(200, 200, 300, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaCalculadora yo = new VistaCalculadora("PRUEBA VISTA CONVERSIÓN");
		
	}

}

