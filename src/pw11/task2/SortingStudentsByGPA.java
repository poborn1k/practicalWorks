package pw11.task2;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }

    public void quickSorter(List<Student> students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int midMarker = (leftMarker + rightMarker) / 2;
        do {
            while (compare(students.get(leftMarker), students.get(midMarker)) == -1) {
                leftMarker++;
            }
            while (compare(students.get(rightMarker), students.get(midMarker)) == 1) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = students.get(leftMarker);
                    students.set(leftMarker, students.get(rightMarker));
                    students.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSorter(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSorter(students, leftBorder, rightMarker);
        }
    }
}