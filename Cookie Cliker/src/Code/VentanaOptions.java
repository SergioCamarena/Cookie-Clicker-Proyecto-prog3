package Code;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaOptions {
	
	public VentanaOptions(){
		JFrame ventanaO = new JFrame("OPTIONS");
		ventanaO.setBounds(900, 32, 600, 400);
		//ventanaO.setBackground(Color.magenta);
		
		//Panel Norte ----------------------TITULO
		JPanel norte =  new JPanel();
		norte.setLayout(new GridLayout(2,1));
		JLabel titulo = new JLabel("OPCIONES : _________________");
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		
		ventanaO.add(norte, BorderLayout.NORTH);
		
		
		JLabel usuario = new JLabel("<html>Esta ventana ha sido creada para que el usuario pueda elegir diferentes<br> tipos de configuraciones u opciones que"
				+ " el grupo de administradores ofrece.<br> Es <b>importante</b> tener en cuenta que los cambios realizados en esta ventana <b>puede</b> que cada vez que<br>"
				+ "se abra la app estén de manera <b>predeterminada</b>.<br> Si <b>hubiera tiempo</b> desde el equipo de administradores reforzariamos esta mala gestión.  </html>");
		usuario.setFont(new Font("Serief",Font.ITALIC,12));
		usuario.setBorder(new TitledBorder("Información"));
		norte.add(usuario);
		ventanaO.add(norte, BorderLayout.NORTH);
		
		//Panel Este
		JPanel east = new JPanel();
		east.setLayout(new GridLayout(4,1));
		JButton Cargarpartida = new JButton("¿Tienes ya una cuenta?");
		Cargarpartida.setBounds(0,0, 50, 50);
		
		JButton guardarpartida = new JButton("Guardar seguimiento ahora");
		guardarpartida.setBounds(0,0, 50, 50);
		
		JLabel espacio = new JLabel("________________________________________");
		JLabel espacioblanco = new JLabel("");
		
		east.add(Cargarpartida);
		east.add(espacio);
		east.add(guardarpartida);
		east.add(espacioblanco);
		ventanaO.add(east, BorderLayout.EAST);
		
//___________CARGAR DATOS --> ES QUE INTRODUZCA UN USUARIO
		Cargarpartida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaO.dispose();
				//Code.VentanaCookie.dispose();
				new VentanaUsuario();
				
			}
		});
//___________GUARDAR DATOS --> GUARDADO INSTANTANEO							FALTAN LOS FICHEROS
		
		guardarpartida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaO.dispose();
				JOptionPane.showMessageDialog(null, "¡Guardado realizado! \n Puede continuar jugando");
	
			}
			});
		
		//Panel Centro
		JPanel centro = new JPanel();
		centro.setLayout(new GridLayout(1,2));
		JRadioButton rbtn1=new JRadioButton("Guardado automatico cada 30 minutos",true);
		JRadioButton rbtn2=new JRadioButton("No guardar seguimiento",false);
		
			//Grupo de radiobuttons
				ButtonGroup grupo1 = new ButtonGroup();
				grupo1.add(rbtn1);
				grupo1.add(rbtn2);
				
				centro.add(rbtn1);
				centro.add(rbtn2);
				
			
				
		ventanaO.add(centro, BorderLayout.CENTER);
		
		//Panel sur
		JPanel sur = new JPanel();
		sur.setLayout(new GridLayout(1,1));
		JButton salir = new JButton("<html><b>Seguir Jugando</b></html>");
		salir.setFont(new Font("Calibri", Font.ROMAN_BASELINE, 12));
		
		sur.add(salir);
		
		ventanaO.add(sur, BorderLayout.SOUTH);
		
		salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaO.dispose();
				
			}
		});
		
		ventanaO.setVisible(true);
		ventanaO.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new VentanaOptions();
	}

}
