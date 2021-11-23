package GestionDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase centraliza el acceso a la base de datos
 *
 */
public class BaseDeDatos {
	
	private Connection conn; // conexi�n con la base de datos
	
	/**
	 * Construye un objeto para gestionar la base de datos
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
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
	 * Establece una conexi�n con la base de datos
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
	 */
	public void open() throws DBException {
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:astronomical_data.db");
		} catch (SQLException e) {
			throw new DBException("No se pudo conectar de la base de datos astron�mica", e);
		}
	}
	
	/**
	 * Cierra la conexi�n con la base de datos. La conexi�n debe estar abierta.
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
	 */
	public void close() throws DBException {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudo desconectar correctamente de la base de datos", e);
		}
	}
	
	/**
	 * Obtiene la lista de las constelaciones registradas en la base de datos
	 * @return lista que contiene las constelaciones registradas en la base de datos
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
	 
	public List<Constellation> getConstellations() throws DBException {
		List<Constellation> constellations = new ArrayList<Constellation>();

		try (Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT constellations.name, abbrv, meaning, origin, COUNT(stars.name) as num_stars FROM constellations, stars WHERE abbrv = constellation GROUP BY abbrv")) {
			while(rs.next()) {
				Constellation constellation = new Constellation(
					rs.getString("abbrv"),
					rs.getString("name"),
					rs.getString("meaning"),
					rs.getString("origin"),
					rs.getInt("num_stars")
				);
					
				constellations.add(constellation);
			}
			return constellations;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudo obtener el listado de constelaciones", e);
		}
	} 
	
	/**
	 * Obtiene la lista de las estrellas de una constelaci�n
	 * @param constellation constelaci�n para la que obtener su lista de estrellas
	 * @return lista de estrellas registradas en la base de datos
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
	 
	public List<Star> getStars(Constellation constellation) throws DBException {
		try (PreparedStatement stmt = conn.prepareStatement("SELECT name, ra, dec, magnitude, luminosity, distance, spectral_type FROM stars WHERE constellation == ?")) {
			stmt.setString(1, constellation.getAbbrv());
			
			List<Star> stars = new ArrayList<>();
			try (ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					Star star = new Star(
						rs.getString("name"),
						rs.getFloat("ra"),
						rs.getFloat("dec"),
						constellation,
						rs.getFloat("distance"),
						rs.getFloat("magnitude"),
						rs.getFloat("luminosity"),
						new SpectralType(rs.getString("spectral_type"))
					);
					
					stars.add(star);
				}
			}
			
			return stars;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudo el listado de la base de datos el listado de estrellas de la constelaci�n " + constellation.getAbbrv(), e);
		}
	}
	
	/**
	 * Obtiene la lista de estrellas visibles a simple vista de una constelaci�n (magnitud < 6.5)
	 * @param constellation constelaci�n para la que obtener su lista de estrellas
	 * @return lista de estrellas visibles de la constelaci�n
	 * @throws DBException esta excepci�n se lanza si se produce alg�n error durante la construcci�n del objeto
	 
	public List<Star> getVisibleStars(Constellation constellation) throws DBException {
		try (PreparedStatement stmt = conn.prepareStatement("SELECT name, ra, dec, magnitude, luminosity, distance, spectral_type FROM stars WHERE constellation == ? AND magnitude < 6.5 ORDER BY magnitude")) {
			stmt.setString(1, constellation.getAbbrv());
			
			List<Star> stars = new ArrayList<>();
			try (ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					Star star = new Star(
						rs.getString("name"),
						rs.getFloat("ra"),
						rs.getFloat("dec"),
						constellation,
						rs.getFloat("distance"),
						rs.getFloat("magnitude"),
						rs.getFloat("luminosity"),
						new SpectralType(rs.getString("spectral_type"))
					);
					
					stars.add(star);
				}
			}
			
			return stars;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudo el listado de la base de datos el listado de estrellas de la constelaci�n " + constellation.getAbbrv(), e);
		}
	}
	
	///////////////////////////////////
	// TODO T1. A�adir m�todo para insertar
	///////////////////////////////////
	
	public void insertStars(List<Star> stars) throws DBException {
		try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO stars (name, ra, dec, magnitude, luminosity, distance, spectral_type, constellation) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {
			for (Star s : stars) {
				stmt.setString(1, s.getName());
				stmt.setFloat(2, s.getRa());
				stmt.setFloat(3,  s.getDec());
				stmt.setFloat(4, s.getMagnitude());
				stmt.setFloat(5, s.getLuminosity());
				stmt.setFloat(6, s.getDistance());
				stmt.setString(7, s.getSpectralType().toString());
				stmt.setString(8, s.getConstellation().getAbbrv());
				
				stmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("No se pudieron insertar las nuevas estrellas en la tabla", e);
		}
	}*/
}

