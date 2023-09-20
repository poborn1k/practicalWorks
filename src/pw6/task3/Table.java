package pw6.task3;

public class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("You put the item on the " + getName());
    }
}
