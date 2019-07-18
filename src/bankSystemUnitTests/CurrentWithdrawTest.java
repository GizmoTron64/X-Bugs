package bankSystemUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.DepositRunnable;
import bankSystem.WithdrawRunnable;

public class CurrentWithdrawTest {

	public static void main(String[] args) throws InterruptedException {
		CurrentAccount account = new CurrentAccount("Account A (Current)", 0);

		Thread thread1 = new Thread(new WithdrawRunnable(account, 800));
		Thread thread2 = new Thread(new DepositRunnable(account, 1000));

		thread1.start();
		thread2.start();

		thread1.join(3000);
		thread2.join(3000);
		assert account.getBalance() == 200: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: 200.00";
	}
	
}
