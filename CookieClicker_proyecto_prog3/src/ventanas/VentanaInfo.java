package ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class VentanaInfo extends JFrame{
	private JTextArea informacion;
	//private static JFrame ventanaI;
	JScrollPane spTexto;  // atributo de paquete para poder hacer test de JUnit
	
	public VentanaInfo() {
		//ventanaI = new JFrame();
		//ventanaI.setBounds(0, 0, 600, 400);
		//ventanaI.setLayout(new BorderLayout());
		setBounds(0,0,600,400);
		setLayout(new BorderLayout());
		
		//Panel norte
		JPanel norte =  new JPanel();
		JLabel titulo = new JLabel("INFORMACION");
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		
		add(norte, BorderLayout.NORTH);
		//ventanaI.add(norte, BorderLayout.NORTH);

		
		//Panel centro
		//JPanel centro = new JPanel();
		informacion = new JTextArea();
		//centro.add(informacion);
		spTexto = new JScrollPane(informacion);
		//ventanaI.add(informacion, BorderLayout.CENTER);
		//ventanaI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(informacion, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//DA ERROR EN EL VOID PERO NO ENTIENDO EL PORQUE PERO EL CODIGO DEBE SER ASI
		
//		protected void cargaInformacion() {
//			try {
//				Scanner scanner = new Scanner(VentanaInfo.class.getResourceAsStream("Informacion.txt"), "UTF-8");
//				while(scanner.hasNextLine()) {
//					String linea = scanner.nextLine();
//					informacion.append(linea + "\n");
//				}
//				scanner.close();
//			}catch (Exception e) {
//				JOptionPane.showInputDialog(this, "No se ha podido cargar el texto");
//			}
//		}

	
	//Boton para volver a la ventana cookie
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		JButton cookie =  new JButton("Cookie Clicker");
		panel.add(cookie);
		//ventanaI.getContentPane().add(panel,BorderLayout.EAST);
		getContentPane().add(panel, BorderLayout.EAST);
//		//Se llama a la ventana de cookie
		cookie.addActionListener(new ActionListener() {
		
		@Override
			public void actionPerformed(ActionEvent e) {
				//new VentanaCookie(); //Esto no hay que hacer porque se crea otra nueva entonces vuelve todo a empezar otra vez
				dispose();
			//ventanaI.dispose();
			

			}
		});
		//ventanaI.setVisible(true);
	}
	
	//HAY QUE VER PORQUE NO FUNCIONA
	protected void cargaInformacion() {
		try {
			Scanner scanner = new Scanner(VentanaInfo.class.getResourceAsStream("/CookieClicker_proyecto_prog3/src/Informacion.txt"), "UTF-8");
			while(scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				informacion.append(linea + "\n");
			}
			scanner.close();
		}catch (Exception e) {
			JOptionPane.showInputDialog(this, "No se ha podido cargar el texto");
			//e.printStackTrace();
		}

	}

	public static void main(String[] args){
		//ventanaI.cargaInformacion();
		VentanaInfo ventanaI = new VentanaInfo();
		//ventanaI.cargaInformacion();
		ventanaI.setVisible(true);
		ventanaI.cargaInformacion();
		//new VentanaInfo();
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaInfo window = new VentanaInfo();
//					//window.cargaInformacion();
//					window.ventanaI.setVisible(true);
//					window.cargaInformacion();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});


	}

}
