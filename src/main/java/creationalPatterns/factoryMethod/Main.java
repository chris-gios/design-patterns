package creationalPatterns.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		Pizzeria pedido = new Pizzeria();
		
		Pizza peperoni = pedido.crearPizza("Peperoni");
		Pizza hawaiana = pedido.crearPizza("Hawaiana");
		Pizza orillaRellena = pedido.crearPizza("Peperoni orilla rellena");
		
		
		System.out.println(peperoni);
		System.out.println(hawaiana);
		
		System.out.println(orillaRellena);
		
	}

}
