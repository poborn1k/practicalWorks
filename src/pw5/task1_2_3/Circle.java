package pw5.task1_2_3;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.color = "None";
        this.filled = false;
        this.radius = 0;
    }
    public Circle(double radius) {
        this.color = "None";
        this.filled = false;
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI *  Math.pow(this.radius, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return String.format("Color: %s\nFilled: %b\nRadius: %.3f", this.color, this.filled, this.radius);
    }
}
