package creationalPatterns.simpleFactory;

public class Pizzeria {

	/** Esta clase juega el papel de simple factor */
	public Pizza crearPizzaChica() {
		//DB, FIlE, API
		return new Pizza(6);
	}

	public Pizza crearPizzaMediana() {
		return new Pizza(8);
	}

	public Pizza crearPizzaGrande() {
		return new Pizza(12);
	}
}