package concurrentSystems;

public class SignalIncRunnable extends Thread{
    private Incrementer signalInc;
    private int inc;

    public SignalIncRunnable(Incrementer si, int i) {
        signalInc = si;
        inc = i;
    }

    public void run() {
        signalInc.incrementSignal(inc);
    }
}

