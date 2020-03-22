package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean[] crossroads = new boolean[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < crossroads.length; i++) {
            System.out.println("Does this crossroad has green traffic light on? True/False");
            boolean routeOk = input.nextBoolean();
            crossroads[i] = routeOk;
        }
        for (int i = 0; i < crossroads.length; i++) {
            if (crossroads[i]) {
                System.out.println("Crossroad " + (i + 1) + " is free to go");
            } else {
                System.out.println("There is red light at crossroad " + (i + 1));
            }
        }
    }
}
