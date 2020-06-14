package solid.liskov_substitution;

public class Main {

    public static void main(String[] args) {

        Animal yagua = new Jaguar(10, 120f);
        yagua.comer();
        yagua.dormir();


        Jaguar jaguar = new Jaguar(10, 120f);
        jaguar.comer();
        jaguar.dormir();
    }
}
