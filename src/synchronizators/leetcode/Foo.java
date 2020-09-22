package synchronizators.leetcode;

import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore semaphore1 = new Semaphore(0);
    private Semaphore semaphore2 = new Semaphore(0);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphore1.acquire();
        printSecond.run();
        semaphore2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphore2.acquire();
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.first(() -> System.out.println("first"));
        foo.second(() -> System.out.println("second"));
        foo.third(() -> System.out.println("third"));
    }
}
