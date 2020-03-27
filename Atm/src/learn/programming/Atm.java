package learn.programming;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Atm {

    public Atm(int balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be 0 or more");
        }
        this.balance = balance;
    }

    private int balance;
    private List<Account> accounts = new ArrayList<>();

    public String checkCard(@NotNull Card card, short PIN) {

//        if(card == null) {
//            return "";
//        }

        if (!card.isPINValid(PIN)) {
            return "";
        }
        return card.getAccountNumber(PIN);
    }

    public GetMoneyEnum getMoney(Card card, short PIN, int amount) {
        var accountNumber = checkCard(card, PIN);

        if (accountNumber.isEmpty()) {
            return GetMoneyEnum.INVALID_PIN;
        }

        var account = findAccountByNumber(accountNumber);

        if (accountNumber == null) {
            return GetMoneyEnum.ACCOUNT_IS_NOT_FOUND;
        }

        if (amount > balance) {
            return GetMoneyEnum.ATM_HAS_NO_FUNDS;
        }

        var result = account.getMoney(amount);

        if (result == GetMoneyEnum.TAKE_YOUR_MONEY) {
            balance -= amount;
            return GetMoneyEnum.TAKE_YOUR_MONEY;
        }
        return GetMoneyEnum.NOT_ENOUGH_FUNDS;
    }

    public PutMoneyEnum putMoney(Card card, short PIN, int amount) {

        var accountNumber = checkCard(card, PIN);

        if (accountNumber.isEmpty()) {
            return PutMoneyEnum.INVALID_PIN;
        }

        var account = findAccountByNumber(accountNumber);

        if (accountNumber == null) {
            return PutMoneyEnum.ACCOUNT_IS_NOT_FOUND;
        }

        account.addMoney(amount);
        balance += amount;

        return PutMoneyEnum.OK;
    }

    public CheckBalanceResult checkBalance(Card card, short PIN) {
        var accountNumber = checkCard(card, PIN);

        if (accountNumber.isEmpty()) {
            return new CheckBalanceResult(0, CheckBalanceEnum.INVALID_PIN);
        }

        var account = findAccountByNumber(accountNumber);

        if (accountNumber == null) {
            return new CheckBalanceResult(0, CheckBalanceEnum.ACCOUNT_IS_NOT_FOUND);
        }
        return new CheckBalanceResult(account.getBalance(), CheckBalanceEnum.OK);

    }

    public void addAccount(Account account) {
        if (account == null || account.getNumber().isEmpty()) {
            return;
        }

        accounts.add(account);
    }

    private Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
