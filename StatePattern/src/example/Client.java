package example;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("用户1", 0.0);
        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(5000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();
    }
}
