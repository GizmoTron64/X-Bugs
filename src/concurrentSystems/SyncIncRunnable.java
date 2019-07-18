package concurrentSystems;

public class SyncIncRunnable extends Thread {
    private Incrementer syncInc;
    private int inc;
    private int mult;

    public SyncIncRunnable(Incrementer i, int x, int m) {
        syncInc = i;
        inc = x;
        mult = m;
    }

    public void run() {
        synchronized(this) { //synchronized was modified
            syncInc.increment(inc);
            syncInc.multiplier(mult);
        }
    }
}
