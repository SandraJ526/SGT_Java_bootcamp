package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = sc.nextLine();
        printNameSurname(name);

        System.out.println("Please enter surname: ");
        String surname = sc.nextLine();

        printNameSurname(name, surname);
    }

    public static void printNameSurname(String name) {
        System.out.println(name);
    }

    public static void printNameSurname(String name, String surname) {
        if (surname.isBlank()) {
            surname = "Nezināms";
        }
        System.out.println(name + " " + surname);
    }
}
