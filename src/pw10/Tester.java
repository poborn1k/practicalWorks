package pw10;

public class Tester {
    public static void main(String[] args) {
        Tester test = new Tester();
        System.out.println(test.task8("fsdfs"));

        System.out.print("Простые множители числа " + 9863 + ": ");
        test.task7(9863);
    }


    public static void task7(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }

    private String task8(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        if (word.equals(reversed.toString())) {
            return "YES";
        }
        return "NO";
    }
}
