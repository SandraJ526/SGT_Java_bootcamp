package learn.programming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
        System.out.println(name + " " + surname);
        name = name.substring(0, 1);
        System.out.println(name + "." + surname);
    }
}
