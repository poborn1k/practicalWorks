package pw20.task2_3;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Application extends JFrame {
    private static final List<String> value = Arrays.asList("(", ")", "+", "-", "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "=", "C", "0", "del");
    JPanel valueButtons = new JPanel();
    private final StringBuilder expression = new StringBuilder();


    Application() {
        JFrame frame = new JFrame("RPN CALCULATOR");


        JTextField expressionField = new JTextField(15);
        expressionField.setEditable(false);
        JTextField rpnField = new JTextField(15);
        rpnField.setEditable(false);
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);


        JLabel expressionTitle = new JLabel("Expression");
        JLabel rpnTitle = new JLabel("RPN notation");
        JLabel resultTitle = new JLabel("Result");


        value.forEach(sym -> {
            JButton valueBTN = new JButton(sym);
            valueBTN.addActionListener(e -> {
                switch (sym) {
                    case "C" -> {
                        expression.delete(0, expression.length());
                        expressionField.setText("");
                        rpnField.setText("");
                        resultField.setText("");
                    }
                    case "=" -> {
                        if (!expression.isEmpty()) {
                            RPNCalculator calculator = new RPNCalculator();
                            String RPN = calculator.expressionToRPN(expression.toString());
                            String calculationResult = calculator.RPNToAnswer(RPN);

                            rpnField.setText(RPN);
                            resultField.setText(calculationResult);

                            expression.delete(0, expression.length());
                        }
                    }
                    case "del" -> {
                        if (!expression.isEmpty()) {
                            expression.delete(expression.length() - 1, expression.length());
                            expressionField.setText(expression.toString());
                        }
                    }
                    default -> {
                        expression.append(sym);
                        expressionField.setText(expression.toString());
                    }
                }
            });
            valueButtons.add(valueBTN);
        });
        valueButtons.setLayout(new GridLayout(5, 4, 3, 3));


        JPanel resultsPanel = new JPanel(new GridBagLayout());

        resultsPanel.add(expressionTitle, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.BASELINE, GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 40));
        resultsPanel.add(expressionField, new GridBagConstraints(1, 0, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));

        resultsPanel.add(rpnTitle, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.BASELINE, GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 40));
        resultsPanel.add(rpnField, new GridBagConstraints(1, 1, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));

        resultsPanel.add(resultTitle, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.BASELINE, GridBagConstraints.NONE, new Insets(1, 1, 1, 1), 0, 40));
        resultsPanel.add(resultField, new GridBagConstraints(1, 2, 5, 1, 5, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(10, 0, 0 ,0), 20, 20));



        JPanel mainPanel = new JPanel(new GridLayout(2, 1, 0, 5));
        mainPanel.add(resultsPanel);
        mainPanel.add(valueButtons);


        frame.add(mainPanel);
        frame.setSize(400, 557);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();

    }
}
