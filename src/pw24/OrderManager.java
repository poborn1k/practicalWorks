package pw24;

import pw23.Order;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, RestaurantOrder> addressOrder;

    OrderManager() {
        addressOrder = new HashMap<>();
    }
    public void addOrder(String address, RestaurantOrder order) {
        if (isNumeric(address) && (Integer.parseInt(address) <= 0 || Integer.parseInt(address) > 15)) {
            throw new IllegalTableNumber("The table with the number " + address + " does not exist");
        }
        if (addressOrder.containsKey(address)) {
            try {
                throw new OrderAlreadyAddedException("Order already exists for address: " + address);
            } catch (OrderAlreadyAddedException e) {
                throw new RuntimeException(e);
            }
        }
        addressOrder.put(address, order);
    }

    public RestaurantOrder getOrder(String address) {
        return addressOrder.get(address);
    }

    public void removeOrder(String address) {
        addressOrder.remove(address);
    }

    public void addPositionToOrder(String address, Item item) {
        RestaurantOrder order = addressOrder.get(address);

        if (order != null) {
            order.addItem(item);
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public RestaurantOrder[] getCurrentOrders() {
        return addressOrder.values().toArray(new RestaurantOrder[0]);
    }


    public double totalOrdersCost() {
        double totalCost = 0.0;
        for (RestaurantOrder order : addressOrder.values()) {
            totalCost += order.orderTotalCost();
        }
        return totalCost;
    }


    public int totalOrderedItemQuantity(String itemName) {
        int localCounter = 0;
        for (RestaurantOrder order : addressOrder.values()) {
            localCounter += order.itemQuantity(itemName);
        }
        return localCounter;
    }
}
