package bankSystem;

public class TransferRunnable implements Runnable {

	private double transferAmount;
	private Account recipient;
	private Account payee;
	

	public TransferRunnable(Account payee, Account recipient, double transferAmount)
	{
		this.payee = payee;	
		this.recipient = recipient;
		this.transferAmount = transferAmount;
				
	}
		
	@Override
	public void run() {
		try {
			payee.transferMoney(transferAmount, recipient);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}