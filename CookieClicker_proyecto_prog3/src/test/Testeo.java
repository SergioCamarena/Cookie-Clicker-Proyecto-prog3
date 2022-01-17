package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Cookie;
import code.Edificios;
import code.NombreEdif;
import datos.Partida;
import gestion.de.datos.BaseDeDatos;
import gestion.de.datos.DBException;

public class Testeo {
	
	//Para comenzar el test y comprobar si se abre correctamente la conexion la base de datos
	@Before
	public void setUp() throws Exception {
		BaseDeDatos.abrirConexion( "CookieClicker", true );
	}

	// test para inserta un nuevos datos.
	@Test
	public void insertarDatoTest() throws DBException {
		try {
			BaseDeDatos.abrirConexion(null, false);// Si alguien necesita poner aqui lo parametros q los pongaa
			
			int contAntesDeInsertar = BaseDeDatos.contarDatos();
			BaseDeDatos.contarDatos();
			int contDespuesDeInsertar = BaseDeDatos.contarDatos();
			assertTrue(contAntesDeInsertar == contDespuesDeInsertar - 1);
			BaseDeDatos.cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEdificios() throws DBException {
		
		//Tienes que coger la lista de edificios recorrerla y verificar que hay 9 edificios, 
		//que todos sus valores de compra son distintos y que no hay ninguno que tiene el mismo nombre.
		ArrayList<Edificios> listaEdif = new ArrayList<Edificios>();
//		Edificios cursor = new Edificios(NombreEdif.CURSOR, 10.5, numcl,numcl, 15);
//		Edificios grandma = new Edificios(NombreEdif.GRANDMA, 10.5, numgr,numgr, 32);
//		Edificios farm = new Edificios(NombreEdif.FARM, 10.5, numfrm,numfrm, 45);
//		Edificios mine = new Edificios(NombreEdif.MINE, 10.5, numine,numine, 150);
//		Edificios factory = new Edificios(NombreEdif.FACTORY, 10.5, numfac,numfac, 450);
//		Edificios bank = new Edificios(NombreEdif.BANK, 10.5, numban,numban, 700);
		
		//Meter edificios dentro de lista
//		listaEdif.add(cursor);
//		listaEdif.add(grandma);
//		listaEdif.add(farm);
//		listaEdif.add(mine);
//		listaEdif.add(factory);
//		listaEdif.add(bank);
	}
	
	//Test para comprobar que los getters funcionan bien
	@Test
	public void testCookie() {
		Cookie c1 = new Cookie(100, 300);
		Cookie c2 = null;
		assertTrue(c1.getClickCookie() == (100));
		assertFalse(c2 == c1);
	}
	
	
	//Para finalizar el test y ver si se cierra correctamenta la conexion de la base de datos
	@After
	public void tearDown() throws Exception {
		BaseDeDatos.cerrarConexion();
	}
}
