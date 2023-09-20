package pw6.task3;

public abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void use();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
