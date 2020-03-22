package learn.programming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       String [] names = { "Jānis", "Pēteris", "Andris"};
        System.out.println(names[1]);
        names[2] = "Jēkabs";
        System.out.println(Arrays.toString(names));
    }
}
