package datos;

import java.util.ArrayList;

public class Partida {
	public int cod_partida;
	public String nom_usuario;
	public int cookie_tot;
	public int cookie_ps;
	public int edif_tot;
	public int tiempo_tot;
	
	public Partida(int cod_partida, String nom_usuario, int cookie_tot, int cookie_ps, int edif_tot, int tiempo_tot) {
		super();
		if(nom_usuario == null){
			throw new NullPointerException("Nombre de usuario es nulo");
		}
		this.cod_partida = cod_partida;
		this.nom_usuario = nom_usuario;
		this.cookie_tot = cookie_tot;
		this.cookie_ps = cookie_ps;
		this.edif_tot = edif_tot;
		this.tiempo_tot = tiempo_tot;
	}
	//Getters y setters
	public int getCod_partida() {
		return cod_partida;
	}
	public void setCod_partida(int cod_partida) {
		this.cod_partida = cod_partida;
	}
	public int getCookie_tot() {
		return cookie_tot;
	}
	public String getNom_usuario() {
		return nom_usuario;
	}
	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}
	public void setCookie_tot(int cookie_tot) {
		this.cookie_tot = cookie_tot;
	}
	public int getCookie_ps() {
		return cookie_ps;
	}
	public void setCookie_ps(int cookie_ps) {
		this.cookie_ps = cookie_ps;
	}
	public int getEdif_tot() {
		return edif_tot;
	}
	public void setEdif_tot(int edif_tot) {
		this.edif_tot = edif_tot;
	}
	public int getTiempo_tot() {
		return tiempo_tot;
	}
	public void setTiempo_tot(int tiempo_tot) {
		this.tiempo_tot = tiempo_tot;
	}
	
	
	
	//Metodo para ver el jugador con mas edificios
	public int maxEdif(ArrayList<Partida>partida){
		ArrayList<Partida>partidas = new ArrayList<Partida>();
		int max = 0;
		for (int i = 0; i < partidas.size(); i++) {
//			if(partidas.getEdif_tot(i) > max) {
//				max = partidas.getEdif_tot(i);
//			}
		}
		return max;
	}
}
