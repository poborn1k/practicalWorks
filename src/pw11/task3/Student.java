package pw11.task3;

public class Student {
    private String name;
    private int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public String toString() {
        return name + "'s mark: " + mark;
    }
}
