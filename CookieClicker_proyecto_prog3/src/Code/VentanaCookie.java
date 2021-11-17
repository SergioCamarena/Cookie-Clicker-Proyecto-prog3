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
import java.awt.event.WindowAdapter;
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
	static Thread corre;
	static boolean seguir = true;
	
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
	
	//Hay 155
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
	listanews.add("News:  incredibly rare albino wrinkler on the brink of extinction poached by cookie-crazed pastry magnate!");
	listanews.add("News:  local cookie manufacturer becomes luckiest being alive!");
	listanews.add("News:  seasons are all out of whack! \"We need to get some whack back into them seasons\", says local resident.");
	listanews.add("News:  faint meowing heard around local cookie facilities; suggests new ingredient being tested.");
	listanews.add("News:  crowds of meowing kittens with little hard hats reported near local cookie facilities.");
	listanews.add("News:  locals report troupe of bossy kittens meowing adorable orders at passersby.");
	listanews.add("News:  local office cubicles invaded with armies of stern-looking kittens asking employees \"what");
	listanews.add("News:  new kitten college opening next week, offers courses on cookie-making and catnip studies.");
	listanews.add("News:  unemployment rates soaring as woefully adorable little cats nab jobs on all levels of expertise, says study.");
	listanews.add("News:  \"In the future, your job will most likely be done by a cat\", predicts suspiciously furry futurologist.");
	listanews.add("News:  strange kittens with peculiar opinions on martial arts spotted loitering on local beet farms!");
	listanews.add("News:  are your spending habits sensible? For a hefty fee, these analysts will tell you!");
	listanews.add("News:  kittens break glass ceiling! Do they have any idea how expensive those are!");
	listanews.add("News:  local kittens involved in misguided musical production, leave audience perturbed and unnerved.");
	listanews.add("News:  major sugar-smuggling ring dismantled by authorities; ");
	listanews.add("News:  authorities warn tourists not to buy bootleg sugar lumps from street peddlers - \"You think you");
	listanews.add("News:  pro-diabetes movement protests against sugar-shaming. \"I");
	listanews.add("News:  experts in bitter disagreement over whether sugar consumption turns children sluggish or hyperactive.");
	listanews.add("News:  fishermen deplore upturn in fish tooth decay as sugar lumps-hauling cargo sinks into the ocean.");
	listanews.add("News:  rare black sugar lump that captivated millions in unprecedented auction revealed to be common toxic fungus.");
	listanews.add("News:  \"Back in my day, sugar lumps were these little cubes you");
	listanews.add("News:  sugar lump-snacking fad sweeps the nation; dentists everywhere rejoice.");
	listanews.add("News:  broccoli tops for moms, last for kids; dads indifferent.");
	listanews.add("News:  middle age a hoax, declares study; turns out to be bad posture after all.");
	listanews.add("News:  kitties want answers in possible Kitty Kibble shortage.");
	listanews.add("News:  scientist predicts imminent cookie-related \"end of the world\"; becomes joke among peers.");
	listanews.add("News:  man robs bank, buys cookies.");
	listanews.add("News:  scientists establish that the deal with airline food is, in fact, a critical lack of cookies.");
	listanews.add("News:  overgrown cookies found in fishing nets, raise questions about hormone baking.");
	listanews.add("News:  \"all-you-can-eat\" cookie restaurant opens in big city; waiters trampled in minutes.");
	listanews.add("News:  man dies in cookie-eating contest; \"a less-than-impressive performance\", says judge.");
	listanews.add("News:  what makes cookies taste so right? \"Probably all the [*****] they put in them\", says anonymous tipper.");
	listanews.add("News:  man found allergic to cookies; \"what a weirdo\", says family.");
	listanews.add("News:  foreign politician involved in cookie-smuggling scandal.");
	listanews.add("News:  cookies now more popular than ");
	listanews.add("News:  obesity epidemic strikes nation; experts blame ");
	listanews.add("News:  \"you gotta admit, all this cookie stuff is a bit ominous\", says confused idiot.");
	listanews.add("News:  \"so I guess that");
	listanews.add("News:  movie cancelled from lack of actors; \"everybody");
	listanews.add("News:  comedian forced to cancel cookie routine due to unrelated indigestion.");
	listanews.add("News:  new cookie-based religion sweeps the nation.");
	listanews.add("News:  mysterious illegal cookies seized; \"tastes terrible\", says police.");
	listanews.add("News:  man found dead after ingesting cookie; investigators favor \"mafia snitch\" hypothesis.");
	listanews.add("News:  \"the universe pretty much loops on itself,\" suggests researcher; \"it");
	listanews.add("News:  \"Ook\", says interviewed orangutan.");
	listanews.add("News:  cookies could be the key to ");
	listanews.add("News:  flavor text ");
	listanews.add("News:  new popularity survey says ");
	listanews.add("News:  major city being renamed ");
	listanews.add("News:  \"memes from last year somehow still relevant\", deplore experts.");
	listanews.add("News:  pun in headline infuriates town, causes riot. 21 wounded, 5 dead; mayor still missing.");
	listanews.add("News:  irate radio host rambles about pixelated icons. \"None of the cookies are aligned! Can");
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
						System.out.println(i);
						news.setText(listanews.get(i));
						
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
						else if((i>=100) & (i<125)){
							news.setBackground(Color.orange);
						}
						else if ((i>=125) & (i<150)) {
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
		
		
	

	
	public VentanaCookie(){
		
		
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
				ventanaCookie.addWindowListener(new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						seguir = false;
						corre.interrupt();
					}
					
					@Override
					public void windowClosed(WindowEvent e) {
						//Thread.interrupt();
						
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
