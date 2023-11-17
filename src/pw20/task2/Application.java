package pw20.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Application extends JFrame implements ActionListener {
    private static final List<String> operations = Arrays.asList("+", "-", "*", "/", "(", ")", "=", "C", "del");
    private static JPanel operationButtons;

    Application() {
        StringBuilder expression = new StringBuilder();

        JFrame frame = new JFrame("RPN Calculator");
        Font BigFontTR = new Font("TimesRoman", Font.PLAIN, 20);


        JTextField result = new JTextField(15);
        JTextField result2 = new JTextField(15);
        JTextField result3 = new JTextField(15);
        result.setEditable(false);
        result2.setEditable(false);
        result3.setEditable(false);
        result.setText(expression.toString());

        ArrayList<JButton> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setFont(BigFontTR);
            btn.addActionListener(e -> {
                expression.append(btn.getText());
                result.setText(expression.toString());
                result.setFont(BigFontTR);
            });
            numbers.add(btn);
        }



        JPanel numberButtons = new JPanel();
        numbers.forEach(numberButtons::add);

        operationButtons = new JPanel();

        operations.forEach(it -> {
            JButton tmp = new JButton(it);
            tmp.setFont(BigFontTR);
            tmp.addActionListener(e -> {
                if (tmp.getText().equals("=")) {
                    if (!expression.isEmpty()) {
                        RPNCalculator calc = new RPNCalculator();
                        String RPN = calc.expressionToRPN(expression.toString());
                        double answer = calc.RPNToAnswer(RPN);
                        result2.setText(RPN);
                        result3.setText(String.valueOf(answer));
                        expression.delete(0, expression.length());
                    }
                } else if (tmp.getText().equals("C")) {
                    expression.delete(0, expression.length());
                    result.setText("");
                    result2.setText("");
                    result3.setText("");
                } else if (tmp.getText().equals("del")) {
                    if (!expression.isEmpty()) {
                        expression.delete(expression.length() - 1, expression.length());
                        result.setText(expression.toString());
                    }
                } else {
                    expression.append(tmp.getText());
                    result.setText(expression.toString());
                }
                result2.setFont(BigFontTR);
                result3.setFont(BigFontTR);
            });
            operationButtons.add(tmp);
        });

        JPanel resultsPanel = new JPanel(new GridBagLayout());

        JLabel title1 = new JLabel("Expression");
        title1.setFont(BigFontTR);
        JLabel title2 = new JLabel("RPN notation");
        title2.setFont(BigFontTR);
        JLabel title3 = new JLabel("Result");
        title3.setFont(BigFontTR);

        resultsPanel.add(title1, new GridBagConstraints(0, 0, 1, 1, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
        resultsPanel.add(result, new GridBagConstraints(1, 0, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));

        resultsPanel.add(title2, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
        resultsPanel.add(result2, new GridBagConstraints(1, 1, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));

        resultsPanel.add(title3, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(1, 1, 1, 1), 0, 0));
        resultsPanel.add(result3, new GridBagConstraints(1, 2, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));


        numberButtons.setLayout(new GridLayout(4, 3, 3, 3));
        operationButtons.setLayout(new GridLayout(3, 3, 3, 3));

        JPanel main = new JPanel(new GridLayout(3, 1, 0, 5));
        main.add(resultsPanel);
        main.add(numberButtons);
        main.add(operationButtons);

        frame.setSize(400, 557);
        frame.add(main);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
