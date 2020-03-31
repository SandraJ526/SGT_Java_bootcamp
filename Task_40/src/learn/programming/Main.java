package learn.programming;

public class Main {

    public static void main(String[] args) {
        String[] names = {"jānis", "pēteris", "andris", "sergejs", "antons"};

        for (var name : names) {
            if (name.contains("a") || name.contains("ā")) {
                System.out.println(name);
            }
        }
    }
}
