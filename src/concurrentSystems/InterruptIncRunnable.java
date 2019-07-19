package concurrentSystems;

public class InterruptIncRunnable extends Thread {
    private Incrementer interruptInc;
    private int inc;

    public InterruptIncRunnable(Incrementer ii, int i) {
        interruptInc = ii;
        inc = i;
    }

    public void run() {
        interruptInc.incrementInterrupt(inc);
    }
}
