package structuralPatterns.facade;

public class Teclado implements ITeclado {

	public void conectar() {
		System.out.println("Conexión Teclado vía USB!");
	}
	
}

