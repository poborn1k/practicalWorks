package pw16;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Some information");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
