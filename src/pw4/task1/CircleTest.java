package pw4.task1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.getArea() +
                "\nPerimeter of the circle: " + circle.getPerimeter());
        circle.setRadius(10);
        System.out.println("NEW DATA\nArea of the circle: " + circle.getArea() +
                "\nPerimeter of the circle: " + circle.getPerimeter());
    }
}
