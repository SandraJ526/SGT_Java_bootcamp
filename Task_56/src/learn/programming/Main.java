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

            if (input.equals("")) {
                System.out.println("Nothing has been entered");
            } else {
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
            }
        }
    }
}





