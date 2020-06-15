package behavioralPatterns.strategy;

public class Retiro implements IEstrategia {

	public float realizarOperacion(float balance, float cantidad) {
		return balance - cantidad;
	}
	
}
