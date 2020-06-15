package behavioralPatterns.chainOfResponsibility;

public interface IManejadorTransacciones {

	void setNextManejador(IManejadorTransacciones next);
	
	void ejecutarTransaccion(Transaccion transaccion);
	
}
