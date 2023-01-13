package example;

public class NormalState extends AccountState {
    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState state) {
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
        System.out.println("正常状态，无需支付利息！");
    }

    @Override
    public boolean stateCheck(double balance) {
        if (balance > -2000 && balance <= 0) {
            account.setState(new OverdraftState(this));
        } else if (balance == -2000) {
            account.setState(new RestrictedState(this));
        } else if (balance < -2000) {
            System.out.println("操作受限！");
            return false;
        }
        return true;
    }
}
