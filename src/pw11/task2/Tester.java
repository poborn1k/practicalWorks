package pw11.task2;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 90));
        students.add(new Student("Alice", 80));
        students.add(new Student("Bob", 95));

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
