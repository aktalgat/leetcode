package io.talgat.easy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/print-in-order
 */
public class PrintInOrder {
    private final Semaphore second = new Semaphore(0);
    private final Semaphore third = new Semaphore(0);

    private final CountDownLatch latch1 = new CountDownLatch(1);
    private final CountDownLatch latch2 = new CountDownLatch(1);

    private int step = 1;
    private final Object lock = new Object();

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        third.acquire();
        printThird.run();
    }

    public void first1(Runnable printFirst) {
        printFirst.run();
        latch1.countDown();
    }

    public void second1(Runnable printSecond) throws InterruptedException {
        latch1.await();
        printSecond.run();
        latch2.countDown();
    }

    public void third1(Runnable printThird) throws InterruptedException {
        latch2.await();
        printThird.run();
    }

    public void first2(Runnable printFirst) throws InterruptedException {
        synchronized (lock) {
            while (step != 1) {
                lock.wait();
            }
            printFirst.run();
            step = 2;
            lock.notifyAll();
        }
    }

    public void second2(Runnable printSecond) throws InterruptedException {
        synchronized (lock) {
            while (step != 2) {
                lock.wait();
            }
            printSecond.run();
            step = 3;
            lock.notifyAll();
        }
    }

    public void third2(Runnable printThird) throws InterruptedException {
        synchronized (lock) {
            while (step != 3) {
                lock.wait();
            }
            printThird.run();
        }
    }
}
