package pw11.task2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();

        String[] firstNames = {"Zoe", "Florence", "Heidi", "Ellie", "Oscar", "William", "Ethan", "Henry"};
        String[] secondNames = {"Evans", "Adamson", "Parson", "Gilbert", "Walker", "Davis", "Lewis", "Moore",};
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student(firstNames[random.nextInt(0, firstNames.length)],
                    secondNames[random.nextInt(0, secondNames.length)],
                    random.nextInt(0, 100)));
        }

        for (Student tmp : students) {
            System.out.println(tmp);
        }

        System.out.println("\n\n\n");

        SortingStudentsByGPA test = new SortingStudentsByGPA();

        test.quickSorter(students, 0, (students.size() - 1));

        for (Student tmp : students) {
            System.out.println(tmp);
        }
    }
}
