package learn.programming;

public class Main {

    public static void main(String[] args) {

        Parents father = new Parents("Man", "Super");
        Children son = new Children("Kid", "Super", "Kiddo");

        father.voiceOfTheParents();
        son.messageFromChildrenClass();
    }
}
