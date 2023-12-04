package pw21.task1;

import java.util.Arrays;

public class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        head = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
            if (head > 0) {
                System.arraycopy(elements, 0, elements, elements.length / 2, head);
                if (head + size > elements.length / 2) {
                    System.arraycopy(elements, head, elements, elements.length / 2 + head, size - head);
                } else {
                    System.arraycopy(elements, head, elements, elements.length / 2 + head, size);
                }
                head += elements.length / 2;
            }
        }
    }
}
