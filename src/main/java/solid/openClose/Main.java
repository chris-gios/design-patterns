package solid.openClose;

public class Main {

    /** Cumple con el principio open/close:
     *  Ya se que pueden implementar muchos tipos de figuras aparte de rectangulo y triangulo (abierto a extension)
     *  ya que solo debe implementar IFigura y esta interfaz no se tiene que modifical (cerrado a modificacion) y
     *  podra usar la clase Presentacion para imprimir el area */

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(10, 20);
        Triangulo triangulo = new Triangulo(10, 5);

        Presentacion presentacion = new Presentacion();

        presentacion.area(rectangulo);
        presentacion.area(triangulo);

    }

}
