package concurrentSystems;

public class InterruptTest {
    public static void main(String args[]) {
        Incrementer inc = new Incrementer();
        InterruptIncRunnable int1 = new InterruptIncRunnable(inc, 5);
        InterruptIncRunnable int2 = new InterruptIncRunnable(inc, 5);

        int1.start();
        int2.start();

        try {
            int1.join(3000);
            int2.join(3000);
        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        assert inc.getCount() == 10: "Incorrect x value. x = " + inc.getCount() + " Expected x = 10";
    }


}
