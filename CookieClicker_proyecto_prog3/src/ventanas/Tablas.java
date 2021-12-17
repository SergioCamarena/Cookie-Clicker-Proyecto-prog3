package ventanas;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import code.LeerFicheros;
import datos.Partida;
import datos.Usuario;

public class Tablas {

	private static JFrame ventanaT;
	private static JTable ranking;
	private static DefaultTableModel modelo;
	private static ArrayList<Partida> listPartida;
	private static ArrayList<Usuario> listUsuario;
	//private static JComboBox<String>cbUsuarios;
	//private static JPanel pNorte;

	public Tablas() {
		ArrayList<Partida>partidas = LeerFicheros.cargartxt();

		ventanaT = new JFrame("Ranking Mundial");
		ventanaT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaT.setBounds(300,120,800,200);
		//cbUsuarios = new JComboBox<>();
		//pNorte.add(cbUsuarios);
		
		//Tabla en la ventana
		modelo = new DefaultTableModel(new Object[] {"Codigo partida","Usuario","Cookies per second", "Cookies totales", "Edificios totales", "Tiempo total"},0);
		
		
		Object[][] informacion = new Object[partidas.size()][6];
		for(int i = 0 ; i < partidas.size(); i++) {
			informacion[i][0] = partidas.get(i).getCod_partida();
			//Aqui falta poner lo de usuario pero como esta en otra clase distinta no se como ponerlo.
			//informacion[i][1] = partidas.get(i).
			informacion[i][2] = partidas.get(i).getCookie_tot();
			informacion[i][3] = partidas.get(i).getCookie_ps();
			informacion[i][4] = partidas.get(i).getEdif_tot();
			informacion[i][5] = partidas.get(i).getTiempo_tot();
		}
		
		
		ranking = new JTable() ;
		//EJEMPLO
		//modelo.addRow(new Object[] {01, "Sergio", 100 , 20 , 300 , 220 , 8});
		
		ranking.setModel(modelo);
		
		for(Object[] o : informacion) {
			modelo.addRow(o);
		}

		ventanaT.getContentPane().add(new JScrollPane(ranking), BorderLayout.CENTER);
		
		//Tama�o de las columnas
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
	public static void main(String[]args) {
		new Tablas();
	}
}
