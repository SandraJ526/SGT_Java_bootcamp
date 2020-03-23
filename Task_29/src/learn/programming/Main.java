package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 0, 1, 1, 1, 1};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                System.out.println(numbers[i]);

            } else if (numbers[i] == 0) {
                break;
            }
        }
    }
}


