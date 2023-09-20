package pw6.task3;

public class Tester {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);

        Chair chair = new Chair("Chair", 100);
        Table table = new Table("Table", 200);

        shop.addFurniture(chair);
        shop.addFurniture(table);

        shop.showFurnitures();

        shop.testFurnitures();
    }
}
