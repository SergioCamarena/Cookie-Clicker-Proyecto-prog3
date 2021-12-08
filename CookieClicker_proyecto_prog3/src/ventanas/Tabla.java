
package ventanas;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import datos.Partida;
import datos.Usuario;
import gestion.de.datos.BaseDeDatos;

public class Tabla {
		
		/*
		 * HAY QUE MIRAR BIEN COMO SE HACE LA JTABLE PARA QUE SE PONGA CUBRIENDO TODA LA PANTALLA
		 *  
		 * HAY QUE SACAR LOS VALORES DE LA BD E INTRODUCIRLAS AQUÍ
		 * 
		 * HASTA QUE NO SE SOLUCIONE LA BASE DE DATOS NO PUEDO CONTINUAR HACIENDO LA TABLA
		 * */
//		JFrame ventanaT = new JFrame("RANKING MUNDIAL");
//		ventanaT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		//JPanel PanelRanking = new JPanel();
//		ventanaT.setSize( 800, 400);
//		
//		//Tabla en la ventana
//		
//		
//		ventanaT.setVisible(true);
		private static JFrame ventanaT;
		private static JTable ranking;
		private static DefaultTableModel modelo;
		private static ArrayList<Partida> listPartida;
		private static ArrayList<Usuario> listUsuario;
		//private static JComboBox<String>cbUsuarios;
		//private static JPanel pNorte;
		
		public static void main(String[]args) {
			ventanaT = new JFrame("Ranking Mundial");
			ventanaT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			ventanaT.setSize(800,400);
			//cbUsuarios = new JComboBox<>();
			//pNorte.add(cbUsuarios);
			
			//Tabla en la ventana
			modelo = new DefaultTableModel(new Object[] {"Codigo partida","Usuario","Cookies per second", "Cookies totales", "Edificios totales", "Tiempo total"},0);
			ranking = new JTable(modelo) ;
			//ranking.add(new File("Ranking"));
//			for(Partida p : listPartida) {
//				for(Usuario u : listUsuario) {
//					modelo.addRow(new Object[] {p.getCod_partida(),u.getNom_usuario() , p.getCookie_ps(), p.getCookie_tot(), p.getEdif_tot(), p.getTiempo_tot()});
//				}
//			}
			modelo.addRow(new Object[] {01, "Sergio", 100 , 20 , 300 , 220 , 8});
			
			ranking.setModel(modelo);

			ventanaT.getContentPane().add(new JScrollPane(ranking), BorderLayout.CENTER);
			
			//Tamaño de las columnas
			ranking.getColumnModel().getColumn(0).setMinWidth(40);
			ranking.getColumnModel().getColumn(0).setMaxWidth(160);
			ranking.getColumnModel().getColumn(1).setMinWidth(40);
			ranking.getColumnModel().getColumn(1).setMaxWidth(160);
			ranking.getColumnModel().getColumn(2).setMinWidth(40);
			ranking.getColumnModel().getColumn(2).setMaxWidth(160);
			ranking.getColumnModel().getColumn(3).setMinWidth(40);
			ranking.getColumnModel().getColumn(3).setMaxWidth(160);
			ranking.getColumnModel().getColumn(4).setMinWidth(40);
			ranking.getColumnModel().getColumn(4).setMaxWidth(160);
			ranking.getColumnModel().getColumn(5).setMinWidth(40);
			ranking.getColumnModel().getColumn(5).setMaxWidth(160);
			
			ranking.getTableHeader().setReorderingAllowed(false); //Phohibir que las columnas se muevan	
			
			ventanaT.setVisible(true);
		}
		
		
//		
	
}
