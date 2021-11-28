package Datos;

/**
 * Esta clase representa a un usuario ya existente dentro del juego.
 *
 */
public class Usuario {
	public String nom_usuario = "Sergi";
	protected String contrasenya; 
	
	public String getNom_usuario() {
		return nom_usuario;
	}
	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	// Con este constructor se crea un usuario con la contrasenya y el usuario que se indique.
	public Usuario(String nom_usuario, String contrasenya) {
		super();
		if(nom_usuario == null){
			throw new NullPointerException("Nombre de usuario es nulo");
		}
		if(contrasenya == null){
			throw new NullPointerException("Tener una contraseña es obligatorio");
		}
		this.nom_usuario = nom_usuario;
		this.contrasenya = contrasenya;
	}
	public Usuario() {
		
	}
	public static void main(String[] args) {
		Usuario u = new Usuario();
		
	}
	

}
