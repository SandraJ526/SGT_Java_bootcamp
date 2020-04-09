package learn.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        String choice = "";

        while (true) {

            System.out.println("Please enter a word: ");
            input = sc.nextLine();
            input = input.replaceAll("\\s+","");

            if (input.equals("")) {
                System.out.println("Nothing has been entered");
            } else if (input.matches("\\p{IsAlphabetic}+")) {
                words.add(input);

                System.out.println("\nPress any key to continue \nPress N to exit");
                choice = sc.nextLine().toUpperCase();

                if (choice.equals("N")) {
                    System.out.println("\nTo print out the words- press any key \nPress N to exit");
                    choice = sc.nextLine().toUpperCase();

                    if (choice.equals("N")) {
                        break;
                    } else {
                        System.out.println("\nYour words: " + words.toString());
                        break;
                    }
                }
            } else {
                System.out.println("Invalid input. The word must contain only letters.");
            }
        }
    }
}





