package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        var timesToRepeat = 0;

        while (true) {
            System.out.println("Please enter an integer: ");

            if (input.hasNextInt()) {
                timesToRepeat = input.nextInt();
                for (int i = 0; i < timesToRepeat; i++) {
                    System.out.println("Hello World");
                }
                break;
            } else {
                System.out.println("Invalid input");
                input.next();
            }
        }
    }
}





