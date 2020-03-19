package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter km/h exceeded the speed limit: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput > 30) {
            System.out.println("You lost your driving licence");
        }else if (userInput > 20) {
            System.out.println("The fine for speeding = 30 EUR");
        } else if (userInput > 10) {
            System.out.println("The fine for speeding = 15 EUR");
        } else {
            System.out.println("Safe driving saves life");
        }


    }
}
