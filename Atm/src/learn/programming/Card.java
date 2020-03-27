package learn.programming;

public class Card {

    public Card(short PIN, String accountNumber) {
        this.PIN = PIN;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private short PIN;
    private String accountNumber;

    public boolean isPINValid(short PIN) {
        return this.PIN == PIN;
    }

    public PINChangeEnum changePIN(short newPin, short oldPIN) {
        if (oldPIN == this.PIN) {
            this.PIN = newPin;
            return PINChangeEnum.PIN_CHANGED;
        }
        return PINChangeEnum.INVALID_PIN;
    }

    public String getAccountNumber(short PIN) {
        if (isPINValid(PIN)){
            return accountNumber;
        }
        return "";
    }
}


