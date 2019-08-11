package bankSystemUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.DepositRunnable;
import bankSystem.TransferRunnable;

public class CurrentTransferTest {
    public static void main(String[] args) throws InterruptedException {
        CurrentAccount sender = new CurrentAccount("Current Account Sender", 0);
        CurrentAccount receiver = new CurrentAccount("Current Account Receiver", 0);

        Thread thread1 = new Thread(new TransferRunnable(sender, receiver, 100));
        Thread thread2 = new Thread(new DepositRunnable(sender, 100));

        thread1.start();
        thread2.start();

        thread1.join(3000);
        thread2.join(3000);

        assert sender.getBalance() == 0: "Incorrect Balance. Balance: " + sender.getBalance() + " Expected Balance: 0.00";
        assert receiver.getBalance() == 100: "Incorrect Balance. Balance: " + receiver.getBalance() + " Expected Balance: 100.00";

    }
}
