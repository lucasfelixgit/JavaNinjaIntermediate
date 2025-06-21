package ChallengeFive;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(double balance, AccountType accountType) {
        super(balance, accountType);
    }

    @Override
    public void checkBalance() {
        System.out.println("KONOHA BANK 🥷🏦");
        System.out.println("Checking Account - Balance");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println();
    }

    @Override
    public void deposit(double value) {

        System.out.println("KONOHA BANK 🥷🏦");
        System.out.println("Checking Account - Deposit");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println("📩 You're depositing: $" + value);
        System.out.println("Loading...");

        balance += value;

        System.out.println("Deposit Done!");
        System.out.println("💵 Current Balance: $" + balance);
        System.out.println();

    }

}
