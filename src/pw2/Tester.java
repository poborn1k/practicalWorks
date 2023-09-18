package pw2;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Tester test = new Tester();
        test.task1();
        test.task3();
        test.task4();
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
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        // sorted
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
