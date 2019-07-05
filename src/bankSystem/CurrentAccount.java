package bankSystem;
import java.util.concurrent.TimeUnit;

public class CurrentAccount extends Account {

	private final double overdraftLimit;

	public CurrentAccount(String name, double initialBalance) {
		super(name, initialBalance);
		this.overdraftLimit = -50;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " from " + name + "...");
		boolean waiting = true;
		balanceLock.lock();
		try {
			while (balance - amount < overdraftLimit) {
				if (!waiting)
					Thread.currentThread().interrupt();
				else
					System.out.println("Waiting for funds to become available...");
				waiting = fundsAvailableCondition.await(TIMEOUT, TimeUnit.SECONDS);
			}

			this.balance -= amount;
			getBalance();
			return true;

		} catch (InterruptedException e) {
			System.out.println("Can't withdraw " + amount + " from account with balance " + balance);
			return false;
		} finally {
			balanceLock.unlock();
		}
	}

	public void setUpStandingOrder(double amount, Account recipient, int frequency) {

	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}
}
