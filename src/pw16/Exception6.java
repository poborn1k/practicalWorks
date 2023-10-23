package pw16;

public class Exception6 {
    public static void exceptionDemo() {
        try {
            ThrowsDemo test = new ThrowsDemo();
            test.printMessage("23908");
            test.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
