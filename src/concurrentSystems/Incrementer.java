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
                Thread.sleep(500);
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
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Thread Interrupted");
        }
        count *= mult;
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }
}


