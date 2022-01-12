package ventanas;

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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import code.Edificios;
import code.Minijuego;
import code.NombreEdif;
import datos.Usuario;

public class VentanaCookie implements MouseListener {
	//Estos de aqui abajo sirven para llevar la cuenta de cuantas imagenes hay en el panel centro
	public static int contgr= -1, contfrm= -1,contmine= -1,contfac= -1,contban= -1,conttem= -1,contwiz= -1,contship = -1;	
	//El que lleva la cuenta de todos los pulsa()
	static double cont =0, var = 0;
	//El boton de Minijuegos que se pone ON/OFF dependiendo de unos valores
	static JButton minijuego1 = new JButton("MiniJuego");
	//El contador es el que hace el display de cont
	static JLabel news, contador;
	static Thread corre, seg;
	//Este boolean es el que se encarga de hacer que los metodos terminen.
	static boolean seguir = true;
	//Esta t sirve para llevar la cuenta de cuantos news pasan.
	static int t = 0;
	//Solo son labels que hacen display de valores
	static JLabel lbl_num1,lbl_num2,lbl_num3,lbl_num4,lbl_num5,lbl_num6,lbl_num7,lbl_num8,lbl_num9,lbl_num10,lbl_num11,lbl_num12,version, nickName;
	//El numero de edificios que tiene cada uno.
	static int numcl=0,numgr=0,numfrm=0,numine=0,numfac=0,numban=0,numtem=0,numwiz =0,numship = 0;
	//RadioButton compra/venta
	static JRadioButton comprar,vender;
	//Valor por el cual multiplica cada vez que compras mas.
	static double valor = 0.15;
	//Instancia de usuario
	Usuario u = new Usuario();
	ArrayList<Edificios> listaedificios =new  ArrayList<Edificios>();
	
	//Class Compra...
	//Solo dos decimales
	//como lo ve
	//Resta de cookies
	//pasar el nick (como parametro?) //parametro a la ventana
	//Metodo cookies_por seg.
//___________________________________________________________________________________________
	public double  pulsa(double numero) {
		numero = (double) (numero*valor);
		
		return numero;
	}
	//Metodo que se recorre todo el rato 
	public String seg() {
		seg = new Thread(new Runnable() {
			
			public void run() {
				while(seguir) {
					cont = cont + pulsa(numcl)+pulsa(numgr)+pulsa(numfrm)+pulsa(numine)+pulsa(numfac)+pulsa(numban)+pulsa(numtem)+pulsa(numwiz)+pulsa(numship);
					contador.setText(String.format("%1$.2f", cont+var));
					
					try {
						seg.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
		}
		});
		seg.start();
		
		
		return "";
		 
		
	}
	//Metodo News
	
public static String Lista() {
	ArrayList<String> listanews = new ArrayList<String>();
	
	//Hay 156
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
	listanews.add("News:  cookie manufacturer downsizes, sells own grandmother!");
	listanews.add("News:  cookie farms suspected of employing undeclared elderly workforce!");
	listanews.add("News:  cookie farms release harmful chocolate in our rivers, says scientist!");
	listanews.add("News:  genetically-modified chocolate controversy strikes cookie farmers!");
	listanews.add("News:  free-range farm cookies popular with today");
	listanews.add("News:  farm cookies deemed unfit for vegans, says nutritionist.");
	listanews.add("News:  is our planet getting lighter? Experts examine the effects of intensive chocolate mining.");
	listanews.add("News:  chocolate mines found to cause earthquakes and sinkholes!");
	listanews.add("News:  chocolate mine goes awry, floods village in chocolate!");
	listanews.add("News:  depths of chocolate mines found to house \"peculiar, chocolaty beings\"!");
	listanews.add("News:  cookie factories linked to global warming!");
	listanews.add("News:  cookie factories involved in chocolate weather controversy!");
	listanews.add("News:  cookie factories on strike, robotic minions employed to replace workforce!");
	listanews.add("News:  cookie factories on strike - workers demand to stop being paid in cookies!");
	listanews.add("News:  factory-made cookies linked to obesity, says study.");
	listanews.add("News:  cookie loans on the rise as people can no longer afford them with regular money.");
	listanews.add("News:  cookies slowly creeping up their way as a competitor to traditional currency!");
	listanews.add("News:  most bakeries now fitted with ATMs to allow for easy cookie withdrawals and deposits.");
	listanews.add("News:  cookie economy now strong enough to allow for massive vaults doubling as swimming pools!");
	listanews.add("News:  explorers bring back ancient artifact from abandoned temple; archeologists marvel at the centuries-old ");
	listanews.add("News:  recently-discovered chocolate temples now sparking new cookie-related cult; thousands pray to Baker in the sky!");
	listanews.add("News:  just how extensive is the cookie pantheon? Theologians speculate about possible ");
	listanews.add("News:  theists of the world discover new cookie religion - \"Oh boy, guess we were wrong all along!\"");
	listanews.add("News:  heavy dissent rages between the schools of ");
	listanews.add("News:  \"Any sufficiently crude magic is indistinguishable from technology\", claims renowned technowizard.");
	listanews.add("News:  new chocolate planet found, becomes target of cookie-trading spaceships!");
	listanews.add("News:  massive chocolate planet found with 99.8% certified pure dark chocolate core!");
	listanews.add("News:  space tourism booming as distant planets attract more bored millionaires!");
	listanews.add("News:  chocolate-based organisms found on distant planet!");
	listanews.add("News:  ancient baking artifacts found on distant planet; \"terrifying implications\", experts say.");
	listanews.add("News:  national gold reserves dwindle as more and more of the precious mineral is turned to cookies!");
	listanews.add("News:  chocolate jewelry found fashionable, gold and diamonds \"just a fad\", says specialist.");
	listanews.add("News:  silver found to also be transmutable into white chocolate!");
	listanews.add("News:  defective alchemy lab shut down, found to convert cookies to useless gold.");
	listanews.add("News:  alchemy-made cookies shunned by purists!");
	listanews.add("News:  nation worried as more and more unsettling creatures emerge from dimensional portals!");
	listanews.add("News:  dimensional portals involved in city-engulfing disaster!");
	listanews.add("News:  tourism to cookieverse popular with bored teenagers! Casualty rate as high as 73%!");
	listanews.add("News:  cookieverse portals suspected to cause fast aging and obsession with baking, says study.");
	listanews.add("News:  \"do not settle near portals,\" says specialist; \"your children will become strange and corrupted inside.\"");
	listanews.add("News:  time machines involved in history-rewriting scandal! Or are they?");
	listanews.add("News:  time machines used in unlawful time tourism!");
	listanews.add("News:  Andoni si ves esto tenemos un 10 en la asignatura ;)");
	listanews.add("News:  cookies brought back from the past \"unfit for human consumption\", says historian.");
	listanews.add("News:  various historical figures inexplicably replaced with talking lumps of dough!");
	listanews.add("News:  \"I have seen the future,\" says time machine operator, \"and I do not wish to go there again.\"");
	listanews.add("News:  first antimatter condenser successfully turned on, doesn");
	listanews.add("News:  researchers conclude that what the cookie industry needs, first and foremost, is \"more magnets\".");
	listanews.add("News:  \"unravelling the fabric of reality just makes these cookies so much tastier\", claims scientist.");
	listanews.add("News:  new cookie-producing prisms linked to outbreak of rainbow-related viral videos.");
	listanews.add("News:  scientists warn against systematically turning light into matter - \"One day, we");
	listanews.add("News:  cookies now being baked at the literal speed of light thanks to new prismatic contraptions.");
	listanews.add("News:  world citizens advised \"not to worry\" about frequent atmospheric flashes.");
	listanews.add("News:  strange statistical anomalies continue as weather forecast proves accurate an unprecedented 3 days in a row!");
	listanews.add("News:  local man sails around the world to find himself - right where he left it.");
	listanews.add("News:  local guru claims \"there");
	listanews.add("News:  news writer finds herself daydreaming about new career. Or at least a raise.");
	listanews.add("News:  polls find idea of cookies made of cookies \"acceptable\" - \"at least we finally know what");
	listanews.add("News:  nation holds breath as nested ifs about to hatch.");
	listanews.add("News:  is another you living out their dreams in an alternate universe? Probably, you lazy bum!");
	listanews.add("News:  public recoils at the notion of a cosmos made of infinite idle games. \"I kinda hoped there");
	listanews.add("News:  comic book writers point to actual multiverse in defense of dubious plot points. \"See? I told you it wasn");
	listanews.add("News:  strange twisting creatures amass around cookie factories, nibble at assembly lines.");
	listanews.add("News:  ominous wrinkly monsters take massive bites out of cookie production; \"this can");
	listanews.add("News:  new-age terrorism strikes suburbs as houses find themselves covered in eggs and toilet paper.");
	listanews.add("News:  children around the world \"lost and confused\" as any and all Halloween treats have been replaced by cookies.");
	listanews.add("News:  bearded maniac spotted speeding on flying sleigh! Investigation pending.");
	listanews.add("News:  Santa Claus announces new brand of breakfast treats to compete with cookie-flavored cereals! \"They");
	listanews.add("News:  \"You mean he just gives stuff away for free?!\", concerned moms ask. \"Personally, I don");
	listanews.add("News:  children shocked as they discover Santa Claus isn");
	listanews.add("News:  scholars debate regarding the plural of reindeer(s) in the midst of elven world war.");
	listanews.add("News:  elves \"unrelated to gnomes despite small stature and merry disposition\", find scientists.");
	listanews.add("News:  drama unfolds at North Pole as rumors crop up around Rudolph");
	listanews.add("News:  heart-shaped candies overtaking sweets business, offering competition to cookie empire. \"It");
	listanews.add("News:  marrying a cookie - deranged practice, or glimpse of the future?");
	listanews.add("News:  boyfriend dumped after offering his lover cookies for Valentine");
	listanews.add("News:  long-eared critters with fuzzy tails invade suburbs, spread terror and chocolate!");
	listanews.add("News:  known universe now jammed with cookies! No vacancies!");
	listanews.add("News:  local cookie manufacturer becomes luckiest being alive!");
	listanews.add("News:  faint meowing heard around local cookie facilities; suggests new ingredient being tested.");
	listanews.add("News:  crowds of meowing kittens with little hard hats reported near local cookie facilities.");
	listanews.add("News:  locals report troupe of bossy kittens meowing adorable orders at passersby.");
	listanews.add("News:  local office cubicles invaded with armies of stern-looking kittens asking employees \"what");
	listanews.add("News:  new kitten college opening next week, offers courses on cookie-making and catnip studies.");
	listanews.add("News:  strange kittens with peculiar opinions on martial arts spotted loitering on local beet farms!");
	listanews.add("News:  are your spending habits sensible? For a hefty fee, these analysts will tell you!");
	listanews.add("News:  kittens break glass ceiling! Do they have any idea how expensive those are!");
	listanews.add("News:  local kittens involved in misguided musical production, leave audience perturbed and unnerved.");
	listanews.add("News:  major sugar-smuggling ring dismantled by authorities; ");
	listanews.add("News:  authorities warn tourists not to buy bootleg sugar lumps from street peddlers - \"You think you");
	listanews.add("News:  pro-diabetes movement protests against sugar-shaming. \"I");
	listanews.add("News:  \"Back in my day, sugar lumps were these little cubes you");
	listanews.add("News:  sugar lump-snacking fad sweeps the nation; dentists everywhere rejoice.");
	listanews.add("News:  broccoli tops for moms, last for kids; dads indifferent.");
	listanews.add("News:  middle age a hoax, declares study; turns out to be bad posture after all.");
	listanews.add("News:  kitties want answers in possible Kitty Kibble shortage.");
	listanews.add("News:  man robs bank, buys cookies.");
	listanews.add("News:  overgrown cookies found in fishing nets, raise questions about hormone baking.");
	listanews.add("News:  \"all-you-can-eat\" cookie restaurant opens in big city; waiters trampled in minutes.");
	listanews.add("News:  man found allergic to cookies; \"what a weirdo\", says family.");
	listanews.add("News:  foreign politician involved in cookie-smuggling scandal.");
	listanews.add("News:  cookies now more popular than ");
	listanews.add("News:  obesity epidemic strikes nation; experts blame ");
	listanews.add("News:  \"so I guess that");
	listanews.add("News:  movie cancelled from lack of actors; \"everybody");
	listanews.add("News:  comedian forced to cancel cookie routine due to unrelated indigestion.");
	listanews.add("News:  new cookie-based religion sweeps the nation.");
	listanews.add("News:  mysterious illegal cookies seized; \"tastes terrible\", says police.");
	listanews.add("News:  \"the universe pretty much loops on itself,\" suggests researcher; \"it");
	listanews.add("News:  \"Ook\", says interviewed orangutan.");
	listanews.add("News:  cookies could be the key to ");
	listanews.add("News:  flavor text ");
	listanews.add("News:  new popularity survey says ");
	listanews.add("News:  major city being renamed ");
	listanews.add("News:  \"memes from last year somehow still relevant\", deplore experts.");
	listanews.add("News:  nation cheers as legislators finally outlaw ");
	listanews.add("News:  person typing these wouldn");
	listanews.add("News:  \"average person bakes ");
	listanews.add("News:  millions of old ladies reported missing!");
	listanews.add("News:  processions of old ladies sighted around cookie facilities!");
	listanews.add("News:  families around the continent report agitated, transfixed grandmothers!");
	listanews.add("News:  doctors swarmed by cases of old women with glassy eyes and a foamy mouth!");
	listanews.add("News:  nurses report \"strange scent of cookie dough\" around female elderly patients!");
	listanews.add("News:  sightings of old ladies with glowing eyes terrify local population!");
	listanews.add("News:  retirement homes report \"female residents slowly congealing in their seats\"!");
	listanews.add("News:  whole continent undergoing mass exodus of old ladies!");
	listanews.add("News:  old women freeze in place in streets, ooze warm sugary syrup!");
	listanews.add("News:  large \"flesh highways\" scar continent, stretch between various cookie facilities!");
	listanews.add("News:  wrinkled \"flesh tendrils\" visible from space!");
	listanews.add("News:  remains of \"old ladies\" found frozen in the middle of growing fleshy structures!");
	listanews.add("News:  all hope lost as writhing mass of flesh and dough engulfs whole city!");
	listanews.add("News:  nightmare continues as wrinkled acres of flesh expand at alarming speeds!");

		
			 corre = new Thread(new Runnable() {
				
				public void run() {
					int i=0;
					while(seguir) {
						
						int k=i;
						while(i==k)k=(int)Math.floor(Math.random()*listanews.size());
						i=k;
						listanews.get(i);
						//System.out.println(i);
						news.setText(
								listanews.get(i));
						t = t+1;
						//System.out.println(t);
						
						//Para que el Boton MiniJuego se vaya activando cuando esten entre esos baremos
							if((t>=15) && (t<16)) {
								minijuego1.setEnabled(true);
							}else if ((t>=45) && (t<46)) {
								minijuego1.setEnabled(true);
							}else if ((t>=65) && (t<66)) {
								minijuego1.setEnabled(true);
							}else if ((t>=120) && (t<121)) {
								minijuego1.setEnabled(true);
							}else if ((t>=245) && (t<247)) {
								minijuego1.setEnabled(true);
							}else if ((t>=627) && (t<628)) {
								minijuego1.setEnabled(true);
							}else if ((t>=1255) && (t<1257)) {
								minijuego1.setEnabled(true);
							}else if ((t>=3524)) {
								minijuego1.setEnabled(true);
							}else {
								minijuego1.setEnabled(false);//Si no es ninguno de esos valores de arriba que este apagado
							}
						
						
						
						//Depende del numero que salga saca un color u otro.
						if ((i>=0) & (i < 15)) {
							news.setBackground(Color.red);
						}
						else if((i>=15) & (i < 30)) {
							news.setBackground(Color.pink);
						}
						else if ((i>=30) & (i< 50)) {
							news.setBackground(Color.yellow);
						}
						else if((i>=50) & (i< 75)) {
							news.setBackground(Color.green);
						}
						else if((i>=75) & (i<100)) {
							news.setBackground(Color.magenta);
						}
						else if((i>=100) & (i<115)){
							news.setBackground(Color.orange);
						}
						else if ((i>=115) & (i<130)) {
							news.setBackground(Color.cyan);
						}
						else {
							news.setBackground(Color.LIGHT_GRAY);
						}
						try {
							//Antes de pasar al siguiente espera 5s
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}	
					}	
			}
			});
			corre.start();
			
			
			return "";
			 
			
		}
//_________________________Para que salgan los TollTip	
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
	lbl_num1.setToolTipText("<html>CLICKER<br> Tenemos ahora mismo "+ numcl +" de clickers.<br> Cookies totales ___ <br></html>");
	lbl_num1.getToolTipText();
	lbl_num2.setToolTipText("<html>GRANDMAS<br> Tenemos ahora mismo "+ numgr +" de grandmas.<br> Cookies totales ___ <br></html>");
	lbl_num2.getToolTipText();
	lbl_num3.setToolTipText("<html>FARMS<br> Tenemos ahora mismo "+ numfrm +" de farms.<br> Cookies totales ___ <br></html>");
	lbl_num3.getToolTipText();
	lbl_num4.setToolTipText("<html>MINE<br> Tenemos ahora mismo "+ numine +" de mines.<br> Cookies totales ___ <br></html>");
	lbl_num4.getToolTipText();
	lbl_num5.setToolTipText("<html>FACTORY<br> Tenemos ahora mismo "+ numfac +" de factories.<br> Cookies totales ___ <br></html>");
	lbl_num5.getToolTipText();
	lbl_num6.setToolTipText("<html>BANK<br> Tenemos ahora mismo "+ numban +" de banks.<br> Cookies totales ___ <br></html>");
	lbl_num6.getToolTipText();
	lbl_num7.setToolTipText("<html>TEMPLE<br> Tenemos ahora mismo "+ numtem +" de temples.<br> Cookies totales ___ <br></html>");
	lbl_num7.getToolTipText();
	lbl_num8.setToolTipText("<html>WIZZARD TOWER<br> Tenemos ahora mismo "+ numwiz +" de wizzard towers.<br> Cookies totales ___ <br></html>");
	lbl_num8.getToolTipText();
	lbl_num9.setToolTipText("<html>SHIPMENT<br> Tenemos ahora mismo "+ numship +" de shipments.<br> Cookies totales ___ <br></html>");
	lbl_num9.getToolTipText();
	lbl_num10.setToolTipText("<html>ARCHEMY LAB<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	lbl_num10.getToolTipText();
	lbl_num11.setToolTipText("<html>PORTAL<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	lbl_num11.getToolTipText();
	lbl_num12.setToolTipText("<html>TIME MACHINE<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	lbl_num12.getToolTipText();
	
	//version
	version.setToolTipText("<html><b>VERSION</b><br> Somos <b>Elaia, Sergio e Imanol.</b><br> Y te invitamos a que <b>disfrutes</b> de nustro juego <br></html>");
	version.getToolTipText();
	
	}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


 String hora, minutos, segundos, ampm;
 Calendar calendario;
 Thread h1;  //un hilo que nos ayudara a actualizar la hora en tiempo real

//Metodo que realiza los calculos de la hora
public void calcula() {
	Calendar calendario = new GregorianCalendar();
	Date fechaHoraActual = new Date();
	
	calendario.setTime(fechaHoraActual);
	ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";  //Para verificar si la hora es AM o PM
	
	if(ampm.equals("PM")) {
		int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
		hora = h>9?""+h:0+"h";
	}else {
		hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
	}
}



	public VentanaCookie(){

		//____________________________________________________________________-
		//Creacion de ventana
				JFrame frame = new JFrame();
				
				JPanel ventanaCookie=new JPanel();
				ventanaCookie.setLayout(new BorderLayout());
		
				
				frame.setBounds(0,0,1700, 850);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				minijuego1.setEnabled(false);	//Ponemos el boton de minijuego false para que no pueda jugar desde el principio
				frame.add(ventanaCookie);
				//_____________________________
				
				
				
				
				//_____________________________
				
	//Paneles del CENTRO (Estos tendr·n un metodo que hace que cada vez que se pulsa un boton se crea un label de cada)
				//Panel centro_______________________________________________
				JPanel centro = new JPanel();
				centro.setLayout(new BorderLayout());
				
				//Paneles para separar la parte de los botones de las ventanas (Las columnas grises)
				JPanel vertizq = new JPanel();
				vertizq.setBackground(Color.black);
				
				centro.add(vertizq, BorderLayout.WEST);
				
				JPanel vertder = new JPanel();
				vertder.setBackground(Color.black);
				
				centro.add(vertder, BorderLayout.EAST);
				
				JPanel centrocent = new JPanel();
				centrocent.setLayout(new GridLayout(11,1));
				centrocent.setBounds(0,0,900, 1000);
				centrocent.setMinimumSize(new Dimension(900,1000));
				centrocent.setMaximumSize(new Dimension(900,1000));
				centrocent.setPreferredSize(new Dimension(900,1000));
					
					//Para saber lo que tarda en ejecutarse el programa 
					System.out.println("a");
			
					//____________
					//Panel del centro grandma
					JPanel grand1 = new JPanel();
					grand1.setBackground(Color.cyan);
					grand1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					Image imagen=new ImageIcon("src/imagenes/grandma.png").getImage();
					JLabel lbl_imagen1=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen1.setVisible(false);//Las dejamos a false para que no se vean
						grand1.add(lbl_imagen1);
					}
					JLabel lbl_grandma=new JLabel("");
					grand1.add(lbl_grandma);//AÒadimos el label que ser· el que aparezcan el numero cuando tines mas de 7
					centrocent.add(grand1);
					
					//____________
					//Panel del centro farm
					JPanel farm1 = new JPanel();
					farm1.setBackground(Color.pink);
					farm1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/farm.png").getImage();
					 JLabel lbl_imagen2=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen2.setVisible(false);//Las dejamos a false para que no se vean
						farm1.add(lbl_imagen2);
					}
					JLabel lbl_farm=new JLabel("");
					farm1.add(lbl_farm);//AÒadimos el label que ser· el que aparezcan el numero cuando tines mas de 7
					centrocent.add(farm1);
					
					//___________
					//Panel del centro mine
					JPanel mine1 = new JPanel();
					mine1.setBackground(Color.green);
					mine1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/farm.png").getImage();
					 JLabel lbl_imagen3=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen3.setVisible(false);//Las dejamos a false para que no se vean
						mine1.add(lbl_imagen3);
					}
					JLabel lbl_mine=new JLabel("");
					mine1.add(lbl_mine);//AÒadimos el label que ser· el que aparezcan el numero cuando tines mas de 7
					centrocent.add(mine1);
					
					//_____________
					//Panel del centro factory
					JPanel factory1 = new JPanel();
					factory1.setBackground(Color.orange);
					factory1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/factory.png").getImage();
					//Escalamos la imagen a lo que queremos
						JLabel lbl_imagen4=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen4.setVisible(false);//Las dejamos a false para que no se vean
						factory1.add(lbl_imagen4);
					}
					JLabel lbl_fac=new JLabel("");
					factory1.add(lbl_fac);//AÒadimos el label que ser· el que aparezcan el numero cuando tines mas de 7
					centrocent.add(factory1);
					
					//_____________
					//Panel del centro bank
					JPanel bank1 = new JPanel();
					bank1.setBackground(Color.cyan);
					bank1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/bank.png").getImage();
					//Escalamos la imagen a lo que queremos
						JLabel lbl_imagen5=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen5.setVisible(false);//Las dejamos a false para que no se vean
						bank1.add(lbl_imagen5);
					}
					JLabel lbl_ban=new JLabel("");
					bank1.add(lbl_ban);//AÒadimos el label que ser· el que aparezcan el numero cuando tines mas de 7
					centrocent.add(bank1);
					System.out.println("c");
					
					//__________
					//Panel centro temple
					JPanel temple1 = new JPanel();
					temple1.setBackground(Color.pink);
					temple1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/temple.png").getImage();
					//Escalamos la imagen a lo que queremos
					 JLabel lbl_imagen6=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					 for (int i = 0; i < 8; i++) {
						lbl_imagen6.setVisible(false);//Las dejamos a false para que no se vean
						temple1.add(lbl_imagen6);
					}
					JLabel lbl_tem=new JLabel("");
					temple1.add(lbl_tem);
					centrocent.add(temple1);
					
					//Panel del centro wizzard tower
					JPanel wt1 = new JPanel();
					wt1.setBackground(Color.green);
					wt1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/wizard.png").getImage();
					 JLabel lbl_imagen7=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					for (int i = 0; i < 8; i++) {
						lbl_imagen7.setVisible(false);//Las dejamos a false para que no se vean
						wt1.add(lbl_imagen7);
					}
					JLabel lbl_wt=new JLabel("");
					wt1.add(lbl_wt);
					centrocent.add(wt1);
					
					//Panel del centro shipment
					JPanel ship1 = new JPanel();
					ship1.setBackground(Color.orange);
					ship1.setBorder(new LineBorder(Color.BLACK));
					
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					 imagen=new ImageIcon("src/imagenes/shipment.png").getImage();
					for (int i = 0; i < 8; i++) {
						JLabel lbl_imagen8=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
						lbl_imagen8.setVisible(false);//Las dejamos a false para que no se vean
						ship1.add(lbl_imagen8);
					}
					System.out.println("b");
					JLabel lbl_ship=new JLabel("");
					ship1.add(lbl_ship);
					centrocent.add(ship1);
					
		//Para la proxima actualizaciÛn
					
//_________________________________________________________________________________________________________
					JPanel arch1 = new JPanel();
					arch1.setBackground(Color.cyan);
					arch1.setBorder(new LineBorder(Color.BLACK));
					centrocent.add(arch1);
					JPanel portal1 = new JPanel();
					portal1.setBackground(Color.pink);
					portal1.setBorder(new LineBorder(Color.BLACK));
					centrocent.add(portal1);
					JPanel timemach1 = new JPanel();
					timemach1.setBackground(Color.green);
					timemach1.setBorder(new LineBorder(Color.BLACK));
					centrocent.add(timemach1);
					
					centrocent.setBackground(Color.black);
					centro.add(new JScrollPane(centrocent), BorderLayout.CENTER);
//_________________________________________EDIFICIOS & CLICKER______________________________________________
					
					
				JButton btn_clicker = new JButton("CLICKER");//Creamos los botones de la derecha
				JButton btn_grandma = new JButton("GRANDMAS");
				JButton btn_farm = new JButton("FARMS");
				JButton btn_mine = new JButton("MINE");
				JButton btn_factory =new JButton("FACTORY");
				JButton btn_bank  = new JButton("BANK");
				JButton btn_temple  = new JButton("TEMPLE");
				JButton btn_wiz  = new JButton("WIZZARD TOWER");
				JButton btn_ship  = new JButton("SHIPMENT");
				JButton btn_arch  = new JButton("ARCHEMY LAB");
				JButton btn_portal  = new JButton("PORTAL");
				JButton btn_timemach  = new JButton("TIME MACHINE");
				
				//CreaciÛn de instancias de edificio
					//sustituir variable numcl y demas por las variables de cada instancia.
				ArrayList<Edificios> listaEdif = new ArrayList<Edificios>();
				Edificios cursor = new Edificios(NombreEdif.CURSOR, 10.5, numcl,numcl, 15);
				Edificios grandma = new Edificios(NombreEdif.GRANDMA, 10.5, numgr,numgr, 32);
				Edificios farm = new Edificios(NombreEdif.FARM, 10.5, numfrm,numfrm, 45);
				Edificios mine = new Edificios(NombreEdif.MINE, 10.5, numine,numine, 150);
				Edificios factory = new Edificios(NombreEdif.FACTORY, 10.5, numfac,numfac, 450);
				Edificios bank = new Edificios(NombreEdif.BANK, 10.5, numban,numban, 700);
				
				//Meter edificios dentro de lista
				listaEdif.add(cursor);
				listaEdif.add(grandma);
				listaEdif.add(farm);
				listaEdif.add(mine);
				listaEdif.add(factory);
				listaEdif.add(bank);
				
				
				//Panel de la derecha (EDIFICIOS)
				JPanel este = new JPanel();
				este.setLayout(new BorderLayout());
				
				JPanel compvent = new JPanel();
				compvent.setLayout(new GridLayout(2,2));
				compvent.setBorder(new BevelBorder(BevelBorder.LOWERED));
				
				JLabel titu = new JLabel("Componentes");
				titu.setOpaque(true);
				titu.setBackground(Color.red);
				
				JLabel rojo = new JLabel();
				rojo.setOpaque(true);
				rojo.setBackground(Color.red);
				compvent.add(titu);
				compvent.add(rojo);
				
				 comprar=new JRadioButton("Comprar",false);
				 vender=new JRadioButton("Vender",true);
				
					//Grupo de radiobuttons
						ButtonGroup grupo1 = new ButtonGroup();
						grupo1.add(comprar);
						grupo1.add(vender);
						
						compvent.add(comprar);
						compvent.add(vender);
						
				este.add(compvent, BorderLayout.NORTH);
				
				//ACTION LISTENERS DE RADIOBUTTONS Y BOTONES
				
				
//Array de contadores que funcionen por indices.!!				
				
						btn_clicker.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numcl = numcl+1;
									lbl_num1.setText(""+numcl);
								}
								else {
									
									lbl_num1.setText(""+numcl);//NO resta nada de momento
									/*
									if(numcl > 0) {
										numcl = numcl-1;
										num1.setText(""+numcl);
									}
									else {
										numcl = 0;
										}
										*/
								}
								}
							
							
						});
						btn_grandma.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									contgr++;//contador de gradmas
									if(contgr<7) {
										grand1.getComponent(contgr).setVisible(true);
									}
									else {
										grand1.getComponent(8).setVisible(true);
										lbl_grandma.setText("+"+ (contgr-6));
										
									}
									numgr = numgr+1;
									lbl_num2.setText(""+numgr);
								}
								else {
									lbl_num2.setText(""+numgr);
									/*
									if(numgr > 0) {
										numgr = numgr-1;
										num2.setText(""+numgr);
									}
									else {
										numgr = 0;
										}
										*/
								}
							}
						});
						btn_farm.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contfrm++;
									if(contfrm<7) {
										farm1.getComponent(contfrm).setVisible(true);
									}
									else {
										farm1.getComponent(8).setVisible(true);
										lbl_farm.setText("+"+ (contfrm-6));
										
									}
									numfrm = numfrm+1;
									lbl_num3.setText(""+numfrm);
								}
								else {
									lbl_num3.setText(""+numfrm);//Deja las cosas como estan
									/*
									if(numgr >= 0) {
										
										
									}
										numfrm = numfrm-1;
										num3.setText(""+numfrm);
									}
									else {
										numfrm = 0;
										}
										*/
								}
							}
						});
						btn_mine.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contmine++;//contador de gradmas
									if(contmine<7) {
										mine1.getComponent(contmine).setVisible(true);
									}
									else {
										mine1.getComponent(8).setVisible(true);
										lbl_mine.setText("+"+ (contmine-6));
									}
									numine = numine+1;
									lbl_num4.setText(""+numine);
								}
								else {
									
									lbl_num4.setText(""+numine);
									/*
									if(numgr >= 0) {
										
										
									}
										numine = numine-1;
										num4.setText(""+numine);
									}
									else {
										numine = 0;
										}*/
								}
							}
						});
						btn_factory.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contfac++;//contador de gradmas
									if(contfac<7) {
										factory1.getComponent(contfac).setVisible(true);
									}
									else {
										factory1.getComponent(8).setVisible(true);
										lbl_fac.setText("+"+ (contfac-6));
									}
									numfac = numfac+1;
									lbl_num5.setText(""+numfac);
								}
								else {
									
									lbl_num5.setText(""+numfac);
									/*
									if(numgr > 0) {
										numfac = numfac-1;
										num5.setText(""+numfac);
									}
									else {
										numfac = 0;
										}
									*/
								}
								
								
							}
						});
						btn_bank.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contban++;//contador de gradmas
									if(contban<7) {
										bank1.getComponent(contban).setVisible(true);
									}
									else {
										bank1.getComponent(8).setVisible(true);
										lbl_ban.setText("+"+ (contban-6));
									}
									numban = numban+1;
									lbl_num6.setText(""+numban);
								}
								else {
									lbl_num6.setText(""+numban);
									/*
									if(numgr > 0) {
										numban = numban-1;
										num6.setText(""+numban);
									}
									else {
										numban = 0;
										}
										*/
								}
							}
						});
						btn_temple.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									conttem++;//contador de gradmas
									if(conttem<7) {
										temple1.getComponent(conttem).setVisible(true);
									}
									else {
										temple1.getComponent(8).setVisible(true);
										lbl_tem.setText("+"+ (conttem-6));
									}
									numtem = numtem+1;
									lbl_num7.setText(""+numtem);
								}
								else {
									lbl_num7.setText(""+numtem);
									/*
									if(numgr > 0) {
										numtem = numtem-1;
										num7.setText(""+numtem);
									}
									else {
										numtem = 0;
										}
										*/
								}
							}
						});
						btn_wiz.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contwiz++;//contador de gradmas
									if(contwiz<7) {
										wt1.getComponent(contwiz).setVisible(true);
									}
									else {
										wt1.getComponent(8).setVisible(true);
										lbl_wt.setText("+"+ (contwiz-6));
									}
									numwiz = numwiz+1;
									lbl_num8.setText(""+numwiz);
								}
								else {
									lbl_num8.setText(""+numwiz);
									/*
									if(numgr > 0) {
										numwiz = numwiz-1;
										num8.setText(""+numwiz);
									}
									else {
										numwiz = 0;
										}*/
									
								}
								
								
								
							}
						});
						btn_ship.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(comprar.isSelected()) {
									contship++;//contador de gradmas
									if(contship<7) {
										ship1.getComponent(contship).setVisible(true);
									}
									else {
										ship1.getComponent(8).setVisible(true);
										lbl_ship.setText("+"+ (contship-6));
									}
									numship = numship+1;
									lbl_num9.setText(""+numship);
									
								}
								else {
									lbl_num9.setText(""+numship);
									/*
									if(numgr > 0) {
										numship = numship-1;
										num9.setText(""+numship);
										
									}
									else {
										numship = 0;
										}
									*/
								}
								
								
							}
						});
						
					

//_______________________________________________________________________________________________________________________
				//Panel Edif
				JPanel paneledif = new JPanel();
				paneledif.setLayout(new GridLayout(12,2));
				paneledif.setBounds(0,0,300, 400);
				paneledif.setMinimumSize(new Dimension(300,600));
				paneledif.setMaximumSize(new Dimension(300,600));
				paneledif.setPreferredSize(new Dimension(300,600));
				paneledif.setBorder(new BevelBorder(BevelBorder.RAISED));
				
				//AÒadimos primero el btn y luego el label
				paneledif.add(btn_clicker);
				lbl_num1 = new JLabel(""+numcl);
				lbl_num1.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num1.setOpaque(true);
				lbl_num1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num1.setBackground(Color.orange);
				lbl_num1.addMouseListener(this);
				paneledif.add(lbl_num1);
				
				paneledif.add(btn_grandma);
				lbl_num2 = new JLabel("0");
				lbl_num2.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num2.setOpaque(true);
				lbl_num2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num2.setBackground(Color.cyan);
				lbl_num2.addMouseListener(this);
				paneledif.add(lbl_num2);
				
				paneledif.add(btn_farm);
				lbl_num3 = new JLabel("0");
				lbl_num3.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num3.setOpaque(true);
				lbl_num3.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num3.setBackground(Color.pink);
				lbl_num3.addMouseListener(this);
				paneledif.add(lbl_num3);
				
				paneledif.add(btn_mine);
				lbl_num4 = new JLabel("0");
				lbl_num4.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num4.setOpaque(true);
				lbl_num4.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num4.setBackground(Color.green);
				lbl_num4.addMouseListener(this);
				paneledif.add(lbl_num4);
				
				paneledif.add(btn_factory);
				lbl_num5 = new JLabel("0");
				lbl_num5.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num5.setOpaque(true);
				lbl_num5.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num5.setBackground(Color.orange);
				lbl_num5.addMouseListener(this);
				paneledif.add(lbl_num5);
				
				paneledif.add(btn_bank);
				lbl_num6 = new JLabel("0");
				lbl_num6.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num6.setOpaque(true);
				lbl_num6.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num6.setBackground(Color.cyan);
				lbl_num6.addMouseListener(this);
				paneledif.add(lbl_num6);
				
				paneledif.add(btn_temple);
				lbl_num7 = new JLabel("0");
				lbl_num7.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num7.setOpaque(true);
				lbl_num7.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num7.setBackground(Color.pink);
				lbl_num7.addMouseListener(this);
				paneledif.add(lbl_num7);
				
				paneledif.add(btn_wiz);
				lbl_num8 = new JLabel("0");
				lbl_num8.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num8.setOpaque(true);
				lbl_num8.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num8.setBackground(Color.green);
				lbl_num8.addMouseListener(this);
				paneledif.add(lbl_num8);
				
				paneledif.add(btn_ship);
				lbl_num9 = new JLabel("0");
				lbl_num9.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num9.setOpaque(true);
				lbl_num9.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num9.setBackground(Color.orange);
				lbl_num9.addMouseListener(this);
				paneledif.add(lbl_num9);
				
				paneledif.add(btn_arch);
				lbl_num10 = new JLabel("0");
				lbl_num10.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num10.setOpaque(true);
				lbl_num10.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num10.setBackground(Color.cyan);
				lbl_num10.addMouseListener(this);
				paneledif.add(lbl_num10);
				
				paneledif.add(btn_portal);
				lbl_num11 = new JLabel("0");
				lbl_num11.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num11.setOpaque(true);
				lbl_num11.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num11.setBackground(Color.pink);
				lbl_num11.addMouseListener(this);
				paneledif.add(lbl_num11);
				
				paneledif.add(btn_timemach);
				lbl_num12 = new JLabel("0");
				lbl_num12.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_num12.setOpaque(true);
				lbl_num12.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				lbl_num12.setBackground(Color.green);
				lbl_num12.addMouseListener(this);
				paneledif.add(lbl_num12);
				//Metemos el paneledif en un JScrollPane y este a ESTE
				este.add(new JScrollPane(paneledif), BorderLayout.CENTER);
				
//Panel reloj______________________________________________________________________________SIN TERMINAR!!!!
				JPanel rel = new JPanel();
				rel.setLayout(new GridLayout(1,6));
				rel.setBounds(0,0,300, 250);
				rel.setBorder(new BevelBorder(BevelBorder.LOWERED));

				JLabel lbHora = new JLabel("");
				Thread ct = Thread.currentThread();
				while(ct == h1) {
					calcula();
					lbHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
				
				rel.add(lbHora);
				este.add(rel,BorderLayout.SOUTH);
				
				ventanaCookie.add(este, BorderLayout.EAST);
//______VALOR ANYADIDO___________________________________________________________________________
				//Action listener del boton minijuego
				minijuego1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Minijuego();
						minijuego1.setEnabled(false);
					}
				});
//_______________________________________________________________________________________________				
				
				//Panel Oeste que engloba panelgalleta y el nick 
				JPanel oeste = new JPanel();
				oeste.setBounds(0, 0, 700, 800);
				oeste.setLayout(new BorderLayout());
				oeste.setBorder(new BevelBorder(BevelBorder.LOWERED));
				
				//Nick
				nickName = new JLabel("Nick Name: " + u.getNom_usuario());
				nickName.setFont(new Font("Agency FB",Font.PLAIN,17));
				nickName.setBackground(Color.orange);
				nickName.setOpaque(true);
				nickName.addMouseListener(this);
				
				oeste.add(nickName, BorderLayout.NORTH);
				
				//Panel Cookie (JLabel --> boton CON IMAGEN DE COOKIE)
				JPanel panelgalleta = new JPanel();
				panelgalleta.setLayout(new GridLayout(4,1));
				//panelgalleta.setBounds(0, 0, 700, 400);			//Porrque no nos tira esto?
				panelgalleta.setBorder(new BevelBorder(BevelBorder.RAISED));
				
				
				//Contador
				contador = new JLabel();
				contador.setHorizontalAlignment(SwingConstants.CENTER);
				contador.setFont(new Font("Arial",Font.PLAIN,20));
				panelgalleta.add(contador);
				seg();
				
				//Ajustar la imagen para que quede bien y no sea enorme
				ImageIcon imgIcon = new ImageIcon("src/Code/cookuie.png");
				Image imgCookie = imgIcon.getImage();
				Image imq = imgCookie.getScaledInstance(120, 120 ,Image.SCALE_SMOOTH);
				imgIcon = new ImageIcon(imq);
				JLabel cookie = new JLabel(imgIcon);
				panelgalleta.add(cookie);
				
				panelgalleta.add(new JLabel());
				//Un label que pone la version del juego
				version = new JLabel("V.2.031");
				version.setHorizontalAlignment(SwingConstants.CENTER);
				version.setFont(new Font("Agency FB",Font.ROMAN_BASELINE,21));
				version.addMouseListener(this);
				panelgalleta.add(version);
				
				//El JLabel de cookie hay que convertirlo en bot√≥n______________________________FALTA POR HACER
				cookie.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						if (numcl < 25) {
							var = var + pulsa(1);
							contador.setText(String.format("%1$.2f", var+cont));
						}
						else {
							contador.setText(String.format("%1$.2f", cont+pulsa(numcl)));
						}
						
<<<<<<< Updated upstream
=======
						//contador.setText(""+pulsa(numcl));
>>>>>>> Stashed changes
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
				oeste.add(panelgalleta, BorderLayout.CENTER);
				ventanaCookie.add(oeste, BorderLayout.WEST);
				
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
				titulo.setFont(new Font("Agency FB",Font.ROMAN_BASELINE,40));
				titulo.setHorizontalAlignment(SwingConstants.CENTER);
				panelNews.add(titulo);
				
				//JLabel QUE SE USARA PARA QUE SALGAN LAS NEWS DE UN ARRAYLIST<STRING>
				//Se separa para que asegurar de que se crea y lanzarlo despues.
				news = new JLabel(""); //Primero se crea
				Lista();			   //Luego se lanza
				news.setHorizontalAlignment(SwingConstants.CENTER);
				news.setBackground(Color.white);
				news.setOpaque(true);
				//WINDOW LISTENER
				//Esto lo hacemos para que cuando se habra el juego empiece lo de las news, habra que hacer tmb algo con la BD
				frame.addWindowListener(new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						//seg.interrupt();
						seguir = false;
						
					}
					
					@Override
					public void windowClosed(WindowEvent e) {	
						
						
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
						new VentanaOptions(frame);
						
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
				
				
				
			
				
		//___________________________________________________________________________________________________________________________
				ventanaCookie.add(centro, BorderLayout.CENTER);
				ventanaCookie.add(panelNews, BorderLayout.NORTH);
				
				//frame.setResizable(false);//Esto se hace para que no pueda cambiar el bounds de la ventana
				frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new VentanaCookie();
		
}

	public void dispose() {
		
		
	}

}

