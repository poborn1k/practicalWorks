package pw1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int toHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return String.format("%s is %d years old", this.name, this.age);
    }
}
