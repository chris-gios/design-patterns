package structuralPatterns.composite;

public class Main {

	/** Este patron de diseño genera sub categorias como si fuera un arbol, en este caso hay 5 menus
	 *  donde el primer menu contiene al menu 2 y 3, y el menu 3 contiene al menu 4 y 5 */

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Menu menu2 = new Menu();
		Menu menu3 = new Menu();
		
		Menu menu4 = new Menu();
		Menu menu5 = new Menu();
		
		menu3.addMenu(menu4);
		menu3.addMenu(menu5);
		
		menu.addMenu(menu2);
		menu.addMenu(menu3);
		
		menu.open();
		menu.close();

	}

}
