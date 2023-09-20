package pw6.task3;

public class FurnitureShop {
    private Furniture[] furnitures;
    private int count;

    public FurnitureShop(int capacity) {
        furnitures = new Furniture[capacity];
        count = 0;
    }

    public void addFurniture(Furniture furniture) {
        if (count < furnitures.length) {
            furnitures[count] = furniture;
            count++;
        } else {
            System.out.println("Магазин заполнен, невозможно добавить новую мебель");
        }
    }

    public void showFurnitures() {
        for (int i = 0; i < count; i++) {
            System.out.println(furnitures[i].getName() + " - " + furnitures[i].getPrice());
        }
    }

    public void testFurnitures() {
        for (int i = 0; i < count; i++) {
            furnitures[i].use();
        }
    }
}
