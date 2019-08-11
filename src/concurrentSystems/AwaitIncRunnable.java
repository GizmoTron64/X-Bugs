package concurrentSystems;

public class AwaitIncRunnable extends Thread {
    private Incrementer awaitInc;
    private int inc;

    public AwaitIncRunnable(Incrementer ai, int i) {
        awaitInc = ai;
        inc = i;
    }

    public void run() {
        awaitInc.incrementAwait(inc);
    }
}
