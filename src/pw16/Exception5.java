package pw16;

public class Exception5 {
    public static void step1() {
        ThrowsDemo test = new ThrowsDemo();
        test.getDetails(null);
    }

    public static void step2() {
        try {
            ThrowsDemo test = new ThrowsDemo();
            test.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //step1();
        //step2();
    }
}
