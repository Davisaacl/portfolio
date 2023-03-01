import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* David López	cu: 173993
 * 11/05/2018
 * Controlador
 */
public class ControladorConvertidor extends VistaConvertidor {
	
	public ControladorConvertidor(String titulo){
		super(titulo);
		
		textMillas.addActionListener(new EscuchadorMillas());
		textKm.addActionListener(new EscuchadorKm());
	}
	
	private class EscuchadorMillas implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String millasStr, kmsStr;
			double numMillas, numKm;
			final double FACTOR_CONV=1.6;
			
			millasStr = textMillas.getText();
			numMillas = Double.parseDouble(millasStr);
			numKm = numMillas*FACTOR_CONV;
			kmsStr = "" + numKm;
			textKm.setText(kmsStr);
			
		}
	}
	
	private class EscuchadorKm implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String millasStr, kmsStr;
			double numMillas, numKm;
			final double FACTOR_CONV=1.6;
			
			kmsStr = textKm.getText();
			numKm = Double.parseDouble(kmsStr);
			numMillas = numKm/FACTOR_CONV;
			millasStr = "" + numMillas;
			textMillas.setText(millasStr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorConvertidor yo = new ControladorConvertidor("El bueno");
		
		
	}
}
