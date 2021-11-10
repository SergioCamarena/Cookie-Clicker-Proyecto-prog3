package Code;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaInfo {
	
	public VentanaInfo() {
		JFrame ventanaI = new JFrame();
		ventanaI.setBounds(0, 0, 600, 400);
		ventanaI.setLayout(new BorderLayout());
		
		//Panel norte
		JPanel norte =  new JPanel();
		JTextField info = new JTextField("Aqui va la informacion");
		JLabel titulo = new JLabel("INFORMACION");
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		norte.add(info);
		
		ventanaI.add(norte, BorderLayout.NORTH);

		

		
		
		ventanaI.setVisible(true);
		ventanaI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new VentanaInfo();
		
	}

}
