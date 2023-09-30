package pw15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Clara");
        controller.setStudentRollNo("anotherWhat");
        System.out.println("After updating, Information about student are as follows");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Bob");
        student.setRollNo("what");
        return student;
    }
}
