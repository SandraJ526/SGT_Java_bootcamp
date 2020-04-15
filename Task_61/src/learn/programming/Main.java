package learn.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<ToDo> tasks = new ArrayList<>();
        ToDo task1 = new ToDo("gym", "general workout", WeekDayEnum.MONDAY, true);
        ToDo task2 = new ToDo("code", "Java exercises", WeekDayEnum.TUESDAY, true);
        ToDo task3 = new ToDo("bootcamp", "Java lecture3", WeekDayEnum.WEDNESDAY, false);
        ToDo task4 = new ToDo("bootcamp", "Java lecture5", WeekDayEnum.FRIDAY, false);
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);

        List<ToDo> notDone = tasks.stream()
                .filter(task -> task.isDone() == false)
                .collect(Collectors.toList());
        notDone.forEach(System.out::println);

        List<ToDo> fridays = tasks.stream()
                .filter(task -> task.getDay().equals(WeekDayEnum.FRIDAY))
                .collect(Collectors.toList());
        fridays.forEach(System.out::println);
    }
}
