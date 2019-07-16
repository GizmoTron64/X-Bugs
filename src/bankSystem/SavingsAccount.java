package bankSystem;
import java.util.concurrent.TimeUnit;

public class SavingsAccount extends Account {

	private double fee;

	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		this.fee = 0.5;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " from " + name + "...");
		boolean waiting = true;
		balanceLock.lock();
		try {
			while (balance - (amount + fee) < 0) {
				if (!waiting) {
					Thread.currentThread().interrupt();
				} else {
					System.out.println("Waiting for funds to become available...");
				}
				waiting = fundsAvailableCondition.await(TIMEOUT, TimeUnit.SECONDS);
			}
			this.balance -= (amount + fee);
			getBalance();
			return true;

		} catch (InterruptedException e) {

			System.out.println("Can't withdraw " + amount + " from account with balance " + balance);
			return false;
		} finally {
			balanceLock.unlock();
		}
	}

}
