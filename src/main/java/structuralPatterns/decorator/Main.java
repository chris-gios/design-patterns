package structuralPatterns.decorator;

public class Main {

	/** Este patron sirve para generar aplicaciones extendibles de forma sencilla,
	 *  osea que cuando se hagan cambios la aplicacion se adapte facilmente */
	
	public static void main(String[] args) {

		/** Se agrega nueva logica que es agregar queso extra por 2 dolares  y orilla de queso por 4 dolares
		 *  para eso se agregaron las clases OrillaRellena y QuesoExtra*/
		IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
		
		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());
		
		
		IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));
		
		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());

		/** Sin usar decorator y sin queso extra */
		IPizza pizzaPeperoni2 = new PizzaPeperoni();

		System.out.println(pizzaPeperoni2.descripcion());
		System.out.println(pizzaPeperoni2.precio());


		IPizza pizzaHawaiana2 = new PizzaHawaiana();

		System.out.println(pizzaHawaiana2.descripcion());
		System.out.println(pizzaHawaiana2.precio());
		
		
		
	}

}
