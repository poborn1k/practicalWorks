package pw24;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    Drink(String name, String description) {
        if (name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameters for creating a drink");
        }

        this.cost = 0.0;
        this.name = name;
        this.description = description;
    }

    Drink(int cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid parameters for creating a drink");
        }

        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
