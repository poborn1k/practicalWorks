package pw9.task1;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 10);
        Cat cat = new Cat("Patrick", 12);

        System.out.println(dog.toString() + "\n" + cat.toString());

        System.out.println(String.format("Dog name: %s\nCat name: %s", dog.getName(), cat.getName()));
    }
}
