package synchronizators.semaphore;

import java.util.concurrent.Semaphore;

class DecThread implements Runnable {

    String name;
    Semaphore semaphore;

    DecThread(Semaphore s, String n) {
        semaphore = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            for(int i = 0; i < 5; i++) {
                Resourse.counter--;
                System.out.println(name + ": " + Resourse.counter);

                // Разрешить, если возможно, переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }

        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        semaphore.release();
    }
}