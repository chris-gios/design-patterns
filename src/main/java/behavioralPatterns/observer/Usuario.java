package behavioralPatterns.observer;

public class Usuario implements IObserver {

	public void notificacion(String mensaje){
		System.out.println(mensaje);
	}
	
}
