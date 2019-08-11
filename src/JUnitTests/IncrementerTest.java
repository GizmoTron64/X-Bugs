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
        inc.setMillis(0);
        inc.setSecs(0);
    }

    @Test
    public void incrementValid() {
        inc.increment(5);
        assertEquals(5, inc.getCount());
    }

    @Test
    public void incrementInvalid() {
        inc.increment(-1);
        assertEquals(0,inc.getCount());
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
    public void incrementAwaitValid() {
        inc.setCount(1);
        inc.incrementAwait(4);
        assertEquals(5, inc.getCount());

    }

    @Test
    public void incrementAwaitInvalid() {
        inc.incrementAwait(5);
        assertEquals(0, inc.getCount());
    }

    @Test
    public void incrementSignal() {
        inc.incrementSignal(5);
        assertEquals(5, inc.getCount());
    }

    @Test
    public void getCount() {
        assertEquals(0, inc.getCount());
        inc.setCount(3);
        assertEquals(3, inc.getCount());
    }
}