package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int funds = 30;
        int cash = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the amount to withdraw:  ");
            cash = sc.nextInt();

            if (funds < cash) {
                System.out.println("The amount requested exceeds your funds of EUR " + funds);
            } else if (funds >= cash && cash % 5 == 0) {
                System.out.println("Take your money");
                funds = funds - cash;
                System.out.println("Your balance is EUR " + funds);

                if (funds == 0) {
                    System.out.println("You have no money left on your card");
                    break;
                }
            } else if (cash % 5 != 0) {
                System.out.println("Impossible to withdraw requested amount");
            }
        }
    }
}
