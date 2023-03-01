import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* David López	cu: 173993
 * 11/05/2018
 * Controlador Calculadora
 */
public class ControladorCalculadora extends VistaCalculadora {
	private double aux;
	
	public ControladorCalculadora (String titulo){
		super(titulo);
		button1.addActionListener(new Escuchador1());
		button2.addActionListener(new Escuchador2());
		button3.addActionListener(new Escuchador3());
		button4.addActionListener(new Escuchador4());
		button5.addActionListener(new Escuchador5());
		button6.addActionListener(new Escuchador6());
		button7.addActionListener(new Escuchador7());
		button8.addActionListener(new Escuchador8());
		button9.addActionListener(new Escuchador9());
		button0.addActionListener(new Escuchador0());
		buttonSuma.addActionListener(new EscuchadorS());
		buttonResta.addActionListener(new EscuchadorR());
		buttonMultiplicacion.addActionListener(new EscuchadorM());
		buttonDivision.addActionListener(new EscuchadorD());
		buttonPunto.addActionListener(new EscuchadorP());
		buttonIgual.addActionListener(new EscuchadorI());
	}
	
	private class Escuchador1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "1";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "2";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "3";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "4";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "5";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "6";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "7";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "8";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador9 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "9";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class Escuchador0 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = "0";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class EscuchadorS implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			
			aux = Double.parseDouble(textRespuesta.getText());
			textRespuesta.setText("");
		}
	}
	
	private class EscuchadorR implements ActionListener{
		public void actionPerformed(ActionEvent ae){

			aux = Double.parseDouble(textRespuesta.getText());
			textRespuesta.setText("");
		}
	}
	
	private class EscuchadorD implements ActionListener{
		public void actionPerformed(ActionEvent ae){

			aux = Double.parseDouble(textRespuesta.getText());
			textRespuesta.setText("");
		}
	}
	
	private class EscuchadorM implements ActionListener{
		public void actionPerformed(ActionEvent ae){

			aux = Double.parseDouble(textRespuesta.getText());
			textRespuesta.setText("");
		}
	}
	
	private class EscuchadorP implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String numero;
			
			numero = ".";
			textRespuesta.setText(textRespuesta + numero);
		}
	}
	
	private class EscuchadorI implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			double resp;
			String strResp;
			
			resp = Double.parseDouble(textRespuesta.getText());
			resp+=aux;
			strResp = "" + resp;
			textRespuesta.setText(strResp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorCalculadora yo = new ControladorCalculadora("Prueba");

	}

}
