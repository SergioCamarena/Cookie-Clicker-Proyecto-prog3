package code;

public class Cursores extends Compra{
	private double procentaje;
	
	//constructores
		public Cursores(NombreEdif nombre, int valorInicialCookie, int numeroDeCadaTipo, double procentaje) {
			super(nombre, valorInicialCookie, numeroDeCadaTipo);
			this.procentaje = procentaje;
		}
		
		//getters y setters
		public double getProcentaje() {
			return procentaje;
		}

		public void setProcentaje(double procentaje) {
			this.procentaje = procentaje;
		}
		
		//to string
		@Override
		public String toString() {
			return "Cursores [procentaje=" + procentaje + "]";
		}

}
