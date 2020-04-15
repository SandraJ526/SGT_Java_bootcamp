package learn.programming;

public class ToDo {

    private String name;
    private String description;
    private WeekDayEnum day;
    private boolean done;


    public ToDo(String name, String description, WeekDayEnum day, boolean done) {
        this.name = name;
        this.description = description;
        this.day = day;
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public WeekDayEnum getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", day=" + day +
                ", done=" + done +
                '}';
    }
}
