package pw6.task2;

public abstract class Dog {
    protected String breed;
    protected String color;
    protected int age;

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
    }

    public abstract void bark();
}

