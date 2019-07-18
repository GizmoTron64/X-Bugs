package bankSystemUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.DepositRunnable;
import bankSystem.TransferRunnable;
import bankSystem.WithdrawRunnable;

public class CurrentTransferDepositWithdrawTest {

    public static void main(String[] args) throws InterruptedException {
        CurrentAccount sender = new CurrentAccount("Account A (Current)", 0);
        CurrentAccount receiver = new CurrentAccount("Account B (Current)", 0);

        Thread thread1 = new Thread(new WithdrawRunnable(sender, 800));
        Thread thread2 = new Thread(new TransferRunnable(sender, receiver, 100));
        Thread thread3 = new Thread(new DepositRunnable(sender, 1000));

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join(3000);
        thread2.join(3000);
        thread3.join(3000);
        assert sender.getBalance() == 100 : "Incorrect Balance. Balance: " + sender.getBalance() + " Expected Balance: 100.00";
        assert receiver.getBalance() == 100 : "Incorrect Balance. Balance: " + receiver.getBalance() + " Expected Balance: 100.00";
    }
}

