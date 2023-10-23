package pw17.task2;

public class EmptyStringException extends Exception {
    EmptyStringException() {
        System.err.println("Empty string");
    }
}
