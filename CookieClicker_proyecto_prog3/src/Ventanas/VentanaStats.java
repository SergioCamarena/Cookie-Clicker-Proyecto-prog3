package Ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

<<<<<<< HEAD:CookieClicker_proyecto_prog3/src/ventanas/VentanaStats.java
<<<<<<< HEAD:CookieClicker_proyecto_prog3/src/Ventanas/VentanaStats.java
import Datos.Usuario;
=======
import code.Tabla;
import datos.Usuario;
>>>>>>> 5b26c85d292f3b185833add3be80d7ddaffebe23:CookieClicker_proyecto_prog3/src/ventanas/VentanaStats.java
=======
import Code.Tabla;
import Datos.Usuario;
>>>>>>> a3079ff99f61f587c5897265042563f0de7f291e:CookieClicker_proyecto_prog3/src/Ventanas/VentanaStats.java

public class VentanaStats {
	Usuario u = new Usuario();	//Nueva instancia de Usuario
	
	public VentanaStats() {
		JFrame ventanaS = new JFrame(); 
		JPanel norte = new JPanel();
		JLabel titulo = new JLabel("ESTADISTICAS DE " + u.getNom_usuario()); //Anyadir el nombre del usuario en específico que esté consultando las estadísticas  
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		ventanaS.add(norte, BorderLayout.NORTH );
		
		
		//Panel Oeste (TODAS LAS ESTADISTICAS DEL JUEGO)
		JPanel oeste = new JPanel();
		oeste.setLayout(new GridLayout(7,2));
		
		oeste.add(new JLabel());	//Labels en blanco, simplemente estetica
		oeste.add(new JLabel());
		
		//cps
		JLabel cookies_ps = new JLabel("Cookies per second:  ");
		JLabel psvariable = new JLabel();
		oeste.add(cookies_ps);
		oeste.add(psvariable);
		
		//totalbuild
		JLabel totalBuildings = new JLabel("Numero total de edificios adquiridos: ");
		JLabel buildingsVar = new JLabel();
		oeste.add(totalBuildings);
		oeste.add(buildingsVar);
		
		//bakedcookies
		JLabel totalcookies = new JLabel("Cookies totales cocinadas: ");
		JLabel totalCookieVar = new JLabel();
		oeste.add(totalcookies);
		oeste.add(totalCookieVar);
		
		//Cuando creaste cuenta
		JLabel tTotalJuego = new JLabel("Tu legado empezo hace: ");
		JLabel tTotalJuegoVar = new JLabel();
		oeste.add(tTotalJuego);
		oeste.add(tTotalJuegoVar);
		
		//Cuanto has estado jugando sin cerrar la pantalla
		JLabel tPartida = new JLabel("LLevas cocinando cookies sin parar: ");
		JLabel tPartidaVar = new JLabel();
		oeste.add(tPartida);
		oeste.add(tPartidaVar);
		
		ventanaS.add(oeste, BorderLayout.WEST );
		
		//Panel Sur --- Botoneria para volver o ir a tabla
		JPanel sur = new JPanel();
		sur.setLayout(new GridLayout(1,3));
		
		JButton rankings = new JButton("Rankings");
		sur.add(rankings);
		sur.add(new JLabel());
		
		JButton volver = new JButton(u.getNom_usuario()+" vuelve al Juego");
		sur.add(volver);
		ventanaS.add(sur, BorderLayout.SOUTH);
		//Creamos nueva tabla
		rankings.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Tabla();
				
			}
		});
		//Se cierra ventanaS
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaS.dispose();
			}
		});
		
		
		ventanaS.setBounds(300, 0, 800, 400);
		ventanaS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaS.setResizable(false);//para que no cambies de formato de ventana
		ventanaS.setVisible(true);
	}
	public static void main (String[]args) {
		new VentanaStats();
	}
}
