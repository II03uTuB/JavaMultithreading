package synchronizators.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreWork {
    public static void main(String[] args) {
        QueueClass queueClass = new QueueClass();
        new Consumer(queueClass);
        new Producer(queueClass);

    }
}
