package learn.programming;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printNameSurname(getNameSurname());
    }
    @NotNull
    public static String getNameSurname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = sc.nextLine() + " ";
        System.out.println("Please enter surname: ");
        String surname = sc.nextLine();

        var fullName = name.substring(0,1).toUpperCase() + name.substring(1)
                      + surname.substring(0,1).toUpperCase()+ surname.substring(1);

        return fullName;
    }

    public static void printNameSurname(String fullName) {
        System.out.println(fullName);
    }
}
