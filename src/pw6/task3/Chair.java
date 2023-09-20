package pw6.task3;

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("You are sitting on a " + getName());
    }
}
