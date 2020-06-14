package creationalPatterns.singletonConcurrent;

public class ConexionDB {

	private static ConexionDB conexion;
	
	public String host;
	
	private ConexionDB() {
		
	}

	/** con synchronized se garantiza que solo se crea un objeto a pesar de la concurrencia */
	public synchronized static ConexionDB obtenerConexion() {
		
		if(conexion == null) { 
			conexion = new ConexionDB();
		}
		
		return conexion;
	}
	
}
