package pw17.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }

    public void quickSorter(ArrayList<Student> students, int leftBorder, int rightBorder) {
        if (students.size() == 0 || leftBorder >= rightBorder) {
            return;
        }

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftBorder + rightBorder) / 2);

        while (leftMarker <= rightMarker) {
            while (compare(students.get(leftMarker), pivot) == -1) {
                leftMarker++;
            }
            while (compare(students.get(rightMarker), pivot) == 1) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                Student tmp = students.get(leftMarker);
                students.set(leftMarker, students.get(rightMarker));
                students.set(rightMarker, tmp);

                leftMarker++;
                rightMarker--;
            }
        }

        if (leftBorder < rightMarker) {
            quickSorter(students, leftBorder, rightMarker);
        }
        if (rightBorder > leftMarker) {
            quickSorter(students, leftMarker, rightBorder);
        }
    }
}