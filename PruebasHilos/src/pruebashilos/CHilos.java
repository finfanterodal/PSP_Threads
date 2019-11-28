package pruebashilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class CHilos extends Thread {

    public CHilos(String name) {
        super.setName(name);
    }

    //Método que especifica las tareas concurrentes
    public void run() {
        //  System.out.println(getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+getName());
            try {
                //sleep(ms) detiene la ejecucion del hilo en cuestión
                sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("FIN! " + getName());
    }

}
