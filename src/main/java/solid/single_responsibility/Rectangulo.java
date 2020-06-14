package solid.single_responsibility;

import lombok.Data;

/** Principio de Responsabilidad Unica
 *  La clase Rectangulo tiene alta coecion ya que realiza multiples tareas
 *  y tiene mucha relacion consigo misma */

@Data
public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public float area() {
        return this.getBase() * this.getAltura() ;
    }

/**    Esto no cumple con responsabilidad unica ya que deberia estar en la capa de presentacion */
//    public void imprimir(){
//        System.out.println(this);
//    }
}

