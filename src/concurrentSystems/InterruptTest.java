package concurrentSystems;

public class InterruptTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        InterruptIncRunnable int1 = new InterruptIncRunnable(inc, 5);
        LockIncRunnable int2 = new LockIncRunnable(inc, 5);

        int1.start();
        int2.start();

        try {
            int1.join(9000);
            int2.join(9000);
        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 10: "Incorrect count value. Count = " + inc.getCount() + " Expected Count = 10";
    }


}
