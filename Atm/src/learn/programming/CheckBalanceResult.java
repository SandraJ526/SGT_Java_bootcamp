package learn.programming;

public class CheckBalanceResult {

    public CheckBalanceResult (double balance, CheckBalanceEnum checkStatus) {
        this.balance = balance;
        this.checkStatus = checkStatus;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    private CheckBalanceEnum checkStatus;

    public CheckBalanceEnum getCheckStatus() {
        return checkStatus;
    }
}
