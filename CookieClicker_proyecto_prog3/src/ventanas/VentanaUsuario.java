package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import datos.Usuario;

public class VentanaUsuario {
	Usuario u = new Usuario();
	

	public VentanaUsuario() {
		JFrame ventanaU = new JFrame("USUARIO & CONTRASENYA");
		JLabel nick = new JLabel("Introduce nick: ");
		JTextField anyadusuario = new JTextField();
		anyadusuario.setEditable(true);
		anyadusuario.setBounds(0,0, 300, 50);
		JLabel contrasenya = new JLabel("Introduce contrasena: ");
		JPasswordField anyadcontra = new JPasswordField();
		JCheckBox mostrar = new JCheckBox("Mostrar");
		anyadcontra.setEchoChar('*');
		mostrar.addActionListener(new ActionListener() {
			
			//Cuando pulses Mostrat te enseña la contraseña para que la puedas ver.
			 public void actionPerformed(java.awt.event.ActionEvent e) {    
			    if (mostrar.isSelected()) {
			      anyadcontra.setEchoChar((char) 0);
			    } else {
			    	anyadcontra.setEchoChar('*');
			    }
			  }
			});
		
		anyadcontra.setEditable(true);
		anyadcontra.setBounds(0, 0, 300, 50);
		JButton entrar = new JButton("Sign in");
		JButton regis = new JButton("Registrate");
		
		
		
		
		ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
		Image imgCookie = imgIcon.getImage();
		Image imq = imgCookie.getScaledInstance(200, 200 ,Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(imq);
		
		JPanel center = new JPanel();
		JLabel icono = new JLabel(imgIcon);
		
		center.add(icono);
		
		//Panel south
		JPanel south = new JPanel();
		south.setLayout(new GridLayout(3,1));
		south.add(nick);
		south.add(anyadusuario);
		JLabel etiquetaU = new JLabel();
		south.add(etiquetaU);
		south.add(contrasenya);
		south.add(anyadcontra);
		south.add(mostrar);
		//JLabel etiquetaC = new JLabel();
		//south.add(etiquetaC);
		south.add(entrar);
		JLabel etiquetaD = new JLabel("Entrar modo Guest");
		etiquetaD.setOpaque(true);
		etiquetaD.setBackground(Color.green);
		etiquetaD.setHorizontalAlignment(SwingConstants.CENTER);
		south.add(etiquetaD);
		south.add(regis);
		
		
		
		
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaCookie();
				ventanaU.dispose();
				
				
			}

			
			
		});
		//Si pulsas dentro del label y pulsas te lleva modo Guest
		etiquetaD.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int codigo = JOptionPane.showConfirmDialog(null, "<html>Al ser un guest <b>no</b> se guardará tu progreso<br> <b>¿Quieres seguir?</b></html>", "GUEST", JOptionPane.OK_CANCEL_OPTION);
				if(codigo==JOptionPane.OK_OPTION) {
					new VentanaCookie();
					ventanaU.dispose();
				}
				else if(codigo==JOptionPane.CANCEL_OPTION){
					//System.out.println("TO BIEN");
		        }
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				etiquetaD.setBackground(Color.green);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				etiquetaD.setBackground(Color.yellow);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new VentanaReg();
				ventanaU.dispose();
				
			}

			
			
		});
		
		
		ventanaU.setLayout(new BorderLayout());
		ventanaU.add(center, BorderLayout.CENTER);
		ventanaU.add(south, BorderLayout.SOUTH);
		
		ventanaU.setBounds(300, 0, 800, 400);
		ventanaU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaU.setResizable(false);
		ventanaU.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaUsuario();
	}

}
