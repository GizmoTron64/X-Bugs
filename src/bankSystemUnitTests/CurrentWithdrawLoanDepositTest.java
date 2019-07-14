package bankSystemUnitTests;

import bankSystem.CurrentAccount;
import bankSystem.DepositRunnable;
import bankSystem.LoanAccount;
import bankSystem.WithdrawRunnable;

public class CurrentWithdrawLoanDepositTest {
    public static void main(String[] args) throws InterruptedException {
        CurrentAccount account = new CurrentAccount("Current Account", 0);
        LoanAccount loanAccount = new LoanAccount("Loan Account", 100, account);

        assert account.getBalance() == 100: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: 100.00";
        assert loanAccount.getBalance() == -100: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: -100.00";

        Thread thread1 = new Thread(new WithdrawRunnable(account, 800));
        Thread thread2 = new Thread(new DepositRunnable(loanAccount, 1000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assert account.getBalance() == 200: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: 200.00";
        assert loanAccount.getBalance() == 0: "Incorrect Balance. Balance: " + account.getBalance() + " Expected Balance: 300.00";
    }
}
