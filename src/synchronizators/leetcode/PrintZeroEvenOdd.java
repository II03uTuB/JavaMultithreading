package synchronizators.leetcode;

import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {
    private int n;

    public PrintZeroEvenOdd(int n) {
        this.n = n;
        new Thread(new Runnable() {
            @Override
            public void run() {
                zero();
            }
        })

    }


    public void zero(IntConsumer printNumber) throws InterruptedException {

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }

    public static void main(String[] args) {
        int n = 32;
        PrintZeroEvenOdd print  = new PrintZeroEvenOdd(n);
        print.

    }
}
