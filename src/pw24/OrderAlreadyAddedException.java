package pw24;

public class OrderAlreadyAddedException extends Exception {

    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}
