package pw5.task1_2_3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.color = "None";
        this.filled = false;
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length) {
        this.color = "None";
        this.filled = false;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
    @Override
    public String toString() {
        return String.format("Color: %s\nFilled: %b\nWidth: %.3f\nLength: %.3f", this.color, this.filled, this.width, this.length);
    }
}
