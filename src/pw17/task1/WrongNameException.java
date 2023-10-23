package pw17.task1;

public class WrongNameException extends Exception {
    private final String name;

    WrongNameException(String message, String name) {
        System.err.println(message);
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Invalid name input: " + name;
    }
}
