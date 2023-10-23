package pw16;

public class Exception7 {
    public static void exceptionDemo() {
        try {
            ThrowsDemo2 test = new ThrowsDemo2();
            test.getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
