package pw5.task4_5;

public class Tester {
    public static void main(String[] args) {
        Movable pointTest = new MovablePoint(5, 6, 10, 10);
        System.out.println(pointTest);
        pointTest.moveLeft();
        System.out.println(pointTest);

        Movable circleTest = new MovableCircle(2, 1, 2, 2, 20);
        System.out.println(circleTest);
        circleTest.moveRight();
        System.out.println(circleTest);
    }
}
