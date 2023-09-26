package pw11.task2;

public class Student {
    private String name;
    private int GPA;

    public Student(String name, int GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }
}
