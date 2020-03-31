package learn.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Kristofers", 22));
        persons.add(new Person("Andris", 47));
        persons.add(new Person("Valdis", 36));
        persons.add(new Person("Laura", 15));

        List<Person> personsOver30 = new ArrayList<>();

        for (var person: persons) {
            if(person.age > 30 ){
                personsOver30.add(person);
            }
        }
        System.out.println(personsOver30.toString());
    }
}
