import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* David López	cu: 173993
 * 11/05/2018
 * Controlador Calculadora Compleja
 */
public class ControladorComplejo extends VistaCalculadoraCompleja{
	Complejo c1, c2;
	char operador;
	String resp;
	
	public ControladorComplejo (String titulo){
		super(titulo);
		
		textReal.addActionListener(new EscuchadorR());
		textImaginaria.addActionListener(new EscuchadorI());
		textReal2.addActionListener(new EscuchadorR2());
		textImaginaria2.addActionListener(new EscuchadorI2());
		textOperacion.addActionListener(new EscuchadorO());
	//	textRespuesta.addActionListener(new EscuchadorRespuesta());
	}
	
	private class EscuchadorR implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String realStr;
			double real;
			
			realStr = textReal.getText();
			real = Double.parseDouble(realStr);
			c1.setParteReal(real);
		}
	}
	
	private class EscuchadorI implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String imaginarioStr;
			double imaginario;
			
			imaginarioStr = textReal.getText();
			imaginario = Double.parseDouble(imaginarioStr);
			c1.setParteImaginaria(imaginario);
		}
	}
	
	private class EscuchadorR2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String realStr2;
			double real2;
			
			realStr2 = textReal.getText();
			real2 = Double.parseDouble(realStr2);
			c2.setParteReal(real2);
		}
	}
	
	private class EscuchadorI2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String imaginarioStr2;
			double imaginario2;
			
			imaginarioStr2 = textReal.getText();
			imaginario2 = Double.parseDouble(imaginarioStr2);
			c2.setParteImaginaria(imaginario2);
		}
	}
	
	private class EscuchadorO implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			String operadorStr;
			
			operadorStr = textOperacion.getText();
			operador = operadorStr.charAt(0);
			switch (operador){
			case '+':
				resp = CalculadoraCompleja.suma(c1, c2).toString();
			break;
			case '-':
				resp = CalculadoraCompleja.resta(c1, c2).toString();
			break;
			case '*':
				resp = CalculadoraCompleja.multiplica(c1, c2).toString();
			break;
			case '/':
				resp = CalculadoraCompleja.divide(c1, c2).toString();
			break;
			}
			textRespuesta.setText(resp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorComplejo yo = new ControladorComplejo("Prueba");

	}

}
