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


import code.Edificios;
import code.NombreEdif;
import datos.Partida;
import gestion.de.datos.BaseDeDatos;
import gestion.de.datos.DBException;
import ventanas.Tablas;

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
		
		//Tienes que coger la lista de edificios recorrerla y verificar que hay 6 edificios, 
		ArrayList<Edificios> listaEdif = new ArrayList<Edificios>();
		Edificios cursor = new Edificios(NombreEdif.CURSOR, 100, 15);
		Edificios grandma = new Edificios(NombreEdif.GRANDMA, 80, 32);
		Edificios farm = new Edificios(NombreEdif.FARM, 30, 45);
		Edificios mine = new Edificios(NombreEdif.MINE, 15, 150);
		Edificios factory = new Edificios(NombreEdif.FACTORY, 10, 450);
		Edificios bank = new Edificios(NombreEdif.BANK, 5, 700);
		
		//Meter edificios dentro de lista
		listaEdif.add(cursor);
		listaEdif.add(grandma);
		listaEdif.add(farm);
		listaEdif.add(mine);
		listaEdif.add(factory);
		listaEdif.add(bank);
		
		assertEquals(6, listaEdif.size()); //verifica que hay 6 edificios metidos en la lista
		
	}
	
	//Test para comprobar que los getters funcionan bien
	@Test
	public void testClassEdificios() {
		Edificios e1 = new Edificios(NombreEdif.FARM, 80, 10.2);
		Edificios e2 = null;
		assertTrue(e1.getValorCompra() == (10.2));
		assertFalse(e2 == e1);
	}
	
	//Test para comprobar quien tiene mas edificios
	@Test
	public void masEdifTest() {
		ArrayList<Partida>listaPartida = new ArrayList<Partida>();
		
		Partida a = new Partida(01,"Sergio",100,200000,300,220);
		Partida b = new Partida(02,"Imanol",60,4000000,250,190);
		Partida c = new Partida(16,"Manuel",2833,3893,81734,2834);
		Partida d = new Partida(23,"Marcela",845,384,3485,2834);
		
		listaPartida.add(d);
		listaPartida.add(c);
		listaPartida.add(b);
		listaPartida.add(a);
		
		assertEquals(Tablas.maxEdif(listaPartida), c);
		
	}
	
	//Test para comprobar quien tiene menos edificios
	@Test
	public void minEdifTest() {
		ArrayList<Partida>listaPartida = new ArrayList<Partida>();
		
		Partida a = new Partida(01,"Sergio",100,200000,300,220);
		Partida b = new Partida(02,"Imanol",60,4000000,250,190);
		Partida c = new Partida(16,"Manuel",2833,3893,81734,2834);
		Partida d = new Partida(23,"Marcela",845,384,3485,2834);
		
		listaPartida.add(d);
		listaPartida.add(c);
		listaPartida.add(b);
		listaPartida.add(a);
		
		Partida menos = Tablas.minEdif(listaPartida);
		assertTrue(menos.getEdif_tot() == b.getEdif_tot());
	}
	
	
	
	@Test
	public void masTiempoTest() {
ArrayList<Partida>listaPartida = new ArrayList<Partida>();
		
		Partida a = new Partida(01,"Sergio",100,200000,300,220);
		Partida b = new Partida(02,"Imanol",60,4000000,250,190);
		Partida c = new Partida(16,"Manuel",2833,3893,81734,2834);
		Partida d = new Partida(23,"Marcela",845,384,3485,2835);
		
		listaPartida.add(d);
		listaPartida.add(c);
		listaPartida.add(b);
		listaPartida.add(a);
		
		assertEquals(Tablas.masTiempo(listaPartida), d);
	}
	
	//Para finalizar el test y ver si se cierra correctamenta la conexion de la base de datos
	@After
	public void tearDown() throws Exception {
		BaseDeDatos.cerrarConexion();
	}
}
