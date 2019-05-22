package mutantExamples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * RCXC - Remove Concurrency Method-X Call
 *
 * Removes key concurrency methods:
 * Locks: lock(), unlock()
 * Condition: signal(), signalAll()
 * Semaphore: acquire(), release()
 * Latch: countDown()
 * ExecutorService: submit()
 */
public class RCXC {
    private Lock lock1= new ReentrantLock();

    public void rcxcOG() {
        lock1.lock();
        try {
            // ...
        } finally {
            lock1.unlock();
        }
    }

    public void rcxcMutant() {
        lock1.lock();
        try {
            // ...
        } finally {
            // Removed lock1.unlock();
        }
    }
}
