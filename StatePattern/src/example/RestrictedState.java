package example;

public class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        double balance = account.getBalance() + amount;
        account.setBalance(account.getBalance() + amount);
        stateCheck(balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败！");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public boolean stateCheck(double balance) {
        if (balance > 0) {
            account.setState(new NormalState(this));
        } else if (balance > -2000) {
            account.setState(new OverdraftState(this));
        }
        return true;
    }
}
