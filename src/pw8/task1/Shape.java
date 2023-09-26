package pw8.task1;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public abstract void draw(Graphics g);
}