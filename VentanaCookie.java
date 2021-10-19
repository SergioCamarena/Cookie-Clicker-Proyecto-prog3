package Code;


import java.awt.BorderLayout;
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
import javax.swing.JPanel;



public class VentanaCookie {
	
	public VentanaCookie(){
		//Creación de ventana
				JFrame ventanaCookie = new JFrame("Cookie Clicker");
				ventanaCookie.setBounds(0,0,1500, 600);
				ventanaCookie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				//Creación de botones e icono cookie
				JButton cookie = new JButton( new ImageIcon("biscuit-png-5a35dccf199006.1077412415134793751047.jpg"));
				
				cookie.setBounds(0,0,800,600);
				JButton clicker = new JButton("CLICKER");
				clicker.setSize(20,20);
				JButton grandma = new JButton("GRANDMAS");
				grandma.setSize(20,20);
				JButton farm = new JButton("FARMS");
				farm.setSize(20,20);
				JButton minijuego1 = new JButton("MiniJuego");
				
				//Panel de la derecha (EDIFICIOS)
				JPanel paneledif = new JPanel();
				//paneledif.setLayout(new GridLayout(1,0));
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
				JPanel panelgalleta = new JPanel();
				panelgalleta.setLayout(new GridLayout(1,1));
				ventanaCookie.add(panelgalleta, BorderLayout.WEST);
				panelgalleta.add(cookie);
				
				
				
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
