package pw8.task1;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Application extends JFrame {
    public Application() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomX = random.nextInt(0, 800);
            int randomY = random.nextInt(0, 600);
            int randomWidth = random.nextInt(5, 150);
            int randomHeight = random.nextInt(5, 150);
            int randomRadius = random.nextInt(5, 100);
            Color randomColor = new Color(random.nextInt(1, 256), random.nextInt(1, 256),
                    random.nextInt(1, 256));
            int randomStartAngle = random.nextInt(5, 150);
            int randomArcAngle = random.nextInt(5, 150);

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
