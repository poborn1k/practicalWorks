package pw2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Tester test = new Tester();
        System.out.println("TASK 1");
        test.task1();
        System.out.println("\nTASK 2");
        System.out.println(test.factorial(5));
        System.out.println("\nTASK 3");
        test.task3();
        System.out.println("\nTASK 4");
        test.task4();
        System.out.println("\nTASK 5");
        test.task5();
    }

    private void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int result = 0;
        for (int number : array) {
            result += number;
        }

        System.out.println(result);
    }

    private void task3() {
        for (int i = 1; i < 11; i++) {
            System.out.println(1 / (double)i);
        }
    }

    private void task4() {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 1000);
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        Arrays.sort(array, (item1, item2) -> Integer.compare(item2, item1));
        System.out.println();
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void task5() {
        int n = 3;
        System.out.println(factorial(n));
    }

    private int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
