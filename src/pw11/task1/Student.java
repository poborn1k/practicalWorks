package pw11.task1;

class Student {
    private String firstName;
    private String lastName;
    private int iDNumber;

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
        return firstName + " " + lastName + " (" + iDNumber + ")";
    }
}
