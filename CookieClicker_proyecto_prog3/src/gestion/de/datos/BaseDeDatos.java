package gestion.de.datos;

import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import datos.Estadisticas;
import datos.Partida;
import datos.Usuario;

/**
 * Esta clase centraliza el acceso a la base de datos
 *
 */
public class BaseDeDatos {
	
	private static Connection conexion; // conexión con la base de datos
	
	/**
	 * Construye un objeto para gestionar la base de datos
	 * @throws DBException esta excepción se lanza si se produce algún error durante la construcción del objeto
	 */
	public BaseDeDatos() throws DBException {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DBException("No se pudo cargar el driver de la base de datos", e);
		}
	}
	
	/**
	 * Establece una conexión con la base de datos
	 * @throws DBException esta excepción se lanza si se produce algún error durante la construcción del objeto
	 */
	public static void open() throws DBException {
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:CookieClicker.db");
		} catch (SQLException e) {
			throw new DBException("No se pudo conectar de la base de datos cookies", e);
		}
	}
	
	/**
	 * Cierra la conexión con la base de datos. La conexión debe estar abierta.
	 * @throws DBException esta excepción se lanza si se produce algún error durante la construcción del objeto
	 */
	public static void close() throws DBException {
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudo desconectar correctamente de la base de datos", e);
		}
	}
	/** Lee los usuarios de la conexión de base de datos abierta para la tabla de estadísticas
	 * @return	Lista completa de usuarios, null si hay algún error
	 */
	public static ArrayList<Partida> getPartidas() {
		try (Statement statement = conexion.createStatement()) {
			ArrayList<Partida> partidas = new ArrayList<>();
			String sent = "select * from Partida;";
			System.out.println( sent );
			ResultSet rs = statement.executeQuery( sent );
			while( rs.next() ) { // Leer el resultset
				int cod_partida = rs.getInt("cod_partida");
				String nom_usuario = rs.getString("nom_usuario");
				int cookie_tot = rs.getInt("cookie_tot");
				int cookie_ps = rs.getInt("cookie_ps");
				int edif_tot = rs.getInt("edif_tot");
				int tiempo_tot = rs.getInt("tiempo_tot");
				partidas.add( new Partida ( cod_partida, nom_usuario, cookie_tot, cookie_ps, edif_tot, tiempo_tot ) );
			}
			return partidas;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ArrayList<Estadisticas> getEstadisticas() {
		try (Statement statement = conexion.createStatement()) {
			ArrayList<Estadisticas> estadisticas = new ArrayList<>();
			String sent = "select cod_partida, nom_usuario, cookie_tot, cookie_ps, edif_tot, tiempo_tot from Partida;";
			System.out.println( sent );
			ResultSet rs = statement.executeQuery( sent );
			while( rs.next() ) { // Leer el resultset
				int cod_partida = rs.getInt("cod_partida");
				int grandmas = rs.getInt("grandmas");
				int farms = rs.getInt("farms");
				int mine = rs.getInt("mine");
				int factory = rs.getInt("factory");
				int bank = rs.getInt("bank");
				int temple = rs.getInt("temple");
				int w_tower = rs.getInt("w_tower");
				int shipment = rs.getInt("shipment");
				int arch = rs.getInt("arch");
				int port = rs.getInt("port");
				int timemach = rs.getInt("timemach");
				estadisticas.add( new Estadisticas ( cod_partida, grandmas, farms, mine, factory, bank, temple, w_tower, shipment, arch, port, timemach) );
			}
			return estadisticas;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	///////////////////////////////////
	// Añadir método para insertar
	///////////////////////////////////
	
	public void insertDato(String nomTabla, Object[] datos) throws DBException {
		
		int FilasAfectadas = 0;
		try {
			Connection conexion = null;
			String CadenaInsercion = "insert into " + nomTabla + "values ("+"'"+datos[0]+ ";";
			for (int i=1 ; i<=datos.length;i++) {
				if (i < datos.length) {
					CadenaInsercion+=",'"+datos[i]+ "'";
				}else
				CadenaInsercion +=")";
			}
			Statement SentenciaInsert = conexion.createStatement();
			FilasAfectadas = SentenciaInsert.executeUpdate (CadenaInsercion);
			System.out.println("Datos almacenados correctamente en la tabla"+nomTabla);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudieron insertar los nuevos datos en la tabla", e);
		}
	}
}


