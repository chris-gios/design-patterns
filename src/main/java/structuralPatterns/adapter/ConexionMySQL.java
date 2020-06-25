package structuralPatterns.adapter;

public class ConexionMySQL implements IConexionSQL {

	public void conexion() {
		System.out.println("Conexion con MYSQL");
	}
	
	public String runQuery() {
		return "Consulta MYSQL";
	}
	
}
