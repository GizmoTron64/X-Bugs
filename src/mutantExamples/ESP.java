package mutantExamples;

/**
 * mutantExamples.ESP - Exchange Synchronised Block Parameters
 *
 * Adjacent lock objects will be swapped
 * Produces wrong lock bug or a deadlock
 */

public class ESP {
    private Object lock1 = new Object();
    private Object lock2 = new Object();


    public void espOG() {
        synchronized (lock1) {
            synchronized(lock2) {}
        }
    }

    public void espMutant() {
        synchronized (lock2) {
            synchronized(lock1) {}
        }
    }
}
