package tmp;

import java.util.ArrayList;

public class TablesOrderManager {
    private Order[] orders = new Order[10];

    public void add(Order order, int tableNumber) {
        if (tableNumber < 10 && tableNumber >= 0) {
            orders[tableNumber] = order;
        } else {
            System.out.println("No such table number");
        }
    }

    public Order getOrder(int tableNumber) {
        if (orders[tableNumber] == null) {
            return null;
        }
        return orders[tableNumber];
    }

    public void addDish(Dish dish, int tableNumber) {
        if (tableNumber < 10 && tableNumber >= 0) {
            if (orders[tableNumber] == null) {
                Order newOrder = new Order();
                newOrder.add(dish);
                orders[tableNumber] = newOrder;
            } else {
                orders[tableNumber].add(dish);
            }
        } else {
            System.out.println("No such table number");
        }
    }

    public void removeOrder(int tableNumber) {
        if (tableNumber < 10 && tableNumber >= 0) {
            orders[tableNumber] = null;
        }
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> tables = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                tables.add(i);
            }
        }

        int[] freeTables = new int[tables.size()];
        for (int i = 0; i < freeTables.length; i++) {
            freeTables[i] = tables.get(i);
        }

        return freeTables;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double summary = 0.0;

        for (Order order : orders) {
            if (order != null) {
                summary += order.costTotal();
            }
        }

        return summary;
    }

    public int dishQuantity(String dishName) {
        int counter = 0;

        for (Order order : orders) {
            String[] names = order.dishesNames();
            for (String name : names) {
                if (name.equals(dishName)) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
