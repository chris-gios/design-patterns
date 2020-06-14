package solid.openClose;

public class Presentacion {

    public void area(IFigura figura){
        System.out.println(figura.area());
    }


    /** No comple Open/Close, ya que tocaria crear un metodo area() cada que haya otro tipo de figura */
//    public void area(Rectangulo rectangulo) {
//        System.out.println(triangulo.getBase() * triangulo.getAltura());
//    }
//
//    public void area(Triangulo triangulo) {
//        System.out.println(( triangulo.getBase() * triangulo.getAltura())/ 2);
//    }

}
