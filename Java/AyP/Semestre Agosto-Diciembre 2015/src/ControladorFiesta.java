import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* David López	CU:173993
 * Examen final Agosto-Diciembre 2015
 */
public class ControladorFiesta extends VistaFiesta{
	
	public ControladorFiesta (String titulo){
		super(titulo);
		this.buttonResp.addActionListener(new EscuchadorResp());
	}
	
	public class EscuchadorResp implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			int edad, precio;
			String sexo, invitacion;
			String strEdad, strResp = "No puedes entrar";
			
			strEdad = textEdad.getText();
			edad = Integer.parseInt(strEdad);
			sexo = textSexo.getText();
			invitacion = textInvitacion.getText();
			
			if (invitacion.equals("VIP"))
				strResp = "Entras gratis";
			else{
				if (invitacion.equals("Normal"))
					if (edad>18){
						if (sexo.equals("mujer"))
						precio = 100;
						else
							precio = 200;
						if (sexo.equals("hombre"))
							if (edad>25 && edad<35)
								precio*=1.1;
							else
								if (edad>35)
									precio*=1.2;
						strResp = "Puedes pasar si pagas: " + precio;
				}
			}
			textResp.setText(strResp);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorFiesta yo = new ControladorFiesta("Prueba");

	}

}
