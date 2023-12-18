package tmp;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    Drink(String name, String description) {
        this.cost = 0.0;
        this.name = name;
        this.description = description;
    }

    Drink(int cost, String name, String description) {
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
