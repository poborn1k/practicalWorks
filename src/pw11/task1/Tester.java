package pw11.task1;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();

        String[] firstNames = {"Zoe", "Florence", "Heidi", "Ellie", "Oscar", "William", "Ethan", "Henry"};
        String[] secondNames = {"Evans", "Adamson", "Parson", "Gilbert", "Walker", "Davis", "Lewis", "Moore",};
        final int size = 25;
        Student[] students = new Student[size];
        Student[] sortedStudents;

        for (int i = 0; i < size; i++) {
            students[i] = new Student(firstNames[random.nextInt(0, firstNames.length)],
                    secondNames[random.nextInt(0, secondNames.length)],
                    random.nextInt(1, 1000));
        }

        for (Student tmp : students) {
            System.out.println(tmp);
        }

        sortedStudents = sortingByInserts(students);

        System.out.println("\n\n\n");
        for (Student tmp2 : sortedStudents) {
            System.out.println(tmp2);
        }
    }

    private static Student[] sortingByInserts(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i;
            while (j > 0 && students[j - 1].getIDNumber() > current.getIDNumber()) {
                students[j] = students[j - 1];
                j--;
            }
            students[j] = current;
        }
        return students;
    }
}
