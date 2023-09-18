package pw4.task3;

public class Book {
    private String author;
    private int ageOfWriting;
    private String name;

    public Book(String author, String name, int ageOfWriting) {
        this.ageOfWriting = ageOfWriting;
        this.author = author;
        this.name = name;
    }

    public void setAgeOfWriting(int ageOfWriting) {
        this.ageOfWriting = ageOfWriting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAgeOfWriting() {
        return ageOfWriting;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%s wrote %s in %d", this.author, this.name, this.ageOfWriting);
    }
}
