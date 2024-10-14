
//  27. Write a program to create an interface called account operation 
// with methods deposit(), getBalance().Implement this interface in Account class.





public class Account implements AccountOperations {
   private double balance;

   public Account(double initialBalance){
    this.balance = initialBalance;
   }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
        return balance;
    }

    @Override
    public double getBalance() {
        return 0;     
    }
    
    public static void main(String[] args) {
        Account account = new Account(3000.0);

        System.out.println("Initial Balance: " + account.getBalance());
        double updatedBalance = account.deposit(200.0);
        System.out.println("Updated Balance after deposit: " + updatedBalance);
    }
    }

