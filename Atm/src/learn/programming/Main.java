package learn.programming;

public class Main {

    public static void main(String[] args) {
        Atm atm1 = new Atm(500);

        Person person1 = new Person("Gusts", "Link");
        Person person2 = new Person("Andris", "Berzs");
        Person person3 = new Person("Janis", "Ozols");

        Account account1 = new Account("1111111111111111111111111111111111", 100, person1);
        Account account2 = new Account("2222222222222222222222222222222222", 10, person2);
        Account account3 = new Account("3333333333333333333333333333333333", 50, person3);

        atm1.addAccount(account1);
        atm1.addAccount(account2);
        atm1.addAccount(account3);

        Card card1 = new Card((short) 1111, "1111111111111111111111111111111111");
        Card card2 = new Card((short) 2222, "2222222222222222222222222222222222");
        Card card3 = new Card((short) 3333, "3333333333333333333333333333333333");

        var result1 = atm1.checkBalance(card1, (short)1111);

        if(result1.getCheckStatus() == CheckBalanceEnum.OK) {
            System.out.println("Your balance is: " + result1.getBalance());
        } else if (result1.getCheckStatus() == CheckBalanceEnum.INVALID_PIN) {
            System.out.println("Invalid PIN");
        } else {
            System.out.println("Something bad happened");
        }

        var result2 = atm1.putMoney(card1, (short) 1111, 10);
        var result3 = atm1.checkBalance(card1, (short)1111);

        System.out.println("Your balance is: " + result3.getBalance());

        var result4 = atm1.getMoney(card1, (short) 1111, 50);

        System.out.println(result4);

        var result5 = atm1.getMoney(card1, (short) 1111, 10000000);

        System.out.println(result5);

        var result6 = atm1.getMoney(card1, (short) 1111, 200);

        System.out.println(result6);


    }
}
