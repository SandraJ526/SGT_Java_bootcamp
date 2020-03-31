package learn.programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {4, 68, 7, 12, 56, 33, 1, 90, 4};
        int count = 0;
        ArrayList<Integer> newNumbers = new ArrayList();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 15) {
                newNumbers.add(numbers[i]);
            }
        }
        System.out.println(newNumbers);
    }
}

