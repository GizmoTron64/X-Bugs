package bankSystemUnitTests;

import bankSystem.CurrentAccount;

public class CurrentAccountTest implements Runnable{
    private CurrentAccount account;
    private Thread t1;
    private Thread t2;

    public CurrentAccountTest() {
        account = new CurrentAccount("current", 15);
        t1 = new Thread(this, "t1");
        t2 = new Thread(this, "t2");
        t1.start();
        t2.start();
    }

    public void run(){
        System.out.println("---TESTING CURRENT ACCOUNT---");
        testGetOverdraftLimit();
        testWithdrawOutsideLimit();
        testWithdrawWithinLimit();
        System.out.println("---TESTING CURRENT ACCOUNT COMPLETE---");
    }

    public void testWithdrawWithinLimit() {
        account.deposit(20);
        double balance = account.getBalance();
        assert account.withdraw(10): "Testing Withdrawal. Withdrawal unsuccessful";
        assert balance - account.getBalance() == 10: "Testing Withdrawal. Incorrect balance. \nBalance: " + account.getBalance() + "\n Expected Balance: " + (balance-10);
    }

    public void testWithdrawOutsideLimit() {
        double balance = account.getBalance();
        assert !account.withdraw(balance - account.getOverdraftLimit()): "Testing Withdrawal. Invalid withdrawal occurred";
        assert balance == account.getBalance(): "Testing Withdrawal. Incorrect balance. \nBalance: " + account.getBalance() + "\n Expected Balance: " + balance;
    }

    public void testGetOverdraftLimit() {
        assert account.getOverdraftLimit() == -50: "Testing getOverdraftLimit. Incorrect Overdraft limit. \nOverdraft limit: " + account.getOverdraftLimit() + "\nExpected: -50";
    }
}
