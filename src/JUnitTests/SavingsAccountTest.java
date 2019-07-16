package JUnitTests;

import bankSystem.SavingsAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavingsAccountTest {
    private SavingsAccount account;

    @Before
    public void setUp() throws Exception {
        account = new SavingsAccount("acc", 10);
    }

    @Test
    public void withdrawWithinLimit() {
        assertTrue(account.withdraw(5));
        assertEquals(4.5, account.getBalance(), 0.009);
    }

    @Test
    public void withdrawOutsideLimit() {
        assertFalse(account.withdraw(15));
        assertEquals(10, account.getBalance(), 0.009);
    }

    @Test
    public void withdrawAtLimit() {
        assertTrue(account.withdraw(9.5));
        assertEquals(0, account.getBalance(), 0.009);
    }
}