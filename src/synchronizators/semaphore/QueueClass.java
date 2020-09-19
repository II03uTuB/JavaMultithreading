package synchronizators.semaphore;

import java.util.concurrent.Semaphore;

public class QueueClass {
    static Semaphore semaphoreConsumer = new Semaphore(0);
    static Semaphore semaphoreProducer = new Semaphore(1);
    int count;

    void get() {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("Исключение");
        }
        System.out.println("Получено: " + count);
        semaphoreProducer.release();
    }
    void put(int count) {
        try {
            semaphoreProducer.acquire();
        } catch(InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        this.count = count;
        System.out.println("Отправлено: " + count);
        semaphoreConsumer.release();
    }

}
