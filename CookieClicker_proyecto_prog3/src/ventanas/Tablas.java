package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import code.Edificios;
import code.LeerFicheros;
import datos.Partida;
import datos.Usuario;
import gestion.de.datos.BaseDeDatos;

public class Tablas {

	private static JFrame ventanaT;
	private static JTable ranking;
	private static DefaultTableModel modelo;
	private ArrayList<Partida>partidas;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas window = new Tablas();
					window.ventanaT.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public Tablas() {
		initialize();
	}
	
	//Inicializa los contenidos del frame
	private void initialize() {
		
		//ArrayList<Partida>partidas = LeerFicheros.cargartxt();
		partidas = LeerFicheros.cargartxt();

		ventanaT = new JFrame("Ranking Mundial");
		ventanaT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaT.setBounds(300,120,800,200);
		//cbUsuarios = new JComboBox<>();

		
		//Tabla en la ventana
		modelo = new DefaultTableModel(new Object[] {"Codigo partida","Usuario","Cookies per second", "Cookies totales", "Edificios totales", "Tiempo total"},0);
		
		
		Object[][] informacion = new Object[partidas.size()][6];
		for(int i = 0 ; i < partidas.size(); i++) {
			informacion[i][0] = partidas.get(i).getCod_partida();
			informacion[i][1] = partidas.get(i).getNom_usuario();
			informacion[i][2] = partidas.get(i).getCookie_ps();
			informacion[i][3] = partidas.get(i).getCookie_tot();
			informacion[i][4] = partidas.get(i).getEdif_tot();
			informacion[i][5] = partidas.get(i).getTiempo_tot();
		}
		
		ranking = new JTable();
			
		ranking.setModel(modelo);
		
		for(Object[] o : informacion) {
			modelo.addRow(o);
		}

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
		
		
		
		ranking.getTableHeader().setReorderingAllowed(false); //Prohibir que las columnas se muevan
		
		//Pintar la tabla
		ranking.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				// TODO Auto-generated method stub
				Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				String valor = String.valueOf(maxEdif(partidas).getEdif_tot());
				String minValor = String.valueOf(minEdif(partidas).getEdif_tot());
				String tiempo = String.valueOf(masTiempo(partidas).getTiempo_tot());
				if(table.getValueAt(row, 4).toString().equals(valor)) {
					comp.setBackground(Color.green);
				}else if(table.getValueAt(row, 4).toString().equals(minValor)){
					comp.setBackground(Color.cyan);
				}else if(table.getValueAt(row, 1).toString().equals("Andoni")){
					comp.setBackground(Color.orange);
				}else if(table.getValueAt(row, 5).toString().equals(tiempo)){
					comp.setBackground(Color.red);
				}else if(table.getValueAt(row, 1).toString().equals("Imanol")){
					comp.setBackground(Color.yellow);
				}else {
					comp.setBackground(Color.white);
				}
				return comp;
			}
		});
		
		
		//refrescarTabla();

		ventanaT.setVisible(true);
	}
	
	//Buscar el usuario que tenga el maximo de edificios
	public static Partida maxEdif(ArrayList<Partida>partidas) {
		Partida partida = null;
		for(Partida p : partidas) {
			if(partida==null) {
				partida=p;
			}else {
				if(partida.getEdif_tot() < p.getEdif_tot()) {
					partida = p;
				}
			}
		}
		return partida;
	}
	
	//Buscar el usuario que tenga menos edificios
	public static Partida minEdif(ArrayList<Partida>partidas) {
		Partida partida = null;
		for(Partida p : partidas) {
			if(partida==null) {
				partida=p;
			}else {
				if(partida.getEdif_tot() > p.getEdif_tot()) {
					partida = p;
				}
			}
		}
		return partida;
	}
	
	//Busca el usuario que mas tiempo haya jugado
	public static Partida masTiempo(ArrayList<Partida>partidas) {
		Partida partida = null;
		for(Partida p : partidas) {
			if(partida==null) {
				partida=p;
			}else {
				if(partida.getTiempo_tot() < p.getTiempo_tot()) {
					partida = p;
				}
			}
		}
		return partida;
	}
	

	//Para refrescar la tabla por si ha habido un cambio
	public void refrescarTabla() {
		ArrayList<Partida> partidas= null;
		for (Partida partida : partidas) {
			modelo.addRow(new Object[] { partida.getCod_partida(), partida.getNom_usuario(),partida.getCookie_ps(), partida.getEdif_tot(), partida.getTiempo_tot() });
		}
		ranking.setModel(modelo);
	}
	
	//observa cuantas filas tiene la tabla partidas
	public int getRowCount() {
		// TODO Auto-generated method stub
		return partidas.size();
	}
	
	//consigue los valores de cada una de las columnas y de las filas de la tabla
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Partida partida = partidas.get(rowIndex);
		switch (columnIndex) {
			case 0: return Integer.valueOf(partida.getCod_partida());
			case 1: return partida.getNom_usuario();
			case 2: return Integer.valueOf(partida.getCookie_ps());
			case 3: return Integer.valueOf(partida.getEdif_tot());
			case 4: return Integer.valueOf(partida.getTiempo_tot());
			default: return null;
		}
		
	}
	
	
}




