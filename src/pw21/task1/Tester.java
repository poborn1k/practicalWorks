package pw21.task1;

public class Tester {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        ArrayQueueModule.enqueue("C");
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
    }

    private static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, "X");
        ArrayQueueADT.enqueue(queue, "Y");
        ArrayQueueADT.enqueue(queue, "Z");
        System.out.println(ArrayQueueADT.dequeue(queue));
        System.out.println(ArrayQueueADT.size(queue));
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("P");
        queue.enqueue("Q");
        queue.enqueue("R");
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
