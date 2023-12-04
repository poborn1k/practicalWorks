package pw21.task1;

import java.util.Arrays;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    // Предусловие: очередь не пуста
    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        Arrays.fill(queue.elements, null);
        queue.size = 0;
        queue.head = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newSize = queue.elements.length * 2;
            queue.elements = Arrays.copyOf(queue.elements, newSize);
            if (queue.head > 0) {
                System.arraycopy(queue.elements, 0, queue.elements, queue.elements.length / 2, queue.head);
                if (queue.head + queue.size > queue.elements.length / 2) {
                    System.arraycopy(queue.elements, queue.head, queue.elements, queue.elements.length / 2 + queue.head, queue.size - queue.head);
                } else {
                    System.arraycopy(queue.elements, queue.head, queue.elements, queue.elements.length / 2 + queue.head, queue.size);
                }
                queue.head += queue.elements.length / 2;
            }
        }
    }
}
