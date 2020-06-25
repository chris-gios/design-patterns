package structuralPatterns.adapter;

public class Main {

	/** Se crea la clase AdaptadorDB para que nos permita trabajar con SQL y NoSQL */

	public static void main(String[] args) {

		/** Sin el adaptador no se pude conectar a un NoSQL */
		IConexionSQL conexionSQL = new ConexionMySQL();

		conexionSQL.conexion();

		String resultadoSQL = conexionSQL.runQuery();
		System.out.println(resultadoSQL);

		/** Con el adaptador  si se puede conectar a un NoSQL */
		IConexionSQL conexionNoSQL = new AdaptadorDB( new ConexionMongoDB() );

		conexionNoSQL.conexion();

		/** Este metodo ejecuta excecuteSentence de NoSQL */
		String resultado = conexionNoSQL.runQuery();
		System.out.println(resultado);


	}

}
