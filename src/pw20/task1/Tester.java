package pw20.task1;

public class Tester {
    public static void main(String[] args) {
        RPNCalculator test1 = new RPNCalculator("2+3");
        System.out.println();
        RPNCalculator test2 = new RPNCalculator("(2*3)+(4*5)");
        System.out.println();
        RPNCalculator test3 = new RPNCalculator("2/(3-(4+(5*6)))");
    }
}
