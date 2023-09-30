package pw10;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println("___TASK 7___");
        task7(2323, 2);
        System.out.println("\n___TASK 8___");
        System.out.println(task8("ahaha"));
        System.out.println("___TASK 9___");
        System.out.println(task10(932723));
        System.out.println("___TASK 10___");
        System.out.println(task9(3, 3));
    }

    public static void task7(int num, int div) {
        if (num <= 1) {
            return;
        } else if (num % div == 0) {
            System.out.print(div + " ");
            task7(num / div, div);
        } else {
            task7(num, ++div);
        }
    }

    private static String task8(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return "YES";
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return task8(word.substring(1, word.length() - 1));
        } else {
            return "NO";
        }
    }

    public static int task9(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        } else {
            return task9(a - 1, b) + task9(a, b - 1);
        }
    }

    private static int task10(int number) {
        if (number < 10) {
            return number;
        }
        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        int reversed = task10(remainingNumber);
        int numDigits = (int) Math.log10(reversed) + 1;
        return lastDigit * (int) Math.pow(10, numDigits) + reversed;
    }
}
