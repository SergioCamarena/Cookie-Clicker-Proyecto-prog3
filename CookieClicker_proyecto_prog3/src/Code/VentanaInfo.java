package Code;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class VentanaInfo {
	
	public VentanaInfo() {
		JFrame ventanaI = new JFrame();
		JTextArea txArea1 = new JTextArea();
		JLabel texto = new JLabel();
		ventanaI.setBounds(0, 0, 600, 400);
		ventanaI.setLayout(new BorderLayout());
		
		//Scroll
		JScrollPane scrollBar = new JScrollPane(txArea1);
		scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		texto.add(scrollBar, BorderLayout.SOUTH);
		
		//Panel norte
		JPanel norte =  new JPanel();
		JLabel titulo = new JLabel("INFORMACION");
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		
		
		ventanaI.add(norte, BorderLayout.NORTH);

		
		//Panel centro
		JPanel centro = new JPanel();
		JLabel versiones = new JLabel("<html>Hola compañeros</html>");
		centro.add(versiones);
//		ventanaI.add(centro, BorderLayout.CENTER);
		ventanaI.setVisible(true);
		ventanaI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaI.add(new JScrollPane(centro), BorderLayout.CENTER);
		
		//Boton para volver a la ventana cookie
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		JButton cookie =  new JButton("Cookie Clicker");
		panel.add(cookie);
		ventanaI.getContentPane().add(panel,BorderLayout.EAST);	
//		//Se llama a la ventana de cookie
		cookie.addActionListener(new ActionListener() {
		
		@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaCookie();
				ventanaI.dispose();
//				
			}
		});
	}
	public static void main(String[] args) {
		new VentanaInfo();
		
	}

}
