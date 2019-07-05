package bankSystemUnitTests;

import bankSystem.CurrentAccount;

public class AccountTest implements Runnable {
    private CurrentAccount account;
    private Thread t1;
    private Thread t2;

    public AccountTest() {
        account = new CurrentAccount("acc", 0.0);
        t1 = new Thread(this, "t1");
        t2 = new Thread(this, "t2");
        t1.start();
        t2.start();

    }

    public void run() {
        System.out.println("---TESTING ACCOUNT---");
        System.out.println("Account: " + account.getAccountNumber());
        testGetAccountNumber();
        testGetBalance();
        testDeposit();
        testGetName();
        testTransferMoney();
        System.out.println("---TESTING ACCOUNT COMPLETE---");
    }

    public void testGetAccountNumber() {
        assert account.getAccountNumber() == 0: "Testing getAccountNumber. Incorrect Account Number. \nAcc. No.: " + account.getAccountNumber() + "\nExpected: 0";
    }

    public void testGetBalance() {
        account.withdraw(account.getBalance());
        assert account.getBalance() == 0: "Testing getBalance. Incorrect Balance. \nBalance: " + account.getBalance() + "\nExpected: 0.0";
    }

    public void testDeposit() {
        double balance = account.getBalance();
        account.deposit(10.00);
        assert account.getBalance() == balance + 10: "Testing deposit. Incorrect Balance. \nBalance: " + account.getBalance() + "\nExpected: " + (balance + 10);
    }

    public void testGetName() {
        assert account.getName() == "acc": "Testing getName. Incorrect Account name. \nAcc. Name: " + account.getName() + "\nExpected: acc";
    }

    public void testTransferMoney() {
        CurrentAccount recipient = new CurrentAccount("re", 0.0);
        account.deposit(10.00);
        double senderBalance = account.getBalance();
        double receiverBalance = recipient.getBalance();
        account.transferMoney(10.00, recipient);
        assert senderBalance - account.getBalance() == 10: "Testing transferMoney. Incorrect sender balance. \nBalance: " + account.getBalance() + "\nExpected: " + (senderBalance - 10);
        assert recipient.getBalance() - receiverBalance == 10: "Testing transferMoney. Incorrect sender balance. \nBalance: " + account.getBalance() + "\nExpected: " + (receiverBalance + 10);;
    }





}
