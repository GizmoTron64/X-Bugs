package concurrentSystems;

public class LockIncRunnable extends Thread{
    private Incrementer lockInc;
    private int inc;

    public LockIncRunnable(Incrementer li, int i) {
        lockInc = li;
        inc = i;
    }

    public void run() {
        lockInc.incrementLocked(inc);
    }

}
