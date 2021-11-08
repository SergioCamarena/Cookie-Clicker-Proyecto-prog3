package Code;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaUsuario {

	public VentanaUsuario() {
		JFrame ventanaU = new JFrame("USUARIO & CONTRASE�A");
		JLabel usuario = new JLabel("Introduce usuario: ");
		JTextField a�adusuario = new JTextField();
		a�adusuario.setEditable(true);
		a�adusuario.setBounds(0,0, 600, 200);
		JLabel contrase�a = new JLabel("Introduce contrase�a: ");
		JPasswordField a�adcontra = new JPasswordField();
		
		a�adcontra.setEditable(true);
		a�adcontra.setBounds(0, 0, 600, 200);
		JButton entrar = new JButton("Sign in");
		
		
		
		ventanaU.setBounds(0, 0, 1400, 800);
		
		JPanel center = new JPanel();
		JLabel icono = new JLabel(new ImageIcon("src/Code/cookieewe.jpg"));
		icono.setSize(20, 20);
		center.add(icono);
		JPanel south = new JPanel();
		south.setLayout(new GridLayout(3,1));
		south.add(usuario);
		south.add(a�adusuario);
		JLabel etiquetaU = new JLabel();
		south.add(etiquetaU);
		south.add(contrase�a);
		south.add(a�adcontra);
		JLabel etiquetaC = new JLabel();
		south.add(etiquetaC);
		south.add(entrar);
		
		
		
		
		
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Login correcto.\n �Bienvenido al juego!");
				//Si usuario y contrase�a no est�n en la base de datos preguntar si quiere hacer una nueva partida sino textfielf y passwordfield a null.
				new VentanaCookie();
				ventanaU.dispose();
				
			}

			
			
		});
		
		ventanaU.setLayout(new BorderLayout());
		ventanaU.add(center, BorderLayout.CENTER);
		ventanaU.add(south, BorderLayout.SOUTH);
		
		ventanaU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaU.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaUsuario();
	}
}
