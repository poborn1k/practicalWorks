package pw24;

import java.util.Arrays;

public class InternetOrder implements Order {
    private int counter = 0;
    private Item[] order = new Item[10];

    @Override
    public boolean addItem(Item item) {
        if (counter == 10) {
            return false;
        }
        order[counter] = item;
        counter++;
        return true;
    }

    @Override
    public boolean removeItem(String itemName) {
        for (int i = order.length - 1; i > -1; i--) {
            if (order[i].getName().equals(itemName)) {
                order[i] = null;
                fixOrder();
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int localCounter = 0;
        for (int i = order.length - 1; i > -1; i--) {
            if (order[i].getName().equals(itemName)) {
                order[i] = null;
                localCounter++;
            }
        }
        fixOrder();
        return localCounter;
    }

    private void fixOrder() {
        Item[] fixed = new Item[10];
        int localCounter = 0;

        for (Item item : order) {
            if (item != null) {
                fixed[localCounter] = item;
                localCounter++;
            }
        }

        order = fixed;
        counter = localCounter;
    }

    @Override
    public int totalOrderQuantity() {
        return counter;
    }

    @Override
    public Item[] getOrder() {
        return order;
    }

    @Override
    public double orderTotalCost() {
        double cost = 0.0;

        for (int i = 0; i < counter; i++) {
            cost += order[i].getCost();
        }

        return cost;
    }

    @Override
    public int itemQuantity(String itemName) {
        int localCounter = 0;
        for (int i = 0; i < counter; i++) {
            if (order[i].getName().equals(itemName)) {
                localCounter++;
            }
        }
        return localCounter;
    }

    @Override
    public String[] itemNames() {
        String[] names = new String[counter];

        for (int i = 0; i < counter; i++) {
            names[i] = order[i].getName();
        }

        return names;
    }

    @Override
    public Item[] sortedItemsByPrice() {
        Item[] sorted = new Item[counter];
        for (int i = 0; i < counter; i++) {
            sorted[i] = order[i];
        }
        Arrays.sort(sorted, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return sorted;
    }
}
