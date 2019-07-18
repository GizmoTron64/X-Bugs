package bankSystemUnitTests;

import bankSystem.DepositRunnable;
import bankSystem.SavingsAccount;
import bankSystem.WithdrawRunnable;

public class SavingsWithdrawTest {
    public static void main(String[] args) throws InterruptedException {
        SavingsAccount account = new SavingsAccount("Account A (Current)", 0);

        Thread thread1 = new Thread(new WithdrawRunnable(account, 800));
        Thread thread2 = new Thread(new DepositRunnable(account, 1000));

        thread1.start();
        thread2.start();

        thread1.join(3000);
        thread2.join(3000);
        assert account.getBalance() == 199.5: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: 199.50";
    }
}
