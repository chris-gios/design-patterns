package creationalPatterns.singletonConcurrent;

public class Main {

    public static void main(String[] args) {

    	/** hilo 1 */
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }

        });

		/** hilo 2 */
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println(conexion.hashCode());
            }

        });

        t1.start();
        t2.start();


    }

}
