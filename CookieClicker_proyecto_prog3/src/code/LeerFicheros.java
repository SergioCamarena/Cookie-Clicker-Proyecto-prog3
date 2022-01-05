package code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import datos.Partida;

public class LeerFicheros {
	//Metodo para que pueda leer el fichero csv
	public static ArrayList<Partida> cargartxt(){
		String fichero = "C:\\Users\\Usuario\\Documents\\GitHub\\Cookie-Clicker-Proyecto-prog3\\CookieClicker_proyecto_prog3\\src\\Ranking.csv";
		ArrayList<Partida>partidas = new ArrayList<Partida>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea = br.readLine();
			
			int cod_partida;
			String nom_usuario;
			int cookie_tot;
			int cookie_ps;
			int edif_tot;
			int tiempo_tot;
			
			while(linea != null) {
				cod_partida = Integer.parseInt(linea.split(",")[0]);
				nom_usuario = linea.split(",")[1];
				cookie_tot = Integer.parseInt(linea.split(",")[2]);
				cookie_ps = Integer.parseInt(linea.split(",")[3]);
				edif_tot = Integer.parseInt(linea.split(",")[4]);
				tiempo_tot = Integer.parseInt(linea.split(",")[5]);
				Partida p = new Partida(cod_partida, nom_usuario, cookie_tot, cookie_ps, edif_tot, tiempo_tot);
				partidas.add(p);
				
				linea = br.readLine();
			}
		}catch (FileNotFoundException e){
			System.out.println("No se encontro el fichero");
			e .printStackTrace();
			
		}catch(IOException e) {
			System.out.println("El fichero esta vacio");
			e.printStackTrace();
		}
		
		return partidas;
	}
	
	public static void main(String[] args) {
		cargartxt();
	}
	

}
