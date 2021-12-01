package code;

public class TipoEdif extends Edificios{
	private double costeEdif;
	private NombreEdif nombreEdif;
	
	public enum NombreEdif {
		CURSOR, GRANDMA, MINE, FACTORY, BANK;

	}

	
	//constructor	
	public TipoEdif(String nombre, double valorInicialCookie, int numeroDeCadaTipo, int numEdificios,
			double valorCompra, NombreEdif nombreEdif, double costeEdif) {
		super(nombre, valorInicialCookie, numeroDeCadaTipo, numEdificios, valorCompra);
		this.costeEdif = costeEdif;
	}
	
	//getters y setters
	public NombreEdif getNombreEdif() {
		return nombreEdif;
	}

	public void setNombreEdif(NombreEdif nombreEdif) {
		this.nombreEdif = nombreEdif;
	}

	public double getCosteEdif() {
		return costeEdif;
	}

	public void setCosteEdif(double costeEdif) {
		this.costeEdif = costeEdif;
	}


	// TO STRING
	@Override
	public String toString() {
		return "tipoEdif [nombreEdif=" + nombreEdif + ", costeEdif=" + costeEdif + "]";
	}

}
