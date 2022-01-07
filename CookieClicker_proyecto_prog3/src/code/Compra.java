package code;

public class Compra {
	protected NombreEdif nombre;
	protected double valorInicialCookie= 0.0;
	protected int numeroDeCadaTipo = 0;
	
	//constructor
	public Compra(NombreEdif nombre, double valorInicialCookie, int numeroDeCadaTipo) {
		super();
		this.nombre = nombre;
		this.valorInicialCookie = valorInicialCookie;
		this.numeroDeCadaTipo = numeroDeCadaTipo;
	}
	//getters y setters

	public NombreEdif getNombre() {
		return nombre;
	}
	public void setNombre(NombreEdif nombre) {
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
	
	//to string
	
	@Override
	public String toString() {
		return "Compra [nombre=" + nombre + ", valorInicialCookie=" + valorInicialCookie + ", numeroDeCadaTipo="
			+ numeroDeCadaTipo + "]";
}
}
