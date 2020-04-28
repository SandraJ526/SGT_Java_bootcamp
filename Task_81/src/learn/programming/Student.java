package learn.programming;

import java.util.Arrays;

public class Student {

    private int id;
    private String name;
    private String surname;
    private int[] grades;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
