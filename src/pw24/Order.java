package pw24;

public interface Order {
    boolean addItem(Item item);  // добавление позиции в заказ
    boolean removeItem(String itemName);  // удаление позиции по названию
    int removeAll(String itemName);  // удаление всех позиций с заданным именем
    int totalOrderQuantity();  // общее количество позиций в заказе
    Item[] getOrder();  // массив позиций заказа
    double orderTotalCost();  // общая стоимость заказа
    int itemQuantity(String itemName);  // количество заказанных блюд или напитков
    String[] itemNames();  // массив названий заказанных блюд и напитков (без повторов)
    Item[] sortedItemsByPrice();  // массив позиций заказа, отсортированный по убыванию цены
}
