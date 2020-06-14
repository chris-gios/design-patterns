package solid.segregacionInterface;

public class Main {

    /** La interfaz IFelino no puede contener los metodos maullar y rugir ya que si la clase Jaguar implementa
     *  la interface este no usaria maullar y si no se van a usar todos los metodos de la interfaz se esta
     *  incumpliendo con la segregacion de interfaces por eso se crea IFelinoCasero y IFelinoSalvaje */

    public static void main(String[] args) {

        /** Aqui se puede ver que tambien cumple LSP */

        Jaguar jaguaHijo = new Jaguar(10, 120f);
        jaguaHijo.cazar();

        IFelino jaguaAbuelo = new Jaguar(10, 120f);
        jaguaAbuelo.cazar();

        IFelinoSalvaje jaguaPadre = new Jaguar(10, 120f);
        jaguaPadre.cazar();

    }
}
