package pw17.task2;

public class LabClass {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public Student findStudentByName(String name) throws StudentNotFoundException {
        if (name.isEmpty()) {
            try {
                throw new EmptyStringException("Имя студента не может быть пустым!");
            } catch (EmptyStringException e) {
                e.printStackTrace();
            }
        }

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + name + " не найден!");
    }
}
