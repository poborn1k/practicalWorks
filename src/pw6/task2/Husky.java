package pw6.task2;

public class Husky extends Dog {
    public Husky(String color, int age) {
        super("Siberian Husky", color, age);
    }

    public void bark() {
        System.out.println("Husky is barking!");
    }
}
