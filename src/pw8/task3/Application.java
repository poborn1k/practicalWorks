package pw8.task3;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        setSize(800, 600);

        JPanel panel = new JPanel() {
            ImageIcon[] frames;
            int currentFrameIndex = 0;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image currentFrame = frames[currentFrameIndex].getImage();
                g.drawImage(currentFrame, 0, 0, this);
            }

            @Override
            public void addNotify() {
                super.addNotify();

                frames = new ImageIcon[3];
                frames[0] = new ImageIcon("src/pw8/task3/frame0.png");
                frames[1] = new ImageIcon("src/pw8/task3/frame1.png");
                frames[2] = new ImageIcon("src/pw8/task3/frame2.png");

                Timer timer = new Timer(1000, e -> {
                    currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                    repaint();
                });
                timer.start();
            }
        };

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
