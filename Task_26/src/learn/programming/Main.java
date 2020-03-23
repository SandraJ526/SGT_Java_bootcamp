package learn.programming;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Jana", "Alise", "Jānis", "Daiga", "Juris", "Elga"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {

            if (names[i].substring(0, 1).equals("J")) {
                System.out.print(names[i] + " ");
            }
        }
    }
}

