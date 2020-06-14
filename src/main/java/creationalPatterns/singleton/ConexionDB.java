package creationalPatterns.singleton;

/** Cuando se necesita una sola instancia de una clase en una aplicacion este ejemplo sera una
 *  sola instancia de una base de datos */
public class ConexionDB {

	private static ConexionDB conexion;

	/** 4-Atributo estatico */
	public String host;

	/** 1-Constructor privado */
	private ConexionDB() {
		
	}

	/** 2-Metodo que retorna un objeto de la misma clase */
	/** 3-Es estatico */
	public synchronized static ConexionDB obtenerConexion() {
		
		if(conexion == null) { // si no se ha creado
			conexion = new ConexionDB();
		}
		// si ya se creo lo retorna de nuevo
		return conexion;
	}
	
}
