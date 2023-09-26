package pw11.task3;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 20));
        list1.add(new Student("Alice", 18));
        list1.add(new Student("Bob", 19));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Emily", 21));
        list2.add(new Student("David", 22));
        list2.add(new Student("Catherine", 20));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student.getName() + ", age: " + student.getAge());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getAge() <= student2.getAge()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

