package pw22.task1;

public class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex number1 = factory.createComplex();
        Complex number2 = factory.CreateComplex(5, 23);
        System.out.println(number1);
        System.out.println(number2);
    }
}
