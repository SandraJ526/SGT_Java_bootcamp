package learn.programming;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Mirdza", "Gustavs", "Aiga", "Kristofers", "Inta"};

        for (int i = 0; i < names.length; i++) {
            do {
                System.out.println(names[i]);
                i += 1;
            } while (i < names.length);
        }
    }
}
