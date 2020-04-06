package learn.programming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3} ;
        printArrayValues(numbers);

        String[] letters = {"as", "zx", "qw"};
        printArrayValues(letters);
    }

    public static void printArrayValues (int[]array){
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void printArrayValues(String[] array){
        Arrays.stream(array).forEach(System.out::println);
    }
}
