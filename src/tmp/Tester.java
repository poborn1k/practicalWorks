package tmp;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        // Создаем массив позиций заказа
        Dish a1 = new Dish();
        a1.setName("Pizza");
        a1.setCost(94);
        Dish a2 = new Dish();
        a2.setName("Burger");
        a2.setCost(194);
        Dish a3 = new Dish();
        a3.setName("Pizza");
        a3.setCost(494);
        Dish a4 = new Dish();
        a4.setName("Pizza");
        a4.setCost(94);

        Item[] orderItems = {
                a1, a2, a3,
                new Drink(98, "Cola", "...")
        };

        // Создаем интернет-заказ и добавляем позиции
        InternetOrder order = new InternetOrder(orderItems);

        // Добавляем новую позицию
        order.addPosition(a4);

        // Удаляем позицию по названию
        order.removePosition("Burger");

        // Удаляем все позиции с заданным именем
        int removedCount = order.removeAllPositions("Pizza");

        // Получаем общее число позиций заказа
        System.out.println("Total positions in the order: " + order.totalPositions());

        // Получаем массив заказанных блюд и напитков
        Item[] orderedItems = order.getOrderedItems();
        System.out.println("Ordered items:");
        for (Item item : orderedItems) {
            if (item != null) {
                System.out.println(item.getName() + " - " + item.getCost());
            }
        }

        // Получаем общую стоимость заказа
        System.out.println("Total cost of the order: " + order.totalCost());

        // Получаем число заказанных блюд или напитков
        System.out.println("Count of 'Cola' items in the order: " + order.totalItemsCount("Cola"));

        // Получаем массив названий заказанных блюд и напитков (без повторов)
        String[] uniqueNames = order.uniqueItems();
        System.out.println("Unique items: " + Arrays.toString(uniqueNames));

        // Получаем массив позиций заказа, отсортированный по убыванию цены
        Item[] sortedItems = order.sortedByPrice();
        System.out.println("Ordered items sorted by price:");
        for (Item item : sortedItems) {
            if (item != null) {
                System.out.println(item.getName() + " - " + item.getCost());
            }
        }
    }
}
