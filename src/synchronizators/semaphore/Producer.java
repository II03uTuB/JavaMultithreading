package synchronizators.semaphore;

public class Producer implements Runnable {
    QueueClass queueClass;

    public Producer(QueueClass queueClass) {
        this.queueClass = queueClass;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            queueClass.put(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}