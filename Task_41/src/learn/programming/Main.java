package learn.programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 56, 77, 89, 34, 22, 2, 3, 4, 8, 43, 56};
        System.out.println("Original " + (Arrays.toString(numbers)));

        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();
        ArrayList<Integer> group3 = new ArrayList<>();

        for (var number: numbers) {
            if( number >= 0 && number <= 30){
                group1.add(number);
            } else if (number >= 31 && number <= 60){
                group2.add(number);
            } else if( number >= 61 && number <= 90){
                group3.add(number);
            }
        }
        System.out.println("0-30     " + group1);
        System.out.println("31-60    " + group2);
        System.out.println("61-90    " + group3);
    }
}
