package creationalPatterns.factoryMethod;

public interface IPizzeria {

	/** Indica que es necesario crear un objeto de tipo Pizza */
	Pizza crearPizza(String tipo);
	
}
