package ChallengeFive;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double balance, AccountType accountType) {
        super(balance, accountType);
    }

    @Override
    public void checkBalance() {
        System.out.println("KONOHA BANK 🥷🏦");
        System.out.println("Savings Account - Balance");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println();
    }

    @Override
    public void deposit(double value) {

        System.out.println("KONOHA BANK 🥷🏦");
        System.out.println("Savings Account - Deposit");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println("📩 You're depositing: $" + value);
        System.out.println("Loading...");

        balance += (value - (value * 0.01));

        System.out.println("Deposit Done! (As you're using savings account, 1% of the value deposited was deduced)");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println();

    }
}
