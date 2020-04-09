package lv.tasks;

import java.util.ArrayList;
import java.util.List;

public class IntegerArray {

    public static void getOnlySmallValues(int[] array) {

        List<Integer> smallValues = new ArrayList<>();
        for (var value : array) {
            if (value < 5) {
                smallValues.add(value);
            }
        }
        System.out.println(smallValues.toString());
    }
}
