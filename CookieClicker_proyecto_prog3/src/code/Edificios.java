package code;

public class Edificios extends Compra{
	
	private double valorCompra;

	public Edificios(NombreEdif nombre, int numeroDeCadaTipo, double valorCompra) {
		super(nombre, numeroDeCadaTipo);
		this.valorCompra = valorCompra;
	}

	/**
	 * @return the valorCompra
	 */
	public double getValorCompra() {
		return valorCompra;
	}

	/**
	 * @param valorCompra the valorCompra to set
	 */
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public String toString() {
		return "Edificios [valorCompra=" + valorCompra + "]";
	}

	
	
	
}

	

	
	


