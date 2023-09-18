package pw4.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Fyodor Dostoevsky", "Crime and Punishment", 1866);
        System.out.println(book.toString());
        book.setAuthor("Leo Tolstoy");
        book.setName("War and Peace");
        book.setAgeOfWriting(1869);
        System.out.println(book.toString());
    }
}
