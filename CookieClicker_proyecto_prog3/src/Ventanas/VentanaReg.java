package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class VentanaReg {

	public VentanaReg() {
		
		//Porque no me coge el tamaño que quiero??
		
		JFrame ventanaR = new JFrame("LOG IN");
		ventanaR.setLayout(new BorderLayout());
		
		//_____________________________PANEL NORTE
			JPanel panelnorte = new JPanel();
			panelnorte.setLayout(new GridLayout(1,2));
			panelnorte.setBorder(new BevelBorder(BevelBorder.RAISED));
			
			JLabel titulo = new JLabel("LOG IN : _________________");
			titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
			panelnorte.add(titulo);
				
			//Imagen panel norte
			ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
			Image imgCookie = imgIcon.getImage();
			Image imq = imgCookie.getScaledInstance(120, 120 ,Image.SCALE_SMOOTH);
			imgIcon = new ImageIcon(imq);
			JLabel cookie = new JLabel(imgIcon);
				
			panelnorte.add(cookie);
		
			
		//Panel Oeste
		JPanel paneloeste = new JPanel();
		paneloeste.setLayout(new GridLayout(9,2));
		
		JLabel usuario = new JLabel("Introduce usuario: ");
		JTextField textusuario = new JTextField();
		textusuario.setSize(20,20);
		
		JLabel contrasena = new JLabel("Introduce contraseña: ");
		JPasswordField textcontrasena = new JPasswordField("");
		textcontrasena.setSize(20,20);
		
		JLabel otravez = new JLabel("Introduce otra vez la contraseña: ");
		JPasswordField textcontra = new JPasswordField("");
		textcontra.setSize(20,20);
		
		JLabel coluor = new JLabel();	//Se pone en Verde si las contraseñas son iguales sino en Rojo
		coluor.setBorder(new LineBorder(Color.black));
		coluor.setOpaque(true);
		JButton comprov = new JButton("Pulsa para combrobar");
		
		JLabel email = new JLabel("Introduce e-mail");
		JTextField textemail = new JTextField();
		textemail.setSize(20,20);
		
		JButton generator = new JButton("Generador de contraseña aleatoria");
		JLabel show = new JLabel();
		show.setOpaque(true);
		show.setBackground(Color.red);
		
		
		
		paneloeste.add(new JLabel());
		paneloeste.add(new JLabel());
		paneloeste.add(usuario);
		paneloeste.add(textusuario);
		paneloeste.add(contrasena);
		paneloeste.add(textcontrasena);
		paneloeste.add(otravez);
		paneloeste.add(textcontra);
		paneloeste.add(coluor);
		paneloeste.add(comprov);
		paneloeste.add(email);
		paneloeste.add(textemail);
		paneloeste.add(new JLabel());
		paneloeste.add(new JLabel());
		paneloeste.add(generator);
		paneloeste.add(show);
	
//________________________________________EAST
		
		JPanel east = new JPanel();
		east.setLayout(new BorderLayout());
		//______________________________PAUTAS
		JPanel pautas = new JPanel();
		JLabel consid = new JLabel("<html>Aquí hay unas pautas que te dejamos los administradores para que hagas el Registro <b>correctamente:</b><br>"
				+ "1) <b>Nick Name --> </b> Introduce un nick que sea facil de recordar para ti.<br>"
				+ "2) <b>Contraseña --> </b> Introduce una contraseña que sea facil de recordad pero con una complejidad.<br>"
				+ "____2.1) La contraseña debe tener:<br>"
				+ "_____________- Al menos 1 Mayuscula. <br>"
				+ "_____________- Al menos 1 dígito. <br>"
				+ "_____________- Al menos 1 caracter especial. <br>"
				+ "_____________- Al menos una lonitud de 6. <br>"
				+ "3)<b> Email --> </b> Introduce tu dirección de email. No se enviará propaganda.<br> "
				+ "4)<b> El usuario es autogenerado, pero no importa, solo es útil para los administradores.<br>"
				+ "5)<b> NO INTENTES HACER SQL INYECTION</b>, no va a funcionar.<br>"
				+ "6)<b>Apunta bien </b> la contraseña porque sino tendrás que <b>volver a empezar</b> el juego.  </html>");
		consid.setFont(new Font("Serief",Font.ITALIC,12));
		consid.setBorder(new TitledBorder("Cosas a tener en cuenta:"));
		consid.setBorder(new TitledBorder("TENER EN CUENTA"));
		
		pautas.add(new JLabel());
		pautas.add(consid);
		east.add(pautas, BorderLayout.NORTH);
		
		
		//Panel Sur
		JPanel sur = new JPanel();
		JButton registro = new JButton("Registrate");
		
		registro.addActionListener(new ActionListener() {
			
			public  void actionPerformed(ActionEvent e) {
				int mensaje =JOptionPane.showConfirmDialog(null,"Desea hacer algún cambio más","¡ADELANTE!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(mensaje == JOptionPane.YES_OPTION) {
					//Que siga cambiando cosas no nos interesa hacer nada aquí.
				}else if(mensaje == JOptionPane.NO_OPTION) {
					//Borrar todo lo que haya en las textfields
					//Antes de borrar nada hay que meterlo en la base de datos!!!!
				/*	
					textusuario =  JTextField();
					textcontrasena = JPasswordField("");
					textcontra = JPasswordField("");
					textemail =  JTextField();
					*/
					//
					new VentanaCookie();
					ventanaR.dispose();
				}
			}
		});
		
		sur.setLayout(new GridLayout(2,1));
		sur.add(registro);
		JLabel vac = new JLabel("Deberias leer la letra pequeña antes de registrarte :)");
		vac.setFont(new Font("Serief",Font.ITALIC,6));
		sur.add(vac);
		
		ventanaR.add(sur, BorderLayout.SOUTH);
		ventanaR.add(east, BorderLayout.CENTER);
		ventanaR.add(paneloeste, BorderLayout.WEST);
		ventanaR.add(panelnorte, BorderLayout.NORTH);
		
		ventanaR.setBounds(0, 0, 1400, 800);
		ventanaR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaR.setResizable(false);
		ventanaR.setVisible(true);
	//________________________________________________________________________________________________________________________________________
	//Mirar si las contraseñas son iguales, y cambiar el label depende de eso.			¡¡MIRAR PORQUE NO CHUTA!!
	
	
	}

	public static void main(String[] args) {
		
		new VentanaReg();
	}

}
