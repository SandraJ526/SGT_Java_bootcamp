package learn.programming;

public class Main {

    public static void main(String[] args) {

        printGreeting(3);
    }

    public static void printGreeting(int timesToRepeat) {

        for (int i = 0; i < timesToRepeat; i++) {
            System.out.println("Hello World!");
        }
    }
}
