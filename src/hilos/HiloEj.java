package hilos;

public class HiloEj extends Thread{
    public HiloEj(String st) {
        super(st);
    }

    @Override
    public void run() {
        for(int i = 0; i <10; i++) {
            System.out.println(i+ " "+getName());
            System.out.println("Terminamos hilo "+getName());
        }
    }
}
