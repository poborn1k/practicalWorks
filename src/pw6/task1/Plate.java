package pw6.task1;

class Plate extends Dish {
    private double diameter;

    public Plate(String material, String color, double price, double diameter) {
        super(material, color, price);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Eating from the plate");
    }

    public void displayInfo() {
        System.out.println("Material: " + getMaterial());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Diameter: " + diameter);
    }
}
