package concurrentSystems;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Incrementer {
    private ReentrantLock lock = new ReentrantLock();
    private int count;
    private int secs;
    private int millis;
    private Condition condition;

    public Incrementer() {
        count = 0;
        secs = 3;
        millis = 750;
        condition = lock.newCondition();
    }

    public void increment(int inc) {
        if (inc > 0) {
            System.out.println("Incrementing count by " + inc);
            for (int i = 0; i < inc; i++) {
                count++;
                System.out.println(count);

                try {
                    Thread.sleep(millis);
                } catch (Exception e) {
                    System.out.println("Thread Interrupted");
                }
            }
        } else {
            System.out.println("Increment amount must be greater than 1");
        }
    }

    public void incrementLocked(int inc) {
        System.out.println("incrementLocked begins...");
        lock.lock();
        increment(inc);
        lock.unlock();
        System.out.println("incrementLocked ends.");
    }

    public void multiplier(int mult) {
        System.out.println("Multiplying count by " + mult);
        count *= mult;
        System.out.println(count);
    }

    public void incrementInterrupt(int inc) {
        System.out.println("incrementInterrupt begins...");
        lock.lock();
        if(count%5 == 0) {
            Thread.currentThread().interrupt();
        }

        if(Thread.interrupted()) {
            increment(inc);
        } else {
            count = -1;
            System.out.println(count);
        }

        lock.unlock();
        System.out.println("incrementInterrupt ends.");
    }

    public void incrementAwait(int inc)  {
        System.out.println("incrementAwait begins...");
        lock.lock();
        try {
             if (count == 0) {
                 System.out.println("Waiting");
                 boolean waiting = condition.await(secs, TimeUnit.SECONDS);
                 if (waiting) {
                     increment(inc);
                 }
             } else {
                increment(inc);
             }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");

        } finally {
            lock.unlock();
        }

    }

    public void incrementSignal(int inc) {
        System.out.println("incrementSignal begins...");
        lock.lock();
        increment(inc);
        condition.signalAll();
        System.out.println("incrementSignal ends.");
        lock.unlock();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int i) {
        count = i;
    }

    /**
     * Sets secs
     *
     * @param s
     */
    public void setSecs(int s) {
        secs = s;
    }

    /**
     * Sets millis
     *
     * @param m
     */
    public void setMillis(int m) {
        millis = m;
    }
}


