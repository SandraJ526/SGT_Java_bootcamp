package learn.programming;

import com.sun.jdi.connect.Connector;

public class Account {

    public Account(String number, double balance, Person owner) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be greater or equal to 0");
        }

        if (number.length() != 34) {
            throw new IllegalArgumentException("Invalid account number");
        }

        if (owner == null){
            throw new IllegalArgumentException("Account must have owner");
        }

        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    private String number;

    public String getNumber() {
        return number;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public double checkBalance() {
        return balance;
    }

    public void addMoney(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
    }

    public GetMoneyEnum getMoney(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (amount <= balance) {
            balance -= amount;
            return GetMoneyEnum.TAKE_YOUR_MONEY;
        }
        return GetMoneyEnum.NOT_ENOUGH_FUNDS;
    }

}
