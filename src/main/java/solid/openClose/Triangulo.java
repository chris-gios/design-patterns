package solid.openClose;

import lombok.Data;

@Data
public class Triangulo implements IFigura {

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    /** metodo que implementa por IFigura */
    public float area() {
        return (getBase() * getAltura() )/ 2;
    }

}
