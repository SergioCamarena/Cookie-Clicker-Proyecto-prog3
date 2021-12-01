
package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla {
	public Tabla() {
		
		/*
		 * HAY QUE MIRAR BIEN COMO SE HACE LA JTABLE PARA QUE SE PONGA CUBRIENDO TODA LA PANTALLA
		 *  
		 * HAY QUE SACAR LOS VALORES DE LA BD E INTRODUCIRLAS AQUÍ
		 * 
		 * */
		JFrame ventanaT = new JFrame("RANKING MUNDIAL");
		JPanel PanelRanking = new JPanel();
		JTable ranking = new JTable();
		DefaultTableModel modelo = (DefaultTableModel)ranking.getModel();
		
		modelo.addColumn("Usuario");
		modelo.addColumn("Cookies per second");
		modelo.addColumn("Cookies totales");
		modelo.addColumn("Edificios totales");
		
		Object [] fila = new Object[2];
		fila[0] = "dato columna 1";
		fila[1] = "dato columna 3";
		modelo.addRow ( fila ); // Añade una fila al final
		modelo.setValueAt ("nuevo valor", 0, 1); // Cambia el valor de la fila 1, columna 2.
		
		PanelRanking.add(ranking);
		ventanaT.add(PanelRanking);
		ventanaT.setBounds(0, 0, 800, 400);
		ventanaT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventanaT.setVisible(true);
	}
	public static void main (String[]args) {
		new Tabla();
	}
}
