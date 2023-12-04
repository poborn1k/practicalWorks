package pw21.task2;

interface Queue<E> {
    void enqueue(E element);
    E dequeue();
    E element();
    int size();
    boolean isEmpty();
    void clear();
}
