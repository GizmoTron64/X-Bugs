package bankSystemUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.WithdrawRunnable;

public class CurrentDoubleWithdraw {

    public static void main(String[] args) throws InterruptedException {
        CurrentAccount account = new CurrentAccount("Account A (Current)", 0);

        Thread thread1 = new Thread(new WithdrawRunnable(account, 40));
        Thread thread2 = new Thread(new WithdrawRunnable(account, 20));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assert (account.getBalance() == -40) | (account.getBalance() == -20): "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: -40.00 or -20.00";
    }
}
