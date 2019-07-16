package JUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.LoanAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoanAccountTest {
    private LoanAccount account;
    private CurrentAccount parent;

    @Before
    public void setUp() throws Exception {
        parent = new CurrentAccount("parent",0);
        account = new LoanAccount("acc",100, parent);

    }

    @Test
    public void withdraw() {
        assertFalse(account.withdraw(10));
        assertEquals(-100,account.getBalance(), 0.009);
    }

    @Test
    public void depositWithinLimit() {
           account.deposit(10);
           assertEquals(-90, account.getBalance(), 0.009);
    }

    @Test
    public void depositOutsideLimit() {
        account.deposit(110);
        assertEquals(0, account.getBalance(), 0.009);
        assertEquals(110, parent.getBalance(), 0.009);
    }

    @Test
    public void depositAtLimit() {
        account.deposit(100);
        assertEquals(0, account.getBalance(), 0.009);
        assertEquals(100, parent.getBalance(), 0.009);
    }
}