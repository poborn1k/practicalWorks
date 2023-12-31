package pw14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.remove(element)) {
            content.add(element);
        }
    }
}
