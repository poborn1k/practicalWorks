package pw6.task1;

public class Cup extends Dish {
    private double volume;

    public Cup(String material, String color, double price, double volume) {
        super(material, color, price);
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Drinking from the cup");
    }

    public void displayInfo() {
        System.out.println("Material: " + getMaterial());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Volume: " + volume);
    }
}
