package pw14;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(E element) {
        if (content.size() > capacity) {
            System.out.println("Array is full");
            return;
        }
        super.add(element);
    }

    public String toString() {
        return super.toString();
    }
}
