package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 8, 0, 23};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
