package concurrentSystems;

public class LockTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        LockIncRunnable lock1 = new LockIncRunnable(inc, 5);
        LockIncRunnable lock2 = new LockIncRunnable(inc, 5);

        lock1.start();
        lock2.start();

        try {
            lock1.join(3000);
            lock2.join(3000);
        } catch(Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 10: "Incorrect x value. x = " + inc.getCount() + " Expected x = 10";
    }
}
