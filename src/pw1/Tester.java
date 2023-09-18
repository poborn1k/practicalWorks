package pw1;

public class Tester {
    public static void main(String[] args) {
        // CLASS DOG TESTER
        Dog dog = new Dog("Willy", 13);
        System.out.println(dog.toString());
        dog.setAge(7);
        dog.setName("Ben");
        System.out.println(dog.toString() + "\n" + dog.toHumanAge() + "\n");

        // CLASS BALL TESTER
        Ball ball = new Ball("Nike", 7000);
        System.out.println(ball.toString());
        ball.setPrice(7999);
        ball.setFirm("Puma");
        System.out.println(ball.toString() + "\n");

        // CLASS BOOK TESTER
        Book book = new Book("Fyodor Dostoevsky", "Crime and Punishment", 1866);
        System.out.println(book.toString());
        book.setAuthor("Leo Tolstoy");
        book.setName("War and Peace");
        book.setAgeOfWriting(1869);
        System.out.println(book.toString());
    }
}
