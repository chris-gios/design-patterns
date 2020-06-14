package solid.openClose;

import lombok.Data;


@Data
public class Rectangulo implements IFigura {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    /** metodo que implementa por IFigura */
    public float area() {
        return this.getBase() * this.getAltura();
    }

}

