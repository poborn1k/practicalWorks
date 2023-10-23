package pw17.task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, inn;

        try {
            System.out.print("Enter your full name: ");
            name = scan.nextLine();
            checkName(name);
            System.out.print("Enter your INN: ");
            inn = scan.nextLine();
            checkInn(inn);
            System.out.println("The order has been successfully placed");
        } catch (WrongNameException | WrongInnException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkName(String name) throws WrongNameException {
        if (name.split(" ").length != 3) {
            throw new WrongNameException("Full name must contain 3 words", name);
        }
    }

    private static void checkInn(String inn) throws WrongInnException {
        if (inn.split("").length != 10) {
            throw new WrongInnException("The INN must contain 10 digits", inn);
        }
    }
}
