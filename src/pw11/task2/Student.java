package pw11.task2;

class Student {
    private final String firstName;
    private final String lastName;
    private final int GPA;

    public Student(String firstName, String lastName, int GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return String.format("%s %s - mark %d", this.firstName, this.lastName, this.GPA);
    }
}
