package learn.programming;

public class Main {

    public static void main(String[] args) {

        int waterLitres = 3;
        int[] containers = {1,2,4,6,8};

        for (int i = 0; i < containers.length; i++) {

            if (containers[i] >= waterLitres)
                System.out.println("You can use " + containers[i] + " L container");
        }
    }
}
