package synchronizators.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreWork {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        new IncThread("Thread-1", semaphore);
        new DecThread("Thread-2", semaphore);

    }
}
