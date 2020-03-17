package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the name of an item: ");
        Scanner userInput = new Scanner(System.in);

        String itemName = userInput.nextLine();
        itemName = itemName.substring(0,1).toLowerCase();

        switch (itemName) {
            case "a","b","c","d" :
                System.out.println("The item must be placed on the 1st floor");
                break;
            case "e", "f", "g", "h":
                System.out.println("The item must be placed on the 2nd floor");
                break;
            case "i", "j", "k", "l":
                System.out.println("The item must be placed on the 3rd floor");
                break;
            case "m", "n", "o", "p":
                System.out.println("The item must be placed on the 4th floor");
                break;
            case "r", "s", "t", "u":
                System.out.println("The item must be placed on the 5th floor");
                break;
            default:
                System.out.println("The item must be placed in the basement");
                break;
        }
    }
}
