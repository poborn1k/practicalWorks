package pw8.task1;

import java.awt.*;

public class Arc extends Shape {
    private int width;
    private int height;
    private int startAngle;
    private int arcAngle;

    public Arc(Color color, int x, int y, int width, int height, int startAngle, int arcAngle) {
        super(color, x, y);
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
}
