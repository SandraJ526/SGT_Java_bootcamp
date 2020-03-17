package learn.programming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = userInput.nextLine();

        System.out.println("Please enter your surname: ");
        String surname = userInput.nextLine();

        System.out.println("Your full name is " + name + " " + surname);

    }
}
