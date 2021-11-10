package Code;

public class Edificios extends Compra{

	private int NumEdificios;
	private double valorCompra;
	
	//constructor
	public Edificio(String nombre, double valorInicialCookie, int numeroDeCadaTipo, int numEdificios, double valorCompra) {
		super(nombre, valorInicialCookie, numeroDeCadaTipo);
		NumEdificios = numEdificios;
		this.valorCompra = valorCompra;
	}


	//getters y setters
	public int getNumEdificios() {
		return NumEdificios;
	}


	public void setNumEdificios(int numEdificios) {
		NumEdificios = numEdificios;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	//metodo que suma el porcentaje de compra
	public void nuevoEdif() {
		valorCompra = valorCompra * 0.15;
	}

	// to string
	@Override
	public String toString() {
		return "Edificio [NumEdificios=" + NumEdificios + ", valorCompra=" + valorCompra + "]";
	}

}
