package example;

public class OverdraftState extends AccountState {
    public OverdraftState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        double balance = account.getBalance() + amount;
        account.setBalance(balance);
        stateCheck(balance);
    }

    @Override
    public void withdraw(double amount) {
        double balance = account.getBalance() - amount;
        if (stateCheck(balance)) {
            account.setBalance(account.getBalance() - amount);
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public boolean stateCheck(double balance) {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
            return false;
        }
        return true;
    }
}
