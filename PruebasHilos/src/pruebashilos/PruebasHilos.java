package pruebashilos;

/**
 *
 * @author dam2
 */
public class PruebasHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CHilos hilo1, hilo2;
        hilo1 = new CHilos("hilo1");
        hilo2 = new CHilos("hilo2");

        //Iniciar las tareas (Ejecuta las sentencias del método run())
        hilo1.start();
        hilo2.start();
        
        System.out.println("MAIN");
    }

}
