package pw21.task2;

import java.util.NoSuchElementException;

class LinkedQueue<E> extends AbstractQueue<E> {
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(E element) {
        if (tail == null) {
            head = tail = new Node<>(element, null);
        } else {
            tail.next = new Node<>(element, null);
            tail = tail.next;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected E poll() {
        E result = head.item;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }

    protected E peek() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.item;
    }
}