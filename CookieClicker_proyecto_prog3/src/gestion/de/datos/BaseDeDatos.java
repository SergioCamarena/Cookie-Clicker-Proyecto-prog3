package gestion.de.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import datos.Estadisticas;
import datos.Partida;
import datos.Usuario;

/**
 * Esta clase centraliza el acceso a la base de datos
 *
 */
public class BaseDeDatos {
	private static Connection conexion;
	private static Logger logger = Logger.getLogger( "BaseDeDatos" );
	
	/** Abre conexión con la base de datos
	 * @param nombreBD	Nombre del fichero de base de datos
	 * @param reiniciaBD	true si se quiere reiniciar la base de datos (se borran sus contenidos si los tuviera y se crean datos por defecto)
	 * @return	true si la conexión ha sido correcta, false en caso contrario
	 */
	public static boolean abrirConexion( String nombreBD, boolean reiniciaBD ) {
		try {
			logger.log( Level.INFO, "Carga de librería org.sqlite.JDBC" );
			Class.forName("org.sqlite.JDBC");  // Carga la clase de BD para sqlite
			logger.log( Level.INFO, "Abriendo conexión con " + nombreBD );
			conexion = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
			if (reiniciaBD) {
				Statement statement = conexion.createStatement();
				String sent = "DROP TABLE IF EXISTS partida";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent );
				sent = "CREATE TABLE producto (cod_partida INTEGER PRIMARY KEY AUTOINCREMENT, nom_usuario VARCHAR(30) NOT NULL, cookie_tot INT(10), cookie_ps INT(10), edif_tot INT(10), tiempo_tot INT(10), foreign key  (nom_usuario) references usuario(nom_usuario) on delete cascade);";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent );
				sent = "DROP TABLE IF EXISTS usuario";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent );
				sent = "CREATE TABLE compra (nom_usuario VARCHAR PRIMARY KEY, contrasenya);";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent );
				sent = "DROP TABLE IF EXISTS estadisticas";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent);
				sent = "CREATE TABLE producto (cod_partida INT(10), grandmas INT(10), farms INT(10), mine INT(10), factory INT(10), bank INT(10), temple INT(10), w_tower INT(10), shipment INT(10), arch INT(10), port INT(10), timemach\" INT(10), primary key(cod_partida, grandmas), foreign key (cod_partida) references Partida(cod_partida) on delete cascade));";
				logger.log( Level.INFO, "Statement: " + sent );
				statement.executeUpdate( sent );
				try {
					Scanner scanner = new Scanner( BaseDeDatos.class.getResourceAsStream("Ranking.csv") );
					while (scanner.hasNextLine()) {
						String linea = scanner.nextLine();
						String[] datos = linea.split( "\t" );
						sent = "insert into partida (cod_partida, nom_usuario, cookie_ps, edif_tot, tiempo_tot) values (" + datos[0] + ",'" + datos[1] + "'," + datos[2] + "'" + datos[3] + "'," + datos[4] + ")";
						logger.log( Level.INFO, "Statement: " + sent );
						statement.executeUpdate( sent );
					}
					scanner.close();
				} catch(Exception e) {
					logger.log( Level.SEVERE, "Excepción", e );
				}
			}
			return true;
		} catch(Exception e) {
			logger.log( Level.SEVERE, "Excepción", e );
			return false;
		}
	}	
	
	/** Cierra la conexión abierta de base de datos ({@link #abrirConexion(String)})
	 */
	public static void cerrarConexion() {
		try {
			logger.log( Level.INFO, "Cerrando conexión" );
			conexion.close();
		} catch (SQLException e) {
			logger.log( Level.SEVERE, "Excepción", e );
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
				int cookie_tot = rs.getInt("cookie_tot");//Contador de cookies
				int cookie_ps = rs.getInt("cookie_ps");//cont
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
	
	
	//Contar el nÃºmero de datos existentes
		public static int contarDatos() throws SQLException {
			Statement statement = conexion.createStatement();
			String sent = "select count(*) from tabla";
			ResultSet rs = statement.executeQuery(sent);
			int resul = rs.getInt(1);
			rs.close();
			return resul;
		}
}


