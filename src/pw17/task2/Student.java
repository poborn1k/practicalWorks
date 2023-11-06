package pw17.task2;

class Student {
    private final String firstName;
    private final int GPA;

    public Student(String firstName, String lastName, int GPA) {
        this.firstName = firstName;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return String.format("%s - mark %d", this.firstName, this.GPA);
    }
}
