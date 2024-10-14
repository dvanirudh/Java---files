// 31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".

public class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawalAmount;

    // Constructor accepting balance and withdrawalAmount
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    // Override the getMessage() method to provide a custom exception message
    @Override
    public String getMessage() {
        return "Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount;
    }
    
}
