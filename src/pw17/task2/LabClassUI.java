package pw17.task2;

public class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void searchStudent(String name) {
        try {
            Student foundStudent = labClass.findStudentByName(name);
            System.out.println("Студент " + foundStudent.getName() + " найден!");
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
