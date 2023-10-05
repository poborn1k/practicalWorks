package pw11.task3;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Student[] array1 = { new Student("fsad", 19), new Student("fsad", 3),
                new Student("fsad", 1), new Student("fsad", 100), new Student("fsad", 72) };
        Student[] array2 = { new Student("fsad", 432), new Student("fsad", 23),
                new Student("fsad", 43), new Student("fsad", 1), new Student("fsad", 74) };
        Student[] bothArrays = new Student[array1.length + array2.length];


        for (int i = 0; i < bothArrays.length; i++) {
            if (i < array1.length) {
                bothArrays[i] = array1[i];
            } else {
                bothArrays[i] = array2[i - array1.length];
            }
        }

        for (Student tmp : bothArrays) {
            System.out.println(tmp.toString());
        }
        System.out.println();

        Student[] result = mergesort(bothArrays);

        for (Student tmp : result) {
            System.out.println(tmp.toString());
        }
    }

    public static Student[] mergesort(Student[] array1) {
        Student[] buffer1 = Arrays.copyOf(array1, array1.length);
        Student[] buffer2 = new Student[array1.length];
        Student[] result = merge(buffer1, buffer2, 0, array1.length);
        return result;
    }
    public static Student[] merge(Student[] buffer1, Student[] buffer2, int start, int end) {
        if (start >= end - 1) {
            return buffer1;
        }

        int mid = start + (end - start) / 2;
        Student[] sorted1 = merge(buffer1, buffer2, start, mid);
        Student[] sorted2 = merge(buffer1, buffer2, mid, end);

        int index1 = start;
        int index2 = mid;
        int dest = start;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < mid && index2 < end) {
            result[dest++] = sorted1[index1].getMark() < sorted2[index2].getMark()
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mid) {
            result[dest++] = sorted1[index1++];
        }
        while (index2 < end) {
            result[dest++] = sorted2[index2++];
        }
        return result;
    }
}