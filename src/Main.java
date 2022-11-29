import hilos.*;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //herencia
        HiloHerencia hiloHerencia = new HiloHerencia();
        hiloHerencia.start();
        System.out.println("Hola soy el hilo funcionando");

        //interfaz
        HiloInterfaz hiloInterfaz = new HiloInterfaz();
        hiloInterfaz.run();
        System.out.println("Finishhh run");

        //Slepp
        HiloSleep hiloSleep = new HiloSleep();
        hiloSleep.run();

        //Join 1
        HiloJoin1 hiloJoin1 = new HiloJoin1();
        Thread t = new Thread(hiloJoin1);
        t.start();

        //join 2
        new HiloJoin2().doSometing();

        //Ej
        new HiloEj("Paula").start();
        new HiloEj("Builes").start();
        System.out.println("Terminamos el hilo main");
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            System.out.println("Thread execution - " + Thread.currentThread().getName());
            return "Paula Builes" ;
        });

        String resultValue = completableFuture.join();

        System.out.println("Result - " + resultValue);
    }

    static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
