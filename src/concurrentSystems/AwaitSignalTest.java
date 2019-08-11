package concurrentSystems;

public class AwaitSignalTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        AwaitIncRunnable ai = new AwaitIncRunnable(inc, 3);
        SignalIncRunnable si = new SignalIncRunnable(inc, 2);

        ai.start();
        si.start();

        try {
            ai.join();
            si.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 5: "Incorrect count value. Count = " + inc.getCount() + " Expected Count = 7";
    }
}
