package pw9.task1;

public class Cat implements Nameable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Cat %s is %d years old", this.name, this.age);
    }
}
