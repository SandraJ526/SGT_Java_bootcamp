package learn.programming;

public class Main {

    public static void main(String[] args) {
        String string1 = "Name";
        String string2 = "Surname";
        String string3 = "City";
        String string4 = "Country";

        System.out.println(string3 + " " + string4);
        System.out.println(string3.concat(", ").concat(string4));

        StringBuilder sb = new StringBuilder();
        sb.append(string1.substring(0, 1));
        sb.append(".");
        sb.append(string2);
        System.out.println(sb.toString());
    }
}
