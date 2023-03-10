import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Igraf {

	private JFrame frame;
	private JTextField resultado;
	private JTextField operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Igraf window = new Igraf();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Igraf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 384, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"7");
			}
		});
		btn7.setBounds(23, 98, 52, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"8");
			}
		});
		btn8.setBounds(85, 98, 52, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"9");
			}
		});
		btn9.setBounds(153, 98, 52, 23);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacion.setText(operacion.getText()+"4");
			}
		});
		btn4.setBounds(23, 132, 52, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"5");
			}
		});
		btn5.setBounds(85, 132, 52, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"6");
			}
		});
		btn6.setBounds(153, 132, 52, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"1");
			}
		});
		btn1.setBounds(23, 166, 52, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"2");
			}
		});
		btn2.setBounds(85, 166, 52, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"3");
			}
		});
		btn3.setBounds(153, 166, 52, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"0");
			}
		});
		btn0.setBounds(23, 200, 52, 23);
		frame.getContentPane().add(btn0);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+".");
			}
		});
		btnPunto.setBounds(85, 200, 52, 23);
		frame.getContentPane().add(btnPunto);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"/");
			}
		});
		btnDiv.setBounds(290, 166, 45, 23);
		frame.getContentPane().add(btnDiv);
		
		JButton btnRetro = new JButton("C");
		btnRetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena;
		        cadena=operacion.getText();
		        
		        if (cadena.length()>0) {
		            cadena=cadena.substring(0, cadena.length()-1);
		            operacion.setText(cadena);
		        }
			}
		});
		btnRetro.setBounds(290, 98, 45, 23);
		frame.getContentPane().add(btnRetro);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"*");
			}
		});
		btnMult.setBounds(290, 132, 45, 23);
		frame.getContentPane().add(btnMult);
		
		JButton btnReset = new JButton("CE");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText("");
				resultado.setText("");
			}
		});
		btnReset.setBounds(153, 200, 55, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"-");
			}
		});
		btnResta.setBounds(215, 166, 65, 23);
		frame.getContentPane().add(btnResta);
		
		JButton btnResul = new JButton("=");
		btnResul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ope = operacion.getText();
				listaSimNor exArit=new listaSimNor();
				String preparado=exArit.preparaCadena(ope);
				exArit.llenaLista(preparado);
				boolean a=exArit.valida();
				
				
				if (a==true){
					exArit.resolver(a);
					String resu=exArit.resolver(a);
					resultado.setText(resultado.getText()+resu);
				}
				else{
					resultado.setText(resultado.getText()+"operacion no valida");
				}
					
			}
		});
		btnResul.setBounds(290, 200, 45, 23);
		frame.getContentPane().add(btnResul);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"+");
			}
		});
		btnSuma.setBounds(215, 200, 65, 23);
		frame.getContentPane().add(btnSuma);
		
		resultado = new JTextField();
		resultado.setBounds(23, 41, 312, 30);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		operacion = new JTextField();
		operacion.setHorizontalAlignment(SwingConstants.RIGHT);
		operacion.setBounds(23, 10, 312, 30);
		frame.getContentPane().add(operacion);
		operacion.setColumns(10);
		
		JButton btnPIzq = new JButton("(");
		btnPIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+"(");
			}
		});
		btnPIzq.setBounds(215, 98, 67, 23);
		frame.getContentPane().add(btnPIzq);
		
		JButton btnPDer = new JButton(")");
		btnPDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion.setText(operacion.getText()+")");
			}
		});
		btnPDer.setBounds(215, 132, 65, 23);
		frame.getContentPane().add(btnPDer);
		
		JButton btnsebas = new JButton("Sebas");
		btnsebas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacion.setText(operacion.getText()+"10");
			}
		});
		btnsebas.setBounds(144, 234, 89, 23);
		frame.getContentPane().add(btnsebas);
	}
}
