package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Your name is " + userName);
    }
}
