package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Please enter an integer: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            try {
                int inputNumber = Integer.parseInt(input);
                System.out.println("Entered number = " + input);
                return;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
