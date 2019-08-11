package JUnitTests;

import bankSystem.Account;
import bankSystem.CurrentAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new CurrentAccount("acc", 0);
    }

    @Test
    public void getAccountNumber() {
        assertEquals(0, account.getAccountNumber());
    }

    @Test
    public void getBalance() {
        assertEquals(0, account.getBalance(),0.009);
    }

    @Test
    public void deposit() {
        account.deposit(10);
        assertEquals(10, account.getBalance(), 0.009);
    }

    @Test
    public void transferMoneyValid() {
        Account sender = new CurrentAccount("recipient", 15);
        sender.transferMoney(10, account);
        assertEquals(5, sender.getBalance(), 0.009);
        assertEquals(10, account.getBalance(), 0.009);
    }

    @Test
    public void transferMoneyInvalid() {
        Account sender = new CurrentAccount("recipient", -45);
        sender.transferMoney(10, account);
        assertEquals(-45, sender.getBalance(), 0.009);
        assertEquals(0, account.getBalance(), 0.009);
    }

        @Test
    public void getName() {
        assertEquals("acc", account.getName());
    }
}