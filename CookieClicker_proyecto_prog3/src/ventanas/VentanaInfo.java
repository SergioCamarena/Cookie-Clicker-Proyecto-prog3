package ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class VentanaInfo {
	private JScrollPane spTexto;
	private JTextArea informacion;
	private static JFrame ventanaI;

	public VentanaInfo() {
		ventanaI = new JFrame();
		ventanaI.setBounds(0, 0, 600, 400);
		ventanaI.setLayout(new BorderLayout());
		
		//Panel norte
		JPanel norte =  new JPanel();
		JLabel titulo = new JLabel("INFORMACION");
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		
		
		ventanaI.add(norte, BorderLayout.NORTH);

		
		//Panel centro
		JPanel centro = new JPanel();
		informacion = new JTextArea();
		centro.add(informacion);
		spTexto = new JScrollPane(informacion);
		ventanaI.add(centro, BorderLayout.CENTER);
		ventanaI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//DA ERROR EN EL VOID PERO NO ENTIENDO EL PORQUE PERO EL CODIGO DEBE SER ASI
		
//		private void cargaInformacion() {
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
		ventanaI.getContentPane().add(panel,BorderLayout.EAST);	
//		//Se llama a la ventana de cookie
		cookie.addActionListener(new ActionListener() {
		
		@Override
			public void actionPerformed(ActionEvent e) {
				//new VentanaCookie(); //Esto no hay que hacer porque se crea otra nueva entonces vuelve todo a empezar otra vez
				ventanaI.dispose();
//				
			}
		});
		ventanaI.setVisible(true);
	}

	public static void main(String[] args) {
		//ventanaI.cargaInformacion();
		new VentanaInfo();

	}

}
