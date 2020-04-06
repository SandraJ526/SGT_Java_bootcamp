package learn.programming;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = sc.nextLine();

        printMyName(name, surname);
    }

    public static void printMyName(@NotNull String name, String surname) {

        System.out.println(name.substring(0, 1) + "." + surname);
    }
}
