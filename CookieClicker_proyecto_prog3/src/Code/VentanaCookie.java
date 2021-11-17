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
	static JLabel news;
	
	//Método de contador
	public static String met(double valor) {
		
		if (cont>0) {
			cont = cont+valor;
			 DecimalFormat f = new DecimalFormat("##.000"); //cuantos decimales despues de la , (3)
			 DecimalFormat g = new DecimalFormat("##.00"); //cuantos decimales despues de la , (2)
			 
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
	//Método News
	//Preguntar como puedo hacerlo
public static String Lista() {
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
		
		
			Thread corre = new Thread(new Runnable() {
				
				public void run() {
					while(true) {
					for (int i = 0; i < listanews.size(); i++) {
						news.setText(listanews.get(i));
						listanews.get(i);
						
						if ((i&1)==0) {
							news.setBackground(Color.red);
						}
						else if ((i%7)==1) {
							news.setBackground(Color.yellow);
						}
						else {
							news.setBackground(Color.cyan);
						}
						try {
							
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
					}
					
				
				
			}
			});
			corre.start();
			 
			return "";
			 
			
		}
		
		
	

	
	public VentanaCookie(){
		
		//Anyadiendo al ArrayList String de News
		
		//____________________________________________________________________-
		//Creaci�n de ventana
				JFrame ventanaCookie = new JFrame("Cookie Clicker");
				ventanaCookie.setBounds(0,0,1500, 600);
				ventanaCookie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				minijuego1.setEnabled(false);	//Ponemos el boton de minijuego false para que no pueda jugar desde el principio
				
				
				//_________________________________________EDIFICIOS & CLICKER
				JButton clicker = new JButton("CLICKER");
				
				JButton grandma = new JButton("GRANDMAS");
				
				JButton farm = new JButton("FARMS");
				
				
				
				
				
				
				//Panel de la derecha (EDIFICIOS)
				JPanel paneledif = new JPanel();
				paneledif.setBounds(0, 0, 600, 600);	//No funciona el setBounds mirar porque!!!!!
				paneledif.setBorder(new BevelBorder(BevelBorder.RAISED));
				paneledif.setLayout(new GridLayout(8,1));
				ventanaCookie.add(paneledif, BorderLayout.EAST);
				paneledif.add(clicker); 
				paneledif.add(grandma);
				paneledif.add(farm);
				
			//______VALOR ANYADIDO_______________________________________
				//Action listener del boton minijuego
				minijuego1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Minijuego();
						minijuego1.setEnabled(false);
					}
				});
				
				
				//Panel Cookie (JLabel --> boton CON IMAGEN DE COOKIE)
				
				JPanel panelgalleta = new JPanel();
				panelgalleta.setLayout(new GridLayout(3,1));
				panelgalleta.setBounds(0, 0, 400, 200);			//Porrque no nos tira esto?
				panelgalleta.setBorder(new BevelBorder(BevelBorder.RAISED));
				
				//Contador
				JLabel contador = new JLabel(met(1900.87264));
				contador.setFont(new Font("Arial",Font.PLAIN,20));
				panelgalleta.add(contador);
				
				//Ajustar la imagen para que quede bien y no sea enorme
				ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
				Image imgCookie = imgIcon.getImage();
				Image imq = imgCookie.getScaledInstance(120, 120 ,Image.SCALE_SMOOTH);
				imgIcon = new ImageIcon(imq);
				JLabel cookie = new JLabel(imgIcon);
				panelgalleta.add(cookie);
				
				//Un label que pone la version del juego
				JLabel version = new JLabel("                        V.2.031");
				version.setFont(new Font("Agency FB",Font.ROMAN_BASELINE,21));
				panelgalleta.add(version);
				
				//El JLabel de cookie hay que convertirlo en botón______________________________FALTA POR HACER
				cookie.addMouseListener(new MouseListener() {
					
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
				
				ventanaCookie.add(panelgalleta, BorderLayout.WEST);
				
		//PANEL NORTE
				//Panel News con botones de Stas/Info/Options
				JPanel panelNews = new JPanel();
				panelNews.setBorder(new TitledBorder("NEWS")); // Borde del panel
				
				
				panelNews.setLayout(new GridLayout(2,3));
				
				//Boton STATS
				JButton stats = new JButton("Stats");
				panelNews.add(stats);
				
				//SE LLAMA A LA VENTANA STATS
				stats.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaStats();
						
					}
				});
				//TITULO DEL JUEGO
				JLabel titulo = new JLabel("COOKIE CLICKER");
				titulo.setFont(new Font("",Font.ROMAN_BASELINE,32));
				titulo.setHorizontalAlignment(SwingConstants.CENTER);
				panelNews.add(titulo);
				
				//JLabel QUE SE USARA PARA QUE SALGAN LAS NEWS DE UN ARRAYLIST<STRING>
				news = new JLabel(Lista());
				news.setHorizontalAlignment(SwingConstants.CENTER);
				news.setBackground(Color.white);
				news.setOpaque(true);
				//WINDOW LISTENER
				//Esto lo hacemos para que cuando se habra el juego empiece lo de las news, habra que hacer tmb algo con la BD
				ventanaCookie.addWindowListener(new WindowListener() {
					
					@Override
					public void windowOpened(WindowEvent e) {
						
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
				
				//Lamamos a Ventana OPtions
				options.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new VentanaOptions();
						
					}
				});
				//Metemos el valor anyadido del minijuego
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
				
				//Panel centro_______________________________________________Falta por terminar!!!
				JPanel centro = new JPanel();
				centro.setLayout(new BorderLayout());
				
				//Paneles para separar la parte de los botones de las ventanas (Las columnas grises)
				JPanel vertizq = new JPanel();
				vertizq.setBackground(Color.gray);
				
				centro.add(vertizq, BorderLayout.WEST);
				
				JPanel vertder = new JPanel();
				vertder.setBackground(Color.gray);
				
				centro.add(vertder, BorderLayout.EAST);
				
				JPanel centrocent = new JPanel();
				centrocent.setLayout(new GridLayout(8,4));
				centrocent.setBackground(Color.magenta);
				
				
				centro.add(centrocent, BorderLayout.CENTER);
				
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
				
				ventanaCookie.setResizable(false);//Esto se hace para que no pueda cambiar el bounds de la ventana
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
