package JUnitTests;

import bankSystem.CurrentAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentAccountJUnitTest {
    private CurrentAccount account;

    @Before
    public void setUp() throws Exception {
        account = new CurrentAccount("acc", 0);
    }

    @Test
    public void withdrawWithinLimit() {
        assertTrue(account.withdraw(10));
        assertEquals(-10, account.getBalance(), 0.009);
    }

    @Test
    public void withdrawOutsideLimit() {
        assertFalse(account.withdraw(50.01));
        assertEquals(0, account.getBalance(), 0.009);
    }

    @Test
    public void getOverdraftLimit() {
        assertEquals(-50, account.getOverdraftLimit(), 0.009);
    }
}