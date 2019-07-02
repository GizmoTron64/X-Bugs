package bankSystemUnitTests;

import bankSystem.CurrentAccount;

public class AccountTest implements Runnable {
    private CurrentAccount account;
    private Thread thread;

    public AccountTest() {
        account = new CurrentAccount("acc", 0.0);
        thread = new Thread(this, "thread");
        thread.start();

    }

    public void run() {
        System.out.println("Account: " + account.getAccountNumber());
        testGetAccountNumber();
    }

    public void testGetAccountNumber() {
        assert false: account.getAccountNumber();
    }

}
