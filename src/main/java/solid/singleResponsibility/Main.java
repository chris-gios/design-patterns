package solid.singleResponsibility;

public class Main {
    /** Rectangulo: Que se debe de mostrar
     *  Presentacion: Como se debe de mostrar */

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(10, 20);

        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);
        /** Este metodo estaria mal porque tendria mas de una responsabilidad
         * rectangulo.imprimir(); */


    }

}
