package pw7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame{
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    private int milanScore;
    private int madridScore;

    public Application() {
        milanScore = 0;
        madridScore = 0;

        setTitle("Футбольный матч: Милан против Мадрида");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels();
            }
        });

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels();
            }
        });

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);
        add(panel);

        pack();
        setVisible(true);
    }

    private void updateLabels() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
        lastScorerLabel.setText("Last Scorer: " + (milanScore > madridScore ? "AC Milan" : "Real Madrid"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Application();
            }
        });
    }
}


