package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 56, 77, 89, 34, 22, 2, 3, 4, 8};

        int i = 0;

        while (true) {
            System.out.println(numbers[i]);
            i++;
            if (numbers[i] == 22) {
                break;
            }
        }
    }
}

