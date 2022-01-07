package code;

public class Mejoras extends Compra{
	private String tipoMejora;
	private double sumaPorcentaje;
	
	//constructor
	public Mejoras(NombreEdif nombre, int valorInicialCookie, int numeroDeCadaTipo, String tipoMejora,
			double sumaPorcentaje) {
		super(nombre, valorInicialCookie, numeroDeCadaTipo);
		this.tipoMejora = tipoMejora;
		this.sumaPorcentaje = sumaPorcentaje;
	}

	//getters y setters
	public String getTipoMejora() {
		return tipoMejora;
	}

	public void setTipoMejora(String tipoMejora) {
		this.tipoMejora = tipoMejora;
	}

	public double getSumaPorcentaje() {
		return sumaPorcentaje;
	}

	public void setSumaPorcentaje(double sumaPorcentaje) {
		this.sumaPorcentaje = sumaPorcentaje;
	}

	// to string
	@Override
	public String toString() {
		return "Mejoras [tipoMejora=" + tipoMejora + ", sumaPorcentaje=" + sumaPorcentaje + "]";
	}

}
