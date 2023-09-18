package pw9;

public class Tester {
    public static void main(String[] args) {
        Tester test = new Tester();
        System.out.println(test.task8("fsdfs"));
    }

    private String task8(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        if (word.equals(reversed.toString())) {
            return "YES";
        }
        return "NO";
    }
}
