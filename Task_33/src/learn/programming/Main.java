package learn.programming;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Juris", "Egils"};
        int[] studentGrades1 = {6, 7, 8, 9};
        int[] studentGrades2 = {5, 10, 6, 8};

        double sum1 = IntStream.of(studentGrades1).sum();
        double sum2 = IntStream.of(studentGrades2).sum();

        DecimalFormat df = new DecimalFormat(("#.##"));
        System.out.println(names[0] + " average grade = " + df.format(sum1 / studentGrades1.length));
        System.out.println(names[1] + " average grade = " + df.format(sum2 / studentGrades2.length));
    }
}

