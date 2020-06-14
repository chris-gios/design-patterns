package creationalPatterns.simpleFactory;

public class Main {

	/** Este metodo controla la creacion de objetos complejos, para este caso solo permite
	 *  crear pizza de tamaños especificos (chica, mediana, grande) */
	
	public static void main(String[] args) {
		
		Pizzeria pedido = new Pizzeria();

		Pizza pizzaPeperoniChica = pedido.crearPizzaChica();
		Pizza pizzaPeperoniMediana = pedido.crearPizzaMediana();
		Pizza pizzaPeperoniGrande = pedido.crearPizzaGrande();


		System.out.println(pizzaPeperoniChica);
		System.out.println(pizzaPeperoniMediana);
		System.out.println(pizzaPeperoniGrande);


		/** Sin simple factory se podrian crear pizza de 5,3,..n porciones */
//		Pizza pizzaPeperoni = new Pizza(8);
//		System.out.println(pizzaPeperoni);
		
	}
	
}
