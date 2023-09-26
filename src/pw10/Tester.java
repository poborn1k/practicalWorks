package pw10;

public class Tester {
    public static void main(String[] args) {
        Tester test = new Tester();
        test.task14(211);
    }

    public void task14(int a) {
        if (a / 2 != 0) {
            System.out.print(a % 10);
            task14(a / 10);
        } else {
            System.out.println(a);
            return;
        }
    }
}
