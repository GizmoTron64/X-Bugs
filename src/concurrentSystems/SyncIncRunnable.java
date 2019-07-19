package concurrentSystems;

public class SyncIncRunnable extends Thread {
    private Incrementer syncInc;
    private int inc;

    public SyncIncRunnable(Incrementer i, int x) {
        syncInc = i;
        inc = x;
    }

    public void run() {
        synchronized(this) { //synchronized was modified
            syncInc.increment(inc);
        }
    }
}
