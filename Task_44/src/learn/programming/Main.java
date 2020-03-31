package learn.programming;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {23,6,43,78,32,9,83,10};

        int sum= 0;
        for (var number: numbers) {
            if(number > 10){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
