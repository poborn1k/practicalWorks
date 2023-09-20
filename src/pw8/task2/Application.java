package pw8.task2;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    Application() {
        setSize(500, 500);

        JPanel panel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("src/pw8/task2/frame0.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
