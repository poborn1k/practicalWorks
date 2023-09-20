package pw8.task1;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Application extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public Application() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 20; i++) {
            int randomX = (int) (Math.random() * WINDOW_WIDTH);
            int randomY = (int) (Math.random() * WINDOW_HEIGHT);
            int randomWidth = (int) (Math.random() * 100) + 50;
            int randomHeight = (int) (Math.random() * 100) + 50;
            int randomRadius = (int) (Math.random() * 50) + 25;
            Color randomColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            int randomStartAngle = (int) (Math.random() * 100) + 50;
            int randomArcAngle = (int) (Math.random() * 100) + 50;

            Shape shape;
            if (i < 16) {
                if (i % 2 == 0) {
                    shape = new Rectangle(randomColor, randomX, randomY, randomWidth, randomHeight);
                } else {
                    shape = new Circle(randomColor, randomX, randomY, randomRadius);
                }
            } else {
                shape = new Arc(randomColor, randomX, randomY, randomWidth, randomHeight, randomStartAngle, randomArcAngle);
            }

            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
