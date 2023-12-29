package pw17.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Георгий"),
                new Student("Иван"),
                new Student("Дмитрий")
                // Добавьте остальных студентов
        };

        LabClass labClass = new LabClass(students);
        LabClassUI labClassUI = new LabClassUI(labClass);

        labClassUI.searchStudent("Дмитрий");
        labClassUI.searchStudent("Иван");
        labClassUI.searchStudent("Анатолий");
    }
}
