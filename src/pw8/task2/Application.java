package pw8.task2;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    Application() {
        setSize(900, 830);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("src/pw8/task2/img.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
