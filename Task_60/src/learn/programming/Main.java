package learn.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Chair chair1 = new Chair("armchair", "leather", (short) 97, (short) 98, 423.99);
        Chair chair4 = new Chair("armchair", "linen", (short) 97, (short) 98, 483.99);
        Chair chair2 = new Chair("stool", "wood", (short) 52, (short) 35, 146.99);
        Chair chair3 = new Chair("dining", "wicker", (short) 98, (short) 67, 299.99);

        List<Chair> chairs = new ArrayList<>();
        chairs.add(chair1);
        chairs.add(chair2);
        chairs.add(chair3);
        chairs.add(chair4);

        List<Chair> armchairs = chairs.stream()
                .filter(chair -> chair.getType().equals("armchair"))
                .collect(Collectors.toList());

//        for (Chair chair: armchairs) {
//            System.out.println(chair);
//        }

        System.out.println(armchairs);
    }
}
