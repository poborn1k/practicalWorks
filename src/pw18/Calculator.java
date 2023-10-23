package pw18;

public class Calculator {
    static <T extends Number, V extends Number> double sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    static <T extends Number, V extends Number> double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    static <T extends Number, V extends Number> double divide(T num1, V num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    static <T extends Number, V extends Number> double subtract(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
