package creationalPatterns.singleton;

public class Main {

	public static void main(String[] args) {
	
		/** Aqui probamos que sin importar las veces que se cree el objeto, siempre nos
		 *  retorna el mismo */
		ConexionDB conexionDB = ConexionDB.obtenerConexion();
		ConexionDB conexionPruba1 = ConexionDB.obtenerConexion();
		ConexionDB conexionPruba2 = ConexionDB.obtenerConexion();
		ConexionDB conexionPruba3 = ConexionDB.obtenerConexion();

		System.out.println(conexionDB.hashCode());
		System.out.println(conexionPruba1.hashCode());
		System.out.println(conexionPruba2.hashCode());
		System.out.println(conexionPruba3.hashCode());
		
	}
	
}
