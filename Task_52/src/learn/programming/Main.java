package learn.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Jānis", "", "Pēteris", "Antons", "", "Andris"};
        printArrayValues(names);
        getNonEmptyArray(names);
    }

    public static void printArrayValues(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void getNonEmptyArray(String[] array) {

        List<String> listFromArray = new ArrayList<String>(Arrays.asList(array));
        listFromArray.removeAll(Arrays.asList("", null));
        System.out.println(listFromArray);
    }
}


