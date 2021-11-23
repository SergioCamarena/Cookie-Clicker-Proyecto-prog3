package GestionDeDatos;

/**
 * Representa un error en la base de datos
 *
 */
public class DBException extends Exception {

	/**
	 * Construye la excepci�n con le mensaje indicado
	 * @param message mensaje contenido en la excepci�n
	 */
	private static final long serialVersionUID = 1L;
	
	public DBException(String message) {
		super(message);
	}

	/**
	 * Construye la excepci�n con el mensaje y la excepci�n
	 * interna anidada.
	 * @param message mensaje de la excepci�n
	 * @param t excepci�n interna anidada
	 */
	public DBException(String message, Throwable t) {
		super(message, t);
	}
}
