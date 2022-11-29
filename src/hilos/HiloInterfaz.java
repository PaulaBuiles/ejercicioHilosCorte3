package hilos;

public class HiloInterfaz implements Runnable{

    @Override
    public void run() {
        System.out.println("Soy el hilo con interfaz");
    }
}
