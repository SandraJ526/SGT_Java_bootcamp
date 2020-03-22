package learn.programming;

public class Main {

    public static void main(String[] args) {

        boolean toRepeat = true;
        int cycle = 0;

        while (cycle < 20) {

            System.out.print(toRepeat + " ");
            cycle += 1;
            System.out.println(cycle);
        }
        toRepeat = false;
        System.out.println(toRepeat);
    }
}
