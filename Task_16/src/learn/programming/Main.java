package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isHungry;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Are you hungry? True/False");
        isHungry = userInput.nextBoolean();

        if(isHungry){
            System.out.println("Your dinner is ready");
        } else {
            System.out.println("No dinner for you");
        }
    }
}
