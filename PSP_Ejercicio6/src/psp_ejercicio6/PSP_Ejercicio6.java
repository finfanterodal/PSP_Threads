package psp_ejercicio6;


/**
 *
 * @author dam2
 */
public class PSP_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor recursos = new Contenedor();
        Consumer c = new Consumer(recursos);
        Producer p = new Producer(recursos);
        p.start();
        c.start();
    }

}
