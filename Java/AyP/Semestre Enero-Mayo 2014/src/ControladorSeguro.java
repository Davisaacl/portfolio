import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* David López	CU:173993
 * Examen final Enero-Mayo 2014
 */
public class ControladorSeguro extends VistaSeguro{
	
	public ControladorSeguro (String titulo){
		super(titulo);
		this.botonCalcula.addActionListener(new EscuchadorCalcula());
	}
	
	public class EscuchadorCalcula implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			String tipo, strEdad, strAnio, strSueldo;
			int edad, anio;
			double sueldo, nuevoSueldo;
			
			tipo = textTipo.getText();
			strEdad = textEdad.getText();
			edad = Integer.parseInt(strEdad);
			strAnio = textAnio.getText();
			anio = Integer.parseInt(strAnio);
			strSueldo = textSueldo.getText();
			sueldo = Double.parseDouble(strSueldo);
			
			if (tipo.equals("FU")){
				if (edad<60){
					nuevoSueldo = sueldo*8;
					nuevoSueldo +=((sueldo*(1/24)));
				}
				else{
					
					nuevoSueldo =sueldo*6;
					nuevoSueldo +=((sueldo*(1/24)));
				}
			}
			else{
				if (edad<65){
					nuevoSueldo = sueldo*7;
					nuevoSueldo+=((sueldo*(1/36)));
				}
				else{
					nuevoSueldo = sueldo*5;
					nuevoSueldo+=((sueldo*(1/36)));
				}
			}
			textResp.setText("Sueldo total: " + nuevoSueldo);	
					
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControladorSeguro yo = new ControladorSeguro ("Prueba");
		
	}

}
