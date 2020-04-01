package learn.programming;

public class Main {

    public static void main(String[] args) {

        //black large square "\u2B1B"
        //white large square "\u2B1C"

        String[][] patterns = new String[5][5];

        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (i == j || j == patterns.length - i - 1) {
                    patterns[i][j] = "\u2B1B" + " ";
                } else {
                    patterns[i][j] = "\u2B1C" + " ";
                }
                System.out.print(patterns[i][j]);
            }
            System.out.println();
        }
    }
}
