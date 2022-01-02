package code;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Metodos {
	static double valor = 0.15;
	static Thread corre, seg;
	public static double cont = 1;
	static boolean seguir = true;
	static JLabel news, contador;
	static int t = 0;
	static int numcl=0,numgr=0,numfrm=0,numine=0,numfac=0,numban=0,numtem=0,numwiz =0,numship = 0;
	static JButton minijuego1 = new JButton("MiniJuego");
	//ESTA CLASE CONTIENE TODOS LOS METODOS
	
	//SIRVE PARA NO LIARLA TANTO CON LA VENTANA COOKIE
	
	//Metodo cookies_por seg.
		public double  pulsa(double numero) {
			numero = (double) (numero*valor);
			
			return numero;
		}
		//Lo unico que hace esto es pasarlo a string
		public String pulsa2(double numero) {
			double value = pulsa(numero);
			
			return ""+value;
		}
		public String seg() {
			seg = new Thread(new Runnable() {
				
				public void run() {
					while(seguir) {
						cont = cont + pulsa(numcl)+pulsa(numgr)+pulsa(numfrm)+pulsa(numine)+pulsa(numfac)+pulsa(numban)+pulsa(numtem)+pulsa(numwiz)+pulsa(numship);
						contador.setText(""+cont);
						
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

}
