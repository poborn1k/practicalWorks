package pw18;

public class Animal {
    private final String name;
    private final String type;

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return String.format("Type: %s\tName: %s", this.type, this.name);
    }
}
