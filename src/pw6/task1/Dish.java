package pw6.task1;

public abstract class Dish {
    protected String color;
    protected boolean isBroken;
    protected String size;

    public Dish() {
        this.color = "NONE";
        this.isBroken = false;
        this.size = "NONE";
    }

    public Dish(String color, boolean isBroken, String size) {
        this.color = color;
        this.isBroken = isBroken;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean getBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void breakDish();
    public abstract void washDish();
}
