package datos;

public class Estadisticas {
	public int cod_partida;
	public int grandmas;
	public int farms;
	public int mine;
	public int factory;
	public int bank;
	public int temple;
	public int w_tower;
	public int shipment;
	public int arch;
	public int port;
	public int timemach;
	
	
	public Estadisticas(int cod_partida, int grandmas, int farms, int mine, int factory, int bank, int temple,
			int w_tower, int shipment, int arch, int port, int timemach) {
		super();
		this.cod_partida = cod_partida;
		this.grandmas = grandmas;
		this.farms = farms;
		this.mine = mine;
		this.factory = factory;
		this.bank = bank;
		this.temple = temple;
		this.w_tower = w_tower;
		this.shipment = shipment;
		this.arch = arch;
		this.port = port;
		this.timemach = timemach;
	}
	
	//Getters y setters
	public int getCod_partida() {
		return cod_partida;
	}
	public void setCod_partida(int cod_partida) {
		this.cod_partida = cod_partida;
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
	public int getArch() {
		return arch;
	}
	public void setArch(int arch) {
		this.arch = arch;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getTimemach() {
		return timemach;
	}
	public void setTimemach(int timemach) {
		this.timemach = timemach;
	}
	
	

}
