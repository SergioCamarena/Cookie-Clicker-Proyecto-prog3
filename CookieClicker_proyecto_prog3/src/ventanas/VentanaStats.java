package ventanas;

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

import code.Tabla;
import datos.Usuario;

public class VentanaStats {
	Usuario u = new Usuario();
	public VentanaStats() {
		JFrame ventanaS = new JFrame(); //Anyadir el nombre del usuario en específico que esté consultando las estadísticas  
		JPanel norte = new JPanel();
		JLabel titulo = new JLabel("ESTADISTICAS DE " + u.getNom_usuario());
		titulo.setFont(new Font("Serif", Font.PLAIN,40 ));
		norte.add(titulo);
		ventanaS.add(norte, BorderLayout.NORTH );
		
		JPanel oeste = new JPanel();
		oeste.setLayout(new GridLayout(7,2));
		
		oeste.add(new JLabel());
		oeste.add(new JLabel());
		JLabel cookies_ps = new JLabel("Cookies per second:  ");
		JLabel psvariable = new JLabel();
		oeste.add(cookies_ps);
		oeste.add(psvariable);
		
		JLabel totalBuildings = new JLabel("Numero total de edificios adquiridos: ");
		JLabel buildingsVar = new JLabel();
		oeste.add(totalBuildings);
		oeste.add(buildingsVar);
		
		JLabel totalcookies = new JLabel("Cookies totales cocinadas: ");
		JLabel totalCookieVar = new JLabel();
		oeste.add(totalcookies);
		oeste.add(totalCookieVar);
		
		JLabel tTotalJuego = new JLabel("Tu legado empezo hace: ");
		JLabel tTotalJuegoVar = new JLabel();
		oeste.add(tTotalJuego);
		oeste.add(tTotalJuegoVar);
		
		JLabel tPartida = new JLabel("LLevas cocinando cookies sin parar: ");
		JLabel tPartidaVar = new JLabel();
		oeste.add(tPartida);
		oeste.add(tPartidaVar);
		
		ventanaS.add(oeste, BorderLayout.WEST );
		
		JPanel sur = new JPanel();
		sur.setLayout(new GridLayout(1,3));
		JButton rankings = new JButton("Rankings");
		sur.add(rankings);
		sur.add(new JLabel());
		JButton volver = new JButton(u.getNom_usuario()+" vuelve al Juego");
		sur.add(volver);
		ventanaS.add(sur, BorderLayout.SOUTH);
		rankings.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Tabla();
				
			}
		});
		
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaS.dispose();
			}
		});
		
		
		
		ventanaS.setBounds(300, 0, 800, 400);
		ventanaS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaS.setResizable(false);
		ventanaS.setVisible(true);
	}
	public static void main (String[]args) {
		new VentanaStats();
	}
}
