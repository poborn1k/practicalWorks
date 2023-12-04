package pw21.task2;

import java.util.NoSuchElementException;

abstract class AbstractQueue<E> implements Queue<E> {
    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален из очереди
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return poll();
    }

    // Предусловие: очередь не пуста
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return peek();
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    protected abstract E poll();

    protected abstract E peek();
}