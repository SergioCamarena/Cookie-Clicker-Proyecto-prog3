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

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
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
			informacion[i][1] = partidas.get(i).getNom_usuario();
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
		
		ranking.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			public Component getTableCellRendererComponent(JTable ranking, Object value, boolean isSelected, 
					boolean hasFocus, int row, int column) {
				setBackground(Color.white);
				ranking.setForeground(Color.black);
				Component comp = super.getTableCellRendererComponent(ranking, value, isSelected, hasFocus, row, column);
				return null;
			}
		});
		
//		tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//			int valorAnt;
//			JTextField tf;
//			@Override
//			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
//					boolean hasFocus, int row, int column) {
//				// TODO Auto-generated method stub
//				Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//				System.out.println((comp instanceof JLabel) + "->" + comp);
//				JLabel label = (JLabel) comp;
//				if(column == 0) {
//					comp.setBackground(Color.white);
//				} else {
//					int valor = Integer.parseInt(value.toString());
//					comp = new JSlider(0, 255, valor);
//				}
//				if (isSelected) {
//					comp.setBackground(Color.LIGHT_GRAY);
//					if(hasFocus) {
//						label.setBorder(BorderFactory.createLineBorder(Color.cyan, 3));
//					}
//				}
//				return comp;
//			}
//		});
//		public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
//		{        
//		    setBackground(Color.white);
//		    table.setForeground(Color.black);
//		    super.getTableCellRendererComponent(table, value, selected, focused, row, column);
//		    if(table.getValueAt(row,columna).equals("A"))
//		    {
//		        this.setForeground(Color.RED);
//		    }else if(table.getValueAt(row,columna).equals("B")){
//		        this.setForeground(Color.BLUE);
//		    }else if(table.getValueAt(row, columna).equals("C")){
//		        this.setForeground(Color.GREEN);
//		    }
//		    return this;
//		  }
//		  }
		ventanaT.setVisible(true);
	}

}
