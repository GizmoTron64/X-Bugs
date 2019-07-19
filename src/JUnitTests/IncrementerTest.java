package JUnitTests;

import concurrentSystems.Incrementer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncrementerTest {
    private Incrementer inc;

    @Before
    public void setUp() throws Exception {
        inc = new Incrementer();
    }

    @Test
    public void increment() {
        inc.increment(5);
        assertEquals(5, inc.getCount());
    }

    @Test
    public void incrementLocked() {
        inc.incrementLocked(5);
        assertEquals(5, inc.getCount());
    }

    @Test
    public void multiplier() {
        inc.setCount(5);
        inc.multiplier(2);
        assertEquals(10, inc.getCount());
    }

    @Test
    public void incrementInterrupt() {
        inc.incrementInterrupt(5);
        assertEquals(5, inc.getCount());
    }

    @Test
    public void getCount() {
        assertEquals(0, inc.getCount());
        inc.setCount(3);
        assertEquals(3, inc.getCount());
    }
}