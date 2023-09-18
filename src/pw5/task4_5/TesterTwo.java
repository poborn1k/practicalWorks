package pw5.task4_5;

public class TesterTwo {
    public static void main(String[] args)
    {
        Movable m1 = new MovableRectangle(80, 80, 50, 50, 10, 10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableRectangle(3, 8, 10, 4, 5, 5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
