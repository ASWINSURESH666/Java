package QUESTION_7;

abstract class Account {
    String accountHolderName;
    String accountNumber;
    double balance;

    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public abstract void withdrawal(double amount);
}

class SavingsAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdrawal(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Minimum balance should be maintained.");
        }
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdrawal(double amount) {
        double overdraftLimit = balance * 0.05;
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. You can withdraw up to: " + (balance + overdraftLimit));
        }
    }
}

