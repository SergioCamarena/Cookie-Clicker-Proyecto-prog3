package Code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class VentanaReg {

	public VentanaReg() {
		JFrame ventanaR = new JFrame("LOG IN");
		JLabel usuario = new JLabel("Introduce usuario: ");
		JTextField textusuario = new JTextField();
		JLabel contrasena = new JLabel("Introduce contraseña: ");
		JPasswordField textcontrasena = new JPasswordField("L");
		JLabel otravez = new JLabel("Introduce otra vez la contraseña: ");
		JPasswordField textcontra = new JPasswordField("L");
		JLabel coluor = new JLabel();	//Se pone en Verde si las contraseñas son iguales sino en Rojo
		JLabel vacio = new JLabel();
		JLabel email = new JLabel("Introduce e-mail");
		JTextField textemail = new JTextField();
		
		
		
		
		ventanaR.setLayout(new BorderLayout());
		JPanel panelnorte = new JPanel();
		panelnorte.setLayout(new GridLayout(1,2));
		
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
		
		JPanel paneloeste = new JPanel();
		paneloeste.setLayout(new GridLayout(6,2));
		
		paneloeste.add(usuario);
		paneloeste.add(textusuario);
		paneloeste.add(contrasena);
		paneloeste.add(textcontrasena);
		paneloeste.add(otravez);
		paneloeste.add(textcontra);
		paneloeste.add(coluor);
		paneloeste.add(vacio);
		paneloeste.add(email);
		paneloeste.add(textemail);
		
		JPanel east = new JPanel();
		
		JLabel consid = new JLabel("<html>Aquí hay unas pautas que te dejamos los administradores para que hagas el Registro <b>correctamente:</b><br>"
				+ "1) <b>Usuario --> </b> Introduce un usuario que sea facil de recordar para ti.<br>"
				+ "2) <b>Contraseña --> </b> Introduce una contraseña que sea facil de recordad pero con una complejidad.<br>"
				+ "____2.1) La contraseña debe tener:<br>"
				+ "_____________- Almenos 1 Mayuscula. <br>"
				+ "_____________- Almenos 1 número. <br>"
				+ "_____________- Almenos 1 caracter especial. <br>"
				+ "3)<b> Email --> </b> Introduce tu dirección de email. No se enviará propaganda.<br> "
				+ "4)<b> NO INTENTES HACER SQL INYECTION</b>, no va a funcionar.</html>");
		consid.setFont(new Font("Serief",Font.ITALIC,12));
		consid.setBorder(new TitledBorder("Cosas a tener en cuenta:"));
		consid.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		east.add(consid);
		
		ventanaR.add(east, BorderLayout.CENTER);
		ventanaR.add(paneloeste, BorderLayout.WEST);
		ventanaR.add(panelnorte, BorderLayout.NORTH);
		
		ventanaR.setBounds(0, 0, 1400, 800);
		ventanaR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaR.setVisible(true);
	//________________________________________________________________________________________________________________________________________
	//Mirar si las contraseñas son iguales, y cambiar el label depende de eso.			¡¡MIRAR PORQUE NO CHUTA!!
		
		int n = 0;
		while(n!=0) {
			if(textcontrasena == textcontra) {
				coluor.setBackground(Color.GREEN);
			}
				
			else {
				if(textcontrasena == JPasswordField("L") & textcontra == JPasswordField("L" ) ){
					coluor.setBackground(Color.MAGENTA);
				}
				else {
				coluor.setBackground(Color.red);
					 }
				}
			}
	}

	private JPasswordField JPasswordField(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public static void main(String[] args) {
		
		new VentanaReg();
	}
}
