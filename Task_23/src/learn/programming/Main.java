package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 5, 4, 9, 12, 99, 243, 1, -6, 24, 15, 23};

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("Min value = " + minValue);
    }
}
