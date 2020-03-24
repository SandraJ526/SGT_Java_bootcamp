package learn.programming;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Jānis", "Juris", "Gatis", "Gundars", "Andris"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            char firstLetter = names[i].charAt(0);
            sb.append(firstLetter);
        }
        String firstLetterChars = sb.toString();
        char[] chars = firstLetterChars.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char i : chars) {
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<Character,Integer> val: map.entrySet()) {
            System.out.println(val.getKey() + "=" + val.getValue());
        }
    }
}
















