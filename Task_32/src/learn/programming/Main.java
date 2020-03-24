package learn.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        String[] arrLetters = {"ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO"};
        System.out.println("Original Array:     " + Arrays.toString(arrLetters));

        LinkedHashSet<String> linkedHashSetLetters = new LinkedHashSet<>(Arrays.asList(arrLetters));
        String[] editedArrLetters = linkedHashSetLetters.toArray(new String[linkedHashSetLetters.size()]);

        System.out.println("Without duplicates: " + Arrays.toString(editedArrLetters));

        ArrayList<String> editedArrList = new ArrayList<>();

        for (int i = 0; i < arrLetters.length; i++) {

            if (!editedArrList.contains(arrLetters[i])) {
                editedArrList.add(arrLetters[i]);
            }
        }
        arrLetters = editedArrList.toArray(new String[editedArrList.size()]);

        System.out.println("Without duplicates: " + Arrays.toString(arrLetters));
    }
}




