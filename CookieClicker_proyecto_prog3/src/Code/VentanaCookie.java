package Code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class VentanaCookie {
	public static double cont = 1;	//Valor del contador (inicialización)
	static JButton minijuego1 = new JButton("MiniJuego");
	
	//Método de contador
	public static String met(double valor) {
		
		if (cont>0) {
			cont = cont+valor;
			 DecimalFormat f = new DecimalFormat("##.000");
			 DecimalFormat g = new DecimalFormat("##.00");
			//Estos ifs sirven para que ponga la parte del string después del numero
			if (cont>1000 && cont<1000000) {
				return "         "+ g.format(cont/1000) +"K Cookies         ";
				/*
				 * QUEREMOS QUE EL MINIJUEGO SOLO ESTE ACTIVO CUANDO ESTE ENTRE ALGUNOS VAREMOS
				if(cont>1000 && cont<3500) {
					minijuego1.setEnabled(false);
					
				}
				*/
			} else if (cont>=1000000 && cont<1000000000){
				return "                         "+ f.format(cont/1000000) +" million Cookies         ";

			}else {
				return "         "+ cont +" Cookies         ";
			}
			
		} else {
			return "         0 cookies         ";
		}
		
		
	
	}
	public VentanaCookie(){
		ArrayList<String> listanews = new ArrayList<String>();
		listanews.add("News: Cookie World making some upgrades");
		listanews.add("News: Chocolate cookie now 30% cheaper");
		listanews.add("News: Milk coming in next upgrade");
		listanews.add("News: Cookie World searching for the CookieThief");
		listanews.add("News: Gradmas looking for upgrades");
		listanews.add("News: Gradmas working really efectively");
		listanews.add("News: Farms found a great location");
		listanews.add("News: Farms fields in the new upgrade");
		listanews.add("News: The concern still stays in Cookie World");
		listanews.add("News: The 70% in the CookieMall");
		//Creaci�n de ventana
				JFrame ventanaCookie = new JFrame("Cookie Clicker");
				ventanaCookie.setBounds(0,0,1500, 600);
				ventanaCookie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				minijuego1.setEnabled(false);
				
				
				//_________________________________________EDIFICIOS & CLICKER
				JButton clicker = new JButton("CLICKER");
				
				JButton grandma = new JButton("GRANDMAS");
				
				JButton farm = new JButton("FARMS");
				
				
				
				//______VALOR ANYADIDO
				
				
				//Panel de la derecha (EDIFICIOS)
				JPanel paneledif = new JPanel();
				paneledif.setBounds(0, 0, 600, 600);
				paneledif.setBorder(new BevelBorder(BevelBorder.RAISED));
				paneledif.setLayout(new GridLayout(8,1));
				ventanaCookie.add(paneledif, BorderLayout.EAST);
				paneledif.add(clicker); 
				paneledif.add(grandma);
				paneledif.add(farm);
				
				
				minijuego1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Minijuego();
						minijuego1.setEnabled(false);
					}
				});
				
				
				//Panel Cookie (BOTON CON IMAGEN DE COOKIE)
				
				
				
				
				
				JPanel panelgalleta = new JPanel();
				panelgalleta.setLayout(new GridLayout(3,1));
				panelgalleta.setBounds(0, 0, 400, 200);
				panelgalleta.setBorder(new BevelBorder(BevelBorder.RAISED));
				
				//Contador
				JLabel contador = new JLabel(met(1900.87264));
				contador.setFont(new Font("Arial",Font.PLAIN,20));
				panelgalleta.add(contador);
				
				//Ajustar la imagen
				ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
				Image imgCookie = imgIcon.getImage();
				Image imq = imgCookie.getScaledInstance(120, 120 ,Image.SCALE_SMOOTH);
				imgIcon = new ImageIcon(imq);
				JLabel cookie = new JLabel(imgIcon);
				panelgalleta.add(cookie);
				
				JLabel version = new JLabel("                        V.2.031");
				version.setFont(new Font("Agency FB",Font.ROMAN_BASELINE,21));
				panelgalleta.add(version);
				
				cookie.addMouseListener(new MouseListener() {
//HAY QUE TERMINAR ESTO CUANDO SE CREE EL METODO (EL CONTADOR)
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
				//Los metemos en el panel
				//panelgalleta.add(contador, BorderLayout.NORTH);
				
				ventanaCookie.add(panelgalleta, BorderLayout.WEST);
				
				//Panel Botones Norte y News
				JPanel panelNews = new JPanel();
				panelNews.setBorder(new TitledBorder("NEWS")); // Borde del panel
				
				//Introducci�n de botones y diferentes layouts y bounds de cada uno.
				panelNews.setLayout(new GridLayout(2,3));
				
				//Boton STATS
				JButton stats = new JButton("Stats");
				stats.setBounds(0, 0, 20, 20);
				panelNews.add(stats);
				
				stats.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaStats();
						
					}
				});
				JLabel titulo = new JLabel("COOKIE CLICKER");
				titulo.setFont(new Font("",Font.ROMAN_BASELINE,32));
				titulo.setHorizontalAlignment(SwingConstants.CENTER);
				panelNews.add(titulo);
				
				//Las News
				JTextField news = new JTextField();
				news.enable(false);
				
				//Winndow listener
				ventanaCookie.addWindowListener(new WindowListener() {
					
					@Override
					public void windowOpened(WindowEvent e) {
						//Recorrer con un hilo un Arraylist de Strings y sacar un x random dentro de la lista y que haga x+1 y si llega al final que vuelva a empezar.
						/*Thread corre = new Thread(new Runnable() {
							public void run() {
								
								for (int i = 1; i < listanews.size();i++) {
									news.add(news, listanews.get(i));
									try {
										Thread.sleep(50000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								
							}
						});
						corre.run();
						
						//Que empiece a contar cuando empiezas a jugar y cuando se cierre que se sume al valor que tenias antes en la BD.
						Thread tiempojueg = new Thread(new Runnable() {
							
							@Override
							public void run() {
								//Hay que mirar como hacerlo
								
							}
						});
						*/
					}
					
					@Override
					public void windowIconified(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowDeiconified(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowDeactivated(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowClosed(WindowEvent e) {
						
						
					}
					
					@Override
					public void windowActivated(WindowEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//Boton OPTIONS
				JButton options = new JButton("Options");
				options.setBounds(0, 0, 20, 20);
				panelNews.add(options);
				
			
				options.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaOptions();
						
					}
				});
				
				panelNews.add(minijuego1);
				panelNews.add(news);
				JButton info = new JButton("Info");
				info.setBounds(0, 0, 20, 20);
				panelNews.add(info);
				
				info.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaInfo();
						minijuego1.setEnabled(true);//Esto es un modo prueba, cuando hagamos en contador podemos hacer que cuando llegue a X cookies
						// se ponga true y que luego se ponga false
						
					}
				});
				
				//Panel centro
				JPanel centro = new JPanel();
				
				/*
				 * NO DEJA HACER NADA DEL FONDO
				ImageIcon imgcentr = new ImageIcon("src/Code/fondo.png");
				Image imhg = imgcentr.getImage();
				Image imqa = imhg.getScaledInstance(620, 420 ,Image.SCALE_SMOOTH);
				imgcentr = new ImageIcon(imqa);
				JLabel fondo = new JLabel(imgcentr);
				centro.add(fondo);
				*/
				
				ventanaCookie.add(centro, BorderLayout.CENTER);
				
				ventanaCookie.add(panelNews, BorderLayout.NORTH);
				
				ventanaCookie.setResizable(false);
				ventanaCookie.setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaCookie();
	
}
	
}
/*
 * -Cuando pasas por encima de los botones de los diferentes edificios y dem�s te pone todas las cookies 
 * realizadas y cuantas hace por segundo. Para esto mirar el examen de PROG II de lo del calendar hay algo parecido
 * 
 * 
 * 
 * 
 * -
 * 
 * -
 * 
 * 
 * */
