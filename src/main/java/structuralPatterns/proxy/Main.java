package structuralPatterns.proxy;

public class Main {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(5);
		IServicio servicio = new ProxyServicio(new Servicio(), usuario);
		
		servicio.escribir();
		servicio.leer(); //<---
		servicio.actualizar();
		servicio.eliminar();

		// Admin
		
	}

}
