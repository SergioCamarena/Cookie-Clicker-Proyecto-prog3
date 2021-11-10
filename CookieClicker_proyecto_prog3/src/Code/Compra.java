package Code;

public class Compra {
	protected String nombre;
	protected double valorInicialCookie= 0.0;
	protected int numeroDeCadaTipo = 0;
	
	//constructor
	public Compra(String nombre, double valorInicialCookie, int numeroDeCadaTipo) {
		super();
		this.nombre = nombre;
		this.valorInicialCookie = valorInicialCookie;
		this.numeroDeCadaTipo = numeroDeCadaTipo;
	}
	//getters y setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorInicialCookie() {
		return valorInicialCookie;
	}
	public void setValorInicialCookie(double valorInicialCookie) {
		this.valorInicialCookie = valorInicialCookie;
	}

	public int getNumeroDeCadaTipo() {
		return numeroDeCadaTipo;
	}
	public void setNumeroDeCadaTipo(int numeroDeCadaTipo) {
		this.numeroDeCadaTipo = numeroDeCadaTipo;
	}
	
	
	
}
