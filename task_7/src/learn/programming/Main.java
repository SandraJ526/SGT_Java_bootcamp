package learn.programming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;

        while (true) {

            System.out.println("Please enter a number from 0 - 20: ");
            x = input.nextInt();

            if (x >= 0 && x <= 20) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

        while (true) {
            System.out.println("Please enter a number from 30 - 50: ");
            y = input.nextInt();

            if (y >= 30 && y <= 50) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
    }
}


