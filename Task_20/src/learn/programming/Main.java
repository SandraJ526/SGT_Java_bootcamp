package learn.programming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {7, 4, 7, 3, 6, 9, 2};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                array[i] = 10;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
