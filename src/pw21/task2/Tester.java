package pw21.task2;

public class Tester {
    public static void main(String[] args) {
        LinkedQueue<String> test = new LinkedQueue<>();

        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");
        test.enqueue("D");
        test.enqueue("E");
        test.enqueue("F");

        System.out.println("LinkedQueue size: " + test.size());
        System.out.println("LinkedQueue is empty: " + test.isEmpty());

        System.out.println("LinkedQueue element: " + test.poll());
        System.out.println("LinkedQueue element: " + test.peek());
        System.out.println("LinkedQueue element: " + test.dequeue());

        System.out.println("LinkedQueue size: " + test.size());

        test.clear();
        System.out.println("LinkedQueue is empty: " + test.isEmpty());
    }
}