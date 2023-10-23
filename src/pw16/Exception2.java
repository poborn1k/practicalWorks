package pw16;

import java.util.*;

public class Exception2 {
    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public static void exceptionDemo2() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //exceptionDemo1();
        // Qwerty - java.lang.NumberFormatException
        // 0 - java.lang.ArithmeticException
        // 1.2 - java.lang.NumberFormatException

        exceptionDemo2();
    }
}
