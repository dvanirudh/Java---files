// 31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".


public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(300);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
