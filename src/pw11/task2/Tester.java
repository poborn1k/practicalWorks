package pw11.task2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();

        String[] firstNames = {"Zoe", "Florence", "Heidi", "Ellie", "Oscar", "William", "Ethan", "Henry"};
        String[] secondNames = {"Evans", "Adamson", "Parson", "Gilbert", "Walker", "Davis", "Lewis", "Moore",};
        //List<Student> students = new ArrayList<>();
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
        /*Student p1 = new Student("af", "fas", 10);
        Student p2 = new Student("af", "fas", 1);
        SortingStudentsByGPA test = new SortingStudentsByGPA();
        System.out.println(test.compare(p1, p2));*/
    }
}
