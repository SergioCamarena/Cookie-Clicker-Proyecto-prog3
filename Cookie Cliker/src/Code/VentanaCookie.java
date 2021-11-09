package Code;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;



public class VentanaCookie {
	
	public VentanaCookie(){
		//Creación de ventana
				JFrame ventanaCookie = new JFrame("Cookie Clicker");
				ventanaCookie.setBounds(0,0,1500, 600);
				ventanaCookie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				//_________________________________________EDIFICIOS & CLICKER
				JButton clicker = new JButton("CLICKER");
				
				JButton adasdf = new JButton("No se utilizar github");
				
				JButton grandma = new JButton("GRANDMAS");
				
				JButton farm = new JButton("FARMS");
				
				
				
				//______VALOR AÑADIDO
				JButton minijuego1 = new JButton("MiniJuego");
				
				//Panel de la derecha (EDIFICIOS)
				JPanel paneledif = new JPanel();
				paneledif.setBounds(0, 0, 1200, 600);
				paneledif.setBorder(new BevelBorder(BevelBorder.RAISED));
				paneledif.setLayout(new GridLayout(8,1));
				ventanaCookie.add(paneledif, BorderLayout.EAST);
				paneledif.add(clicker); 
				paneledif.add(grandma);
				paneledif.add(farm);
				paneledif.add(minijuego1);
				
				minijuego1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Minijuego();
						
					}
				});
				
				
				//Panel Cookie (BOTÓN CON IMAGEN DE COOKIE)
				
				JButton cookie = new JButton( new ImageIcon("src/Code/cookieewe.jpg"));
				cookie.setBounds(0,0,50,50);
				JPanel panelgalleta = new JPanel();
				panelgalleta.setLayout(new BorderLayout());
				ventanaCookie.add(panelgalleta, BorderLayout.WEST);
				panelgalleta.add(cookie, BorderLayout.EAST);
				
				//Panel Botones Norte y News
				JPanel panelNews = new JPanel();
				panelNews.setBorder(new TitledBorder("NEWS")); // Borde del panel
				
				//Introducción de botones y diferentes layouts y bounds de cada uno.
				panelNews.setLayout(new GridLayout(2,3));
				JButton stats = new JButton("Stats");
				stats.setBounds(0, 0, 20, 20);
				panelNews.add(stats);
				
				stats.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaStats();
						
					}
				});
				JTextField news = new JTextField();
				panelNews.add(news);
				news.enable(false);
				JButton options = new JButton("Options");
				options.setBounds(0, 0, 20, 20);
				panelNews.add(options);
				
				options.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaOptions();
						
					}
				});
				
				
				
				JLabel blanco2 = new JLabel();
				panelNews.add(blanco2);
				JButton info = new JButton("Info");
				info.setBounds(0, 0, 20, 20);
				panelNews.add(info);
				
				info.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaInfo();
						
					}
				});
				
				ventanaCookie.add(panelNews, BorderLayout.NORTH);
				
				ventanaCookie.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaCookie();
	
}
	
}
/*
 * -Cuando pasas por encima de los botones de los diferentes edificios y demás te pone todas las cookies 
 * realizadas y cuantas hace por segundo. Para esto mirar el examen de PROG II de lo del calendar hay algo parecido
 * 
 * -La imagen de Cookie no está bien puesta --> hacerla bien
 * -El botón sea la mitad del panel y la otra mitad los stats y alguna otra cosa.
 * 
 * -
 * 
 * -
 * 
 * 
 * */
