package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Minijuego extends JFrame{
	long startTime;
	long finishTime;
	int totalTime = 0;
	int intentos = 12;
	boolean empezar = true;
	
	public Minijuego() {
		int x = (int) (Math.random()*100);
		int y = (int) (Math.random()*100);
		Point centro = new Point(x, y);
		Diana diana = new Diana(centro);
		JPanel panelTarget = new JPanel();
		panelTarget.setBounds(x, y, diana.getDiametro(), diana.getDiametro());
		

		
		this.setLayout(new BorderLayout());
		ArrayList<Integer> puntuaciones = new ArrayList<Integer>();
		
		JPanel norte = new JPanel();
		JLabel textIntentos = new JLabel();
		textIntentos.setText("Intentos: " + intentos);
		JLabel textVelocidad = new JLabel();
		textVelocidad.setText("Velocidad = "+ Long.toString(totalTime));
		norte.add(textIntentos);
		norte.add(textVelocidad);
		this.add(norte, BorderLayout.NORTH);
		
		JPanel areaDeJuego = new JPanel();
		areaDeJuego.setLayout(null);
		
	
		JLabel iniciarJuego = new JLabel();
		iniciarJuego.setText("Haz click para iniciar");
		areaDeJuego.add(iniciarJuego);
		iniciarJuego.setBounds(areaDeJuego.getX() + areaDeJuego.getWidth()/2, areaDeJuego.getY()+areaDeJuego.getHeight()/2, areaDeJuego.getWidth(), areaDeJuego.getHeight());
		areaDeJuego.add(panelTarget);
		panelTarget.setBounds(x, y, diana.getDiametro(), diana.getDiametro());
		areaDeJuego.revalidate();		//Se fuerza a redibujar el panel y la ventana
		areaDeJuego.repaint();
		
	
		
		//Imagen en el panel Target				
		panelTarget.setOpaque(false);
		ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
		ImageIcon imgIcon2 = new ImageIcon("src/Code/cookuie.png");
		Image imgCookie = imgIcon.getImage();
		Image imgCookie2 = imgIcon.getImage();
		Image imq = imgCookie.getScaledInstance(75, 78 ,Image.SCALE_SMOOTH);
		Image imq2 = imgCookie2.getScaledInstance(1720, 950 ,Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(imq);
		imgIcon2 = new ImageIcon(imq2);
		JLabel targetIcon = new JLabel(imgIcon);
		JLabel areaIcon = new JLabel(imgIcon2);
		panelTarget.add(targetIcon); // El cuadrado del minijuego tiene una imagen 
		
		areaDeJuego.add(areaIcon);//El area de juego tiene un fondo
		
		this.add(areaDeJuego, BorderLayout.CENTER);
		
		panelTarget.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				int x = (int) (Math.random()*1200);
				int y = (int) (Math.random()*600);
				panelTarget.setBounds(x, y, diana.getDiametro(), diana.getDiametro());
				diana.setPanel(panelTarget);
				areaDeJuego.add(panelTarget);
				panelTarget.setBounds(x, y, diana.getDiametro(), diana.getDiametro());
				areaDeJuego.revalidate();		//Se fuerza a redibujar el panel y la ventana
				areaDeJuego.repaint();
				startTime = System.nanoTime();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(empezar){
					empezar = false;
				}else if(intentos > 0) {
					finishTime = System.nanoTime();
					totalTime = (int) Math.floor((finishTime-startTime)*Math.pow(10, -6));
					textVelocidad.setText(Long.toString(totalTime));
					puntuaciones.add(totalTime);
					intentos = intentos-1;
					textIntentos.setText("Intentos: " + intentos);
				}else {
					int media = 0;
					for(Integer puntuacion : puntuaciones) {
						media = media + puntuacion;
					}
					media = media/puntuaciones.size(); 
					int result = JOptionPane.showConfirmDialog(null, "Tu velocidad media ha sido de "+ media+ " lo cual es un " + (600 - media)+ " ms de diferencia con la media mundial\n�Quieres volver a jugar?", "TE HAS QUEDADO SIN INTENTOS",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);
					if(result == JOptionPane.YES_OPTION) {
						new Minijuego();
						dispose();
						
					}else if(result == JOptionPane.NO_OPTION) {
						dispose();
					}
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		this.setTitle("Prueba de reflejos: click en la diana");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setSize(1920,1050);														//Valores de la ventana para una experiencia comoda
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true); //Se lanza el hilo de JSwing
	}
	
	public static void main(String[] args) {
		new Minijuego();
	}
	





}
