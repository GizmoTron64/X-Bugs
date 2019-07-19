package concurrentSystems;

import java.util.concurrent.locks.ReentrantLock;

public class Incrementer {
    ReentrantLock lock = new ReentrantLock();
    private int count;

    public Incrementer() {
        int x = 0;
    }

    public void increment(int inc) {
        for (int i = 0; i < inc; i++) {
            count++;
            System.out.println(count);

            try {
                Thread.sleep(750);
            } catch (Exception e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    public void incrementLocked(int inc) {
        lock.lock();
        increment(inc);
        lock.unlock();
    }

    public void multiplier(int mult) {
        count *= mult;
        System.out.println(count);
    }

    public void incrementInterrupt(int inc) {
        lock.lock();
        Thread.currentThread().interrupt();

        if(Thread.interrupted()) {
            increment(inc);
        } else {
            count = -1;
            System.out.println(count);
        }

        lock.unlock();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int i) {
        count = i;
    }
}


