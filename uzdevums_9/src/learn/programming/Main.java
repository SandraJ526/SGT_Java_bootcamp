package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter number: ");

        var number = input.nextInt();

        if (number >= 0 && number <= 10) {
            System.out.println("A");
        } else if (number > 10) {
            System.out.println("B");
        } else {
            System.out.println("");
        }
    }
}
