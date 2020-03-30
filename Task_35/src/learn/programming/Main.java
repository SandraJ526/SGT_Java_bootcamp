package learn.programming;

public class Main {

    public static void main(String[] args) {

        boolean[] crossRoads = {true, true, true, true, true, false, true, true, false, true};

        for (int i = 0; i < crossRoads.length; i++) {
            if (!crossRoads[i]) {
                i += 1;
                System.out.println("The crossroad " + i + " is closed.");
            }
        }
    }
}
