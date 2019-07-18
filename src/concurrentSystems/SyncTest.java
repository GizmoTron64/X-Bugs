package concurrentSystems;

public class SyncTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        SyncIncRunnable sync1 = new SyncIncRunnable( inc, 3, 2 );
        SyncIncRunnable sync2 = new SyncIncRunnable( inc, 3, 2 );

        sync1.start();
        sync2.start();

        try {
            sync1.join(3000);
            sync2.join(3000);
        } catch(Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 18: "Incorrect x value. x = " + inc.getCount() + " Expected x = 18";
    }
}
