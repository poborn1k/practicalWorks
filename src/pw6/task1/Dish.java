package pw6.task1;

public abstract class Dish {
    private String material;
    private String color;
    private double price;

    public Dish(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public abstract void use();

    public void clean() {
        System.out.println("Cleaning the " + material + " dish");
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
