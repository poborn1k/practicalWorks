package pw3;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Bob", "someemail1@gmail.com", 'M');
        Author author2 = new Author("Karen", "someemail2@gmail.com", 'F');

        System.out.println(author1.toString() + "\n" + author2.toString());

        author2.setEmail("newemail@yandex.ru");
        System.out.println(author2.toString());
    }
}
