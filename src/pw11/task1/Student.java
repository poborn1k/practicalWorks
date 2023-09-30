package pw11.task1;

class Student {
    private final String firstName;
    private final String lastName;
    private final int iDNumber;

    public Student(String firstName, String lastName, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", this.firstName, this.lastName, this.iDNumber);
    }
}
