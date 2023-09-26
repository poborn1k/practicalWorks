package pw11.task1;

public class Tester {
    public static void main(String[] args) {
        // Создание массива студентов
        Student[] students = {
                new Student("John", "Doe", 123),
                new Student("Alice", "Smith", 456),
                new Student("Bob", "Johnson", 789),
                new Student("Emily", "Brown", 234),
                new Student("Michael", "Jones", 567)
        };

        // Вывод неотсортированного массива студентов
        System.out.println("Неотсортированный массив студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка массива студентов по iDNumber вставкой
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }

        // Вывод отсортированного массива студентов
        System.out.println("Отсортированный массив студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
