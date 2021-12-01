package Code;

import java.awt.Point;

import javax.swing.JPanel;

public class Diana {
	JPanel panel = new JPanel();
	public int diametro;
	public Point centro;
	
	//public (clase de las imagenes) imagen;
	

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public Point getCentro() {
		return centro;
	}
	
	public void setCentro(Point centro) {
		this.centro = centro;
	}
	
	public Diana(Point centro) {
		this.centro = centro;
		this.diametro = 100;
		this.panel= null;
	}
	
}
