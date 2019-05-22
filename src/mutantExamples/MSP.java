package mutantExamples;

/**
 * mutantExamples.MSP - Modify Synchronised Block Parameter
 *
 * Replaces keyword this with another object or vice versa
 * Produces wrong lock bug pattern
 */

public class MSP {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void mspOG() {
        synchronized(lock1) {}
    }

    public void mspMutant1() {
        synchronized(lock2) {}
    }

    public void mspMutant2() {
        synchronized(this) {}
    }
}
