package ChallengeFive;

public class Main {
    public static void main(String[] args) {

        CheckingAccount account1 = new CheckingAccount(500, AccountType.CHECKING);
        account1.checkBalance();
        account1.deposit(500);

        SavingsAccount account2 = new SavingsAccount(500, AccountType.SAVINGS);
        account2.checkBalance();
        account2.deposit(500);

    }
}
