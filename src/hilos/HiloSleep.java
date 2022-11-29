package hilos;

public class HiloSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i< 4; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Sleep");
        }
    }
}
