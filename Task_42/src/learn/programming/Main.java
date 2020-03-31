package learn.programming;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int[][] randomArr = new int[5][5];

        Random r = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            for (int j = 0; j < randomArr.length; j++) {
                randomArr[i][j] = r.nextInt(25);
            }
        }
        System.out.println(Arrays.deepToString(randomArr));
    }
}
