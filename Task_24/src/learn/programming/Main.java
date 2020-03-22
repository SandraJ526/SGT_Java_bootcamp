package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 25, 53, 7, 39, 13, -2, 8};

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("Max value = " + maxValue);
    }
}
