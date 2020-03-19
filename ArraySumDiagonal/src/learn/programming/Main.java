package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 3, 11, 5, -7},
                {4, 6, 15, 7, -9},
                {5, 4, 35, 4, -1},
                {6, 1, 64, 9, -2},
                {7, 8, 23, 3, -3}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println(numbers[0][i]);
                sum += numbers[0][i];
            }
        }
        System.out.println("Sum of values is: " + sum);

        for (int i = 0; i <numbers.length ; i++) {

                System.out.println(numbers[i][i]);
                sum += numbers[i][i];
            }
         System.out.println("Sum of values is: " + sum);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if ((i + j) == numbers.length-1) {

                    System.out.println(numbers[i][j]);
                    sum += numbers[i][j];
                }
            }
        }
        System.out.println("Sum of values is: " + sum);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == (numbers.length- (j + 3))) {

                    System.out.println(numbers[i][j]);
                    sum += numbers[i][j];
                }
            }
        }
        System.out.println("Sum of values is: " + sum);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j == (numbers.length + (i - 4))) {

                    System.out.println(numbers[j][i]);
                    sum += numbers[j][i];
                }
            }
        }
        System.out.println("Sum of values is: " + sum);

    }
}









