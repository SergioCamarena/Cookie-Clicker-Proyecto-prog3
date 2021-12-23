package datos;

public class Partida {
	public int cod_partida;
	public String nom_usuario;
	public int cookie_tot;
	public int cookie_ps;
	public int edif_tot;
	public int tiempo_tot;
	public int grandmas;
	public int farms;
	public int mine;
	public int factory;
	public int bank;
	public int temple;
	public int w_tower;
	public int shipment;
	
	
	

	
	public Partida(int cod_partida, String nom_usuario, int cookie_tot, int cookie_ps, int edif_tot, int tiempo_tot,
			int grandmas, int farms, int mine, int factory, int bank, int temple, int w_tower, int shipment) {
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
		this.grandmas = grandmas;
		this.farms = farms;
		this.mine = mine;
		this.factory = factory;
		this.bank = bank;
		this.temple = temple;
		this.w_tower = w_tower;
		this.shipment = shipment;
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
	public int getGrandmas() {
		return grandmas;
	}
	public void setGrandmas(int grandmas) {
		this.grandmas = grandmas;
	}
	public int getFarms() {
		return farms;
	}
	public void setFarms(int farms) {
		this.farms = farms;
	}
	public int getMine() {
		return mine;
	}
	public void setMine(int mine) {
		this.mine = mine;
	}
	public int getFactory() {
		return factory;
	}
	public void setFactory(int factory) {
		this.factory = factory;
	}
	public int getBank() {
		return bank;
	}
	public void setBank(int bank) {
		this.bank = bank;
	}
	public int getTemple() {
		return temple;
	}
	public void setTemple(int temple) {
		this.temple = temple;
	}
	public int getW_tower() {
		return w_tower;
	}
	public void setW_tower(int w_tower) {
		this.w_tower = w_tower;
	}
	public int getShipment() {
		return shipment;
	}
	public void setShipment(int shipment) {
		this.shipment = shipment;
	}
	
	

}
