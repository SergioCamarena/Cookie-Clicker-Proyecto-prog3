package Code;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
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
		JTextField anyadusuario = new JTextField();
		anyadusuario.setEditable(true);
		anyadusuario.setBounds(0,0, 300, 50);
		JLabel contrasenya = new JLabel("Introduce contraseña: ");
		JPasswordField anyadcontra = new JPasswordField();
		
		anyadcontra.setEditable(true);
		anyadcontra.setBounds(0, 0, 300, 50);
		JButton entrar = new JButton("Sign in");
		
		
		
		ventanaU.setBounds(0, 0, 1400, 800);
		
		ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
		Image imgCookie = imgIcon.getImage();
		Image imq = imgCookie.getScaledInstance(200, 200 ,Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(imq);
		
		JPanel center = new JPanel();
		JLabel icono = new JLabel(imgIcon);
		JLabel icono = new JLabel(new ImageIcon("src/Code/cookuie.png"));
		center.add(icono);
		JPanel east = new JPanel();
		east.setLayout(new GridLayout(3,1));
		east.add(usuario);
		east.add(anyadusuario);
		JLabel etiquetaU = new JLabel();
		east.add(etiquetaU);
		east.add(contrasenya);
		east.add(anyadcontra);
		JLabel etiquetaC = new JLabel();
		east.add(etiquetaC);
		east.add(entrar);
		
		
		
		
		
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Login correcto.\datosn �Bienvenido al juego!");
				//Si usuario y contrase�a no est�n en la base de  preguntar si quiere hacer una nueva partida sino textfielf y passwordfield a null.
				new VentanaCookie();
				ventanaU.dispose();
				
			}

			
			
		});
		
		ventanaU.setLayout(new BorderLayout());
		ventanaU.add(center, BorderLayout.NORTH);
		ventanaU.add(east, BorderLayout.CENTER);
		
		ventanaU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaU.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaUsuario();
	}
}
