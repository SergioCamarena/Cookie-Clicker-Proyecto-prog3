package test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import gestion.de.datos.BaseDeDatos;
import gestion.de.datos.DBException;

public class Testeo {

	// test para inserta un nuevos datos.
	@Test
	public void insertarDatoTest() throws DBException {
		try {
			BaseDeDatos.open();
			int contAntesDeInsertar = BaseDeDatos.contarDatos();
			BaseDeDatos.contarDatos();
			int contDespuesDeInsertar = BaseDeDatos.contarDatos();
			assertTrue(contAntesDeInsertar == contDespuesDeInsertar - 1);
			BaseDeDatos.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
