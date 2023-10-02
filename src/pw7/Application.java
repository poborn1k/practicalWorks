package pw7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Application extends JFrame {
    // СЧЕТ МАТЧА
    private int milanScore, madridScore;
    private JLabel result;
    private JLabel winner;
    // КНОПКИ
    private JButton milanButton;
    private JButton madridButton;
    // НАДПИСЬ О ПОСЛЕДНЕМ ГОЛЕ
    private JLabel lastScore;

    public Application() {
        // УСТАНОВКА НАДПИСЕЙ В НАЧАЛЬНОЕ СОСТОЯНИЕ (НАЧАЛО МАТЧА)
        setSize(900, 600);

        milanScore = 0;
        madridScore = 0;

        result = new JLabel("Result: 0 X 0");
        lastScore = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");

        // УВЕЛИЧЕНИЕ СЧЕТА И СМЕНА НАДПИСЕЙ ПРИ НАЖАТИИ НА КНОПКИ
        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels(1);
            }
        });

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels(0);
            }
        });

        // РАССТАНОВКА КНОПОК И НАДПИСЕЙ В ПРИЛОЖЕНИИ ПО СЕТКЕ 3 СТРОКИ 2 СТОЛБЦА
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(result);
        panel.add(milanButton);
        panel.add(lastScore);
        panel.add(madridButton);
        panel.add(winner);
        add(panel);

        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void updateLabels(int lastScored) {
        result.setText("Result: " + milanScore + " X " + madridScore);
        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }

        if (lastScored == 1) {
            lastScore.setText("Last Scorer: AC Milan");
        } else {
            lastScore.setText("Last Scorer: Real Madrid");
        }
    }

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
