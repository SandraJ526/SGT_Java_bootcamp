package learn.programming;

public class Children extends Parents {

    private String nickName;

    public Children(String name, String surname, String nickName) {
        super(name, surname);
        this.nickName = nickName;
    }

    public void messageFromChildrenClass() {
        System.out.println("I extend my parents ¯\\_(ツ)_/¯");
    }
}
