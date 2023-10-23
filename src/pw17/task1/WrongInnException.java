package pw17.task1;

public class WrongInnException extends Exception {
    private final String inn;

    WrongInnException(String message, String inn) {
        System.err.println(message);
        this.inn = inn;
    }

    public String getMessage() {
        return "Invalid INN input: " + inn;
    }
}
