package pw23;

import java.util.Arrays;

public class InternetOrder {
    private Node head;
    private int size;

    private static class Node {
        Item data;
        Node next;
        Node prev;

        Node(Item data) {
            this.data = data;
        }
    }

    public InternetOrder() {
        head = new Node(null);
        head.next = head;
        head.prev = head;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            addPosition(item);
        }
    }

    public boolean addPosition(Item item) {
        Node newNode = new Node(item);

        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        size++;

        return true;
    }

    public boolean removePosition(String itemName) {
        Node current = head.prev;

        while (current != head) {
            if (current.data.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
            current = current.prev;
        }

        return false;
    }

    public int removeAllPositions(String itemName) {
        int count = 0;
        Node current = head.prev;

        while (current != head) {
            if (current.data.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                count++;
            }
            current = current.prev;
        }

        return count;
    }

    public int totalPositions() {
        return size;
    }

    public Item[] getOrderedItems() {
        Item[] items = new Item[size];
        Node current = head.next;
        int index = 0;

        while (current != head) {
            items[index] = current.data;
            current = current.next;
            index++;
        }

        return items;
    }

    public double totalCost() {
        double totalCost = 0;
        Node current = head.next;

        while (current != head) {
            totalCost += current.data.getCost();
            current = current.next;
        }

        return totalCost;
    }

    public int totalItemsCount(String itemName) {
        int count = 0;
        Node current = head.next;

        while (current != head) {
            if (current.data.getName().equals(itemName)) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    public String[] uniqueItems() {
        String[] unique = new String[size];
        Node current = head.next;
        int counter = 0;

        while (current != head) {
            boolean flag = true;

            for (String names : unique) {
                if (current.data.getName().equals(names) || current.data == null) {
                    flag = false;
                }
            }
            if (flag) {
                unique[counter] = current.data.getName();
                counter++;
            }

            current = current.next;
        }

        return unique;
    }

    public Item[] sortedByPrice() {
        Item[] items = getOrderedItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return items;
    }

}
