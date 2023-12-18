package pw24;

public class Tester {
    public static void main(String[] args) {
        RestaurantOrder test = new RestaurantOrder();

        Dish temp = new Dish(938, "Pizza", "...");

        System.out.println(test.addItem(new Drink(1500, "Cola", "...")));
        test.addItem(new Drink(643463, "Cola", "..."));
        test.addItem(new Drink(3453, "Fanta", "..."));
        test.addItem(new Drink(5435, "A", "..."));
        test.addItem(new Drink(7845, "B", "..."));
        test.addItem(temp);
        test.addItem(new Drink(7, "F", "..."));
        test.addItem(new Drink(5235, "S", "..."));
        test.addItem(new Drink(5235, "A", "..."));
        System.out.println(test.addItem(new Drink(122500, "K", "...")));
        System.out.println(test.addItem(new Drink(15600, "D", "...")));

        String[] a = test.itemNames();
        for (String tmp : a) {
            System.out.println(tmp);
        }
        System.out.println();

        //test.removeItem("Cola");
        System.out.println(test.removeAll("Cola"));
        System.out.println(test.totalOrderQuantity());

        String[] B = test.itemNames();
        for (String tmp : B) {
            System.out.println(tmp);
        }
        System.out.println("\n\n\n");

        Item[] c = test.sortedItemsByPrice();
        for (Item tmp : c) {
            System.out.println(tmp.getName() + " " + tmp.getCost());
        }

        System.out.println("\n\n" + test.orderTotalCost() + "\n\n" + test.itemQuantity("A"));

        OrderManager tester = new OrderManager();
        tester.addOrder("8", test);
        System.out.println(tester.totalOrderedItemQuantity("Pizza"));
    }
}
