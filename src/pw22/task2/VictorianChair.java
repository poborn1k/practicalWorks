package pw22.task2;

public class VictorianChair implements Chair {
    private final int age;

    VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Victorian chair";
    }
}
