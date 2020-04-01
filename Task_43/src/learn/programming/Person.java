package learn.programming;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + "(" + age + ")";
    }
}
