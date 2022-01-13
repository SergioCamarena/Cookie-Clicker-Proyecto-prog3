package code;

public class Compra {
	protected NombreEdif nombre;
	protected int numEdif = 0;
	
	//constructor
	public Compra(NombreEdif nombre, int numeroDeCadaTipo) {
		super();
		this.nombre = nombre;
		this.numEdif = numEdif;
	}
	//getters y setters

	public NombreEdif getNombre() {
		return nombre;
	}
	public void setNombre(NombreEdif nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeCadaTipo() {
		return numEdif;
	}
	public void setNumeroDeCadaTipo(int numEdif) {
		this.numEdif = numEdif;
	}	
	
	//to string
	
	@Override
	public String toString() {
		return "Compra [nombre=" + nombre +  ", numero de edificios="+ numEdif + "]";
}
}
