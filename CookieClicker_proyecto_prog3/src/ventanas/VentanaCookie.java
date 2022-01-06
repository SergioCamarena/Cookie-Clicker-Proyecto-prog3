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
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
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


import code.Minijuego;
import datos.Usuario;

public class VentanaCookie implements MouseListener {
	//Estos de aqui abajo sirven para llevar la cuenta de cuantas imagenes hay en el panel centro
	public static int contgr= -1, contfrm= -1,contmine= -1,contfac= -1,contban= -1,conttem= -1,contwiz= -1,contship = -1;	
	static JButton minijuego1 = new JButton("MiniJuego");
	static JLabel news, contador;
	static Thread corre, seg;
	static boolean seguir = true;
	static int t = 0;
	static JLabel num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,version, nickName;
	static int numcl=0,numgr=0,numfrm=0,numine=0,numfac=0,numban=0,numtem=0,numwiz =0,numship = 0;
	static JRadioButton comprar,vender;
	static double valor = 0.15;
	Usuario u = new Usuario();

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
					//cont = cont + pulsa(numcl)+pulsa(numgr)+pulsa(numfrm)+pulsa(numine)+pulsa(numfac)+pulsa(numban)+pulsa(numtem)+pulsa(numwiz)+pulsa(numship);
					//contador.setText(""+cont);
					
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
						
						//Para que el Boton MiniJuego se vaya activando cuando esten entre esos varemos
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
								minijuego1.setEnabled(false);//Si no es ninguno de esos valores de arriba que esté apagado
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
	num1.setToolTipText("<html>CLICKER<br> Tenemos ahora mismo "+ numcl +" de clickers.<br> Cookies totales ___ <br></html>");
	num1.getToolTipText();
	num2.setToolTipText("<html>GRANDMAS<br> Tenemos ahora mismo "+ numgr +" de grandmas.<br> Cookies totales ___ <br></html>");
	num2.getToolTipText();
	num3.setToolTipText("<html>FARMS<br> Tenemos ahora mismo "+ numfrm +" de farms.<br> Cookies totales ___ <br></html>");
	num3.getToolTipText();
	num4.setToolTipText("<html>MINE<br> Tenemos ahora mismo "+ numine +" de mines.<br> Cookies totales ___ <br></html>");
	num4.getToolTipText();
	num5.setToolTipText("<html>FACTORY<br> Tenemos ahora mismo "+ numfac +" de factories.<br> Cookies totales ___ <br></html>");
	num5.getToolTipText();
	num6.setToolTipText("<html>BANK<br> Tenemos ahora mismo "+ numban +" de banks.<br> Cookies totales ___ <br></html>");
	num6.getToolTipText();
	num7.setToolTipText("<html>TEMPLE<br> Tenemos ahora mismo "+ numtem +" de temples.<br> Cookies totales ___ <br></html>");
	num7.getToolTipText();
	num8.setToolTipText("<html>WIZZARD TOWER<br> Tenemos ahora mismo "+ numwiz +" de wizzard towers.<br> Cookies totales ___ <br></html>");
	num8.getToolTipText();
	num9.setToolTipText("<html>SHIPMENT<br> Tenemos ahora mismo "+ numship +" de shipments.<br> Cookies totales ___ <br></html>");
	num9.getToolTipText();
	num10.setToolTipText("<html>ARCHEMY LAB<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	num10.getToolTipText();
	num11.setToolTipText("<html>PORTAL<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	num11.getToolTipText();
	num12.setToolTipText("<html>TIME MACHINE<br> Tenemos ahora mismo "+ 0 +" de shipments.<br> Cookies totales ___ <br></html>");
	num12.getToolTipText();
	
	//version
	version.setToolTipText("<html><b>VERSION</b><br> Somos <b>Elaia, Sergio e Imanol.</b><br> Y te invitamos a que <b>disfrutes</b> de nustro juego <br></html>");
	version.getToolTipText();
	
	}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
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
				
	//Paneles del CENTRO (Estos tendr�n un metodo que hace que cada vez que se pulsa un boton se crea un label de cada)
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
				
					JPanel grand1 = new JPanel();
					grand1.setBackground(Color.cyan);
					grand1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					for (int i = 0; i < 8; i++) {
						Image imagen=new ImageIcon("src/ventanas/grandma2.png").getImage();
						JLabel lbl_imagen1=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
						lbl_imagen1.setVisible(false);
						grand1.add(lbl_imagen1);
					}
					JLabel lbl_grandma=new JLabel("");
					grand1.add(lbl_grandma);
					centrocent.add(grand1);
					
					//Panel del centro farm
					JPanel farm1 = new JPanel();
					farm1.setBackground(Color.pink);
					farm1.setBorder(new LineBorder(Color.BLACK));
					//Se crean 7 imagenes y se ponen visible false para que no salgan y cuando pulsemos true
					for (int i = 0; i < 8; i++) {
						Image imagen=new ImageIcon("src/ventanas/farm.png").getImage();
						JLabel lbl_imagen2=new JLabel(new ImageIcon(imagen.getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
						lbl_imagen2.setVisible(false);
						farm1.add(lbl_imagen2);
					}
					JLabel lbl_farm=new JLabel("");
					farm1.add(lbl_farm);
					centrocent.add(farm1);
					
					//Panel del centro mine
					JPanel mine1 = new JPanel();
					mine1.setBackground(Color.green);
					mine1.setBorder(new LineBorder(Color.BLACK));
					
					centrocent.add(mine1);
					
					//Panel del centro factory
					JPanel factory1 = new JPanel();
					factory1.setBackground(Color.orange);
					factory1.setBorder(new LineBorder(Color.BLACK));
					centrocent.add(factory1);
					
					JPanel bank1 = new JPanel();
					bank1.setBackground(Color.cyan);
					bank1.setBorder(new LineBorder(Color.BLACK));
					
					
					centrocent.add(bank1);
					
					JPanel temple1 = new JPanel();
					temple1.setBackground(Color.pink);
					temple1.setBorder(new LineBorder(Color.BLACK));
					
					centrocent.add(temple1);
					
					JPanel wt1 = new JPanel();
					wt1.setBackground(Color.green);
					wt1.setBorder(new LineBorder(Color.BLACK));
					
					centrocent.add(wt1);
					
					JPanel ship1 = new JPanel();
					ship1.setBackground(Color.orange);
					ship1.setBorder(new LineBorder(Color.BLACK));
					
					centrocent.add(ship1);
					
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
				//_________________________________________EDIFICIOS & CLICKER
				JButton clicker = new JButton("CLICKER");//Creamos los botones de la derecha
				JButton grandma = new JButton("GRANDMAS");
				JButton farm = new JButton("FARMS");
				JButton mine = new JButton("MINE");
				JButton factory =new JButton("FACTORY");
				JButton bank  = new JButton("BANK");
				JButton temple  = new JButton("TEMPLE");
				JButton wiz  = new JButton("WIZZARD TOWER");
				JButton ship  = new JButton("SHIPMENT");
				JButton arch  = new JButton("ARCHEMY LAB");
				JButton port  = new JButton("PORTAL");
				JButton timemach  = new JButton("TIME MACHINE");
				
				

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
				
						clicker.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numcl = numcl+1;
									num1.setText(""+numcl);
								}
								else {
									if(numcl > 0) {
										numcl = numcl-1;
										num1.setText(""+numcl);
									}
									else {
										numcl = 0;
										}
								}
								}
							
							
						});
						grandma.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								//
								contgr++;
								if(contgr<7) {
									grand1.getComponent(contgr).setVisible(true);
								}
								else {
									grand1.getComponent(8).setVisible(true);
									lbl_grandma.setText("+"+ (contgr-6));
									
								}
								
								if(comprar.isSelected()) {
									numgr = numgr+1;
									num2.setText(""+numgr);
								}
								else {
									if(numgr > 0) {
										numgr = numgr-1;
										num2.setText(""+numgr);
									}
									else {
										numgr = 0;
										}
									
									
								}
								
								
								
								
							}
						});
						farm.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								contfrm++;
								if(contfrm<7) {
									farm1.getComponent(contfrm).setVisible(true);
								}
								else {
									farm1.getComponent(8).setVisible(true);
									lbl_farm.setText("+"+ (contfrm-6));
									
								}
								if(comprar.isSelected()) {
									numfrm = numfrm+1;
									num3.setText(""+numfrm);
								}
								else {
									if(numgr > 0) {
										numfrm = numfrm-1;
										num3.setText(""+numfrm);
									}
									else {
										numfrm = 0;
										}
									
								}
							}
						});
						mine.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numine = numine+1;
									num4.setText(""+numine);
								}
								else {
									if(numgr > 0) {
										numine = numine-1;
										num4.setText(""+numine);
									}
									else {
										numine = 0;
										}
									
								}
								
								
								
							}
						});
						factory.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numfac = numfac+1;
									num5.setText(""+numfac);
								}
								else {
									if(numgr > 0) {
										numfac = numfac-1;
										num5.setText(""+numfac);
									}
									else {
										numfac = 0;
										}
									
								}
								
								
							}
						});
						bank.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numban = numban+1;
									num6.setText(""+numban);
								}
								else {
									if(numgr > 0) {
										numban = numban-1;
										num6.setText(""+numban);
									}
									else {
										numban = 0;
										}
									
								}
								
								
								
							}
						});
						temple.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numtem = numtem+1;
									num7.setText(""+numtem);
								}
								else {
									if(numgr > 0) {
										numtem = numtem-1;
										num7.setText(""+numtem);
									}
									else {
										numtem = 0;
										}
									
								}
								
								
							}
						});
						wiz.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numwiz = numwiz+1;
									num8.setText(""+numwiz);
								}
								else {
									if(numgr > 0) {
										numwiz = numwiz-1;
										num8.setText(""+numwiz);
									}
									else {
										numwiz = 0;
										}
									
								}
								
								
								
							}
						});
						ship.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								if(comprar.isSelected()) {
									numship = numship+1;
									num9.setText(""+numship);
									
								}
								else {
									if(numgr > 0) {
										numship = numship-1;
										num9.setText(""+numship);
										
									}
									else {
										numship = 0;
										}
									
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
				
				
				paneledif.add(clicker);
				num1 = new JLabel(""+numcl);
				num1.setHorizontalAlignment(SwingConstants.CENTER);
				num1.setOpaque(true);
				num1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num1.setBackground(Color.orange);
				num1.addMouseListener(this);
				paneledif.add(num1);
				
				paneledif.add(grandma);
				num2 = new JLabel("0");
				num2.setHorizontalAlignment(SwingConstants.CENTER);
				num2.setOpaque(true);
				num2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num2.setBackground(Color.cyan);
				num2.addMouseListener(this);
				paneledif.add(num2);
				
				paneledif.add(farm);
				num3 = new JLabel("0");
				num3.setHorizontalAlignment(SwingConstants.CENTER);
				num3.setOpaque(true);
				num3.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num3.setBackground(Color.pink);
				num3.addMouseListener(this);
				paneledif.add(num3);
				
				paneledif.add(mine);
				num4 = new JLabel("0");
				num4.setHorizontalAlignment(SwingConstants.CENTER);
				num4.setOpaque(true);
				num4.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num4.setBackground(Color.green);
				num4.addMouseListener(this);
				paneledif.add(num4);
				
				paneledif.add(factory);
				num5 = new JLabel("0");
				num5.setHorizontalAlignment(SwingConstants.CENTER);
				num5.setOpaque(true);
				num5.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num5.setBackground(Color.orange);
				num5.addMouseListener(this);
				paneledif.add(num5);
				
				paneledif.add(bank);
				num6 = new JLabel("0");
				num6.setHorizontalAlignment(SwingConstants.CENTER);
				num6.setOpaque(true);
				num6.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num6.setBackground(Color.cyan);
				num6.addMouseListener(this);
				paneledif.add(num6);
				
				paneledif.add(temple);
				num7 = new JLabel("0");
				num7.setHorizontalAlignment(SwingConstants.CENTER);
				num7.setOpaque(true);
				num7.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num7.setBackground(Color.pink);
				num7.addMouseListener(this);
				paneledif.add(num7);
				
				paneledif.add(wiz);
				num8 = new JLabel("0");
				num8.setHorizontalAlignment(SwingConstants.CENTER);
				num8.setOpaque(true);
				num8.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num8.setBackground(Color.green);
				num8.addMouseListener(this);
				paneledif.add(num8);
				
				paneledif.add(ship);
				num9 = new JLabel("0");
				num9.setHorizontalAlignment(SwingConstants.CENTER);
				num9.setOpaque(true);
				num9.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num9.setBackground(Color.orange);
				num9.addMouseListener(this);
				paneledif.add(num9);
				
				paneledif.add(arch);
				num10 = new JLabel("0");
				num10.setHorizontalAlignment(SwingConstants.CENTER);
				num10.setOpaque(true);
				num10.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num10.setBackground(Color.cyan);
				num10.addMouseListener(this);
				paneledif.add(num10);
				
				paneledif.add(port);
				num11 = new JLabel("0");
				num11.setHorizontalAlignment(SwingConstants.CENTER);
				num11.setOpaque(true);
				num11.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num11.setBackground(Color.pink);
				num11.addMouseListener(this);
				paneledif.add(num11);
				
				paneledif.add(timemach);
				num12 = new JLabel("0");
				num12.setHorizontalAlignment(SwingConstants.CENTER);
				num12.setOpaque(true);
				num12.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
				num12.setBackground(Color.green);
				num12.addMouseListener(this);
				paneledif.add(num12);
				//Metemos el paneledif en un JScrollPane y este a ESTE
				este.add(new JScrollPane(paneledif), BorderLayout.CENTER);
				
				//Panel reloj
				JPanel rel = new JPanel();
				rel.setLayout(new GridLayout(1,6));
				rel.setBounds(0,0,300, 250);
				rel.setBorder(new BevelBorder(BevelBorder.LOWERED));
				
				
				JLabel dias = new JLabel("0");
				dias.setHorizontalAlignment(SwingConstants.CENTER);// Estos son para que los numeros estén centrados en sus labels
				JLabel horas = new JLabel("");
				horas.setHorizontalAlignment(SwingConstants.CENTER);
				JLabel minutos = new JLabel("");
				minutos.setHorizontalAlignment(SwingConstants.CENTER);
				JLabel seg = new JLabel("");
				seg.setHorizontalAlignment(SwingConstants.CENTER);
				
				rel.add(dias);
				rel.add(new JLabel(","));
				rel.add(horas);
				rel.add(new JLabel(":"));
				rel.add(minutos);
				rel.add(new JLabel(":"));
				rel.add(seg);
				
				este.add(rel,BorderLayout.SOUTH);
				
				ventanaCookie.add(este, BorderLayout.EAST);
			//______VALOR ANYADIDO_______________________________________
				//Action listener del boton minijuego
				minijuego1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new Minijuego();
						minijuego1.setEnabled(false);
					}
				});
				
				
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
				//contador = new JLabel(pulsa2(1.0));
				//contador.setFont(new Font("Arial",Font.PLAIN,20));
				//panelgalleta.add(contador);
				
				
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
				
				//El JLabel de cookie hay que convertirlo en botón______________________________FALTA POR HACER
				cookie.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						//contador.setText(pulsa2(1.00));
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
						seguir = false;
						corre.interrupt();
						//(seg).interrupt();
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

