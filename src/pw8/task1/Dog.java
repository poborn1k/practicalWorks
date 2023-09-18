package pw8.task1;

public class Dog implements Nameable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Dog %s is %d years old", this.name, this.age);
    }
}
