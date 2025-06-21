package ChallengeFive;

public abstract class BankAccount implements Account {

    double balance;
    AccountType accountType;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public BankAccount(double balance, AccountType accountType) {
        this(balance);
        this.accountType = accountType;
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
