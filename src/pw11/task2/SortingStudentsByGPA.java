package pw11.task2;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() > student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() < student2.getGPA()) {
            return 1;
        }
        return 0;
    }

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
}
