package synchronizators.semaphore;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {

    String name;
    Semaphore semaphore;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + "ожидает разрешение");
            semaphore.acquire();
            System.out.println("Поток " + name + " получает разрешение");

            for(int i = 0; i < 5; i++) {
                Resourse.counter++;
                System.out.println(name + ": " + Resourse.counter);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + name + " освобождает разрешение");
    }
}
