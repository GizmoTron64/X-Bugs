package concurrentSystems;

public class SyncTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        SyncIncRunnable sync1 = new SyncIncRunnable( inc, 5 );
        SyncIncRunnable sync2 = new SyncIncRunnable( inc, 5);

        sync1.start();
        sync2.start();

        try {
            sync1.join();
            sync2.join();
        } catch(Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 10: "Incorrect x value. x = " + inc.getCount() + " Expected x = 18";
    }
}
