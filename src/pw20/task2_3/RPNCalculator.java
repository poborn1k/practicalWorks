package pw20.task2_3;

import java.util.Stack;

public class RPNCalculator {

    public String expressionToRPN(String expression) {
        if (!stringIsCorrect(expression)) {
            return "";
        }

        String current = "";
        Stack<Character> stack = new Stack<>();

        int priority;
        for (int i = 0; i < expression.length(); i++) {
            priority = getPriority(expression.charAt(i));

            if (priority == 0) {
                current += expression.charAt(i);
            } else if (priority == 1) {
                stack.push(expression.charAt(i));
            } else if (priority > 1) {
                current += " ";

                while (!stack.isEmpty()) {
                    if (getPriority(stack.peek()) >= priority) {
                        current += stack.pop();
                    } else {
                        break;
                    }
                }

                stack.push(expression.charAt(i));
            } else if (priority == -1) {
                current += " ";

                while (getPriority(stack.peek()) != 1) {
                    current += stack.pop();
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            current += " " + stack.pop();
        }

        return current;
    }

    public String RPNToAnswer(String rpn) {
        if (rpn.isEmpty()) {
            return "Invalid input";
        }

        String operand = "";
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ') {
                continue;
            }
            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) {
                        break;
                    }
                }

                stack.push(Double.parseDouble(operand));
                operand = "";
            }
            if (getPriority(rpn.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();

                if (rpn.charAt(i) == '+') {
                    stack.push(b + a);
                } else if (rpn.charAt(i) == '-') {
                    stack.push(b - a);
                } else if (rpn.charAt(i) == '*') {
                    stack.push(b * a);
                } else if (rpn.charAt(i) == '/') {
                    stack.push(b / a);
                }
            }
        }

        return String.valueOf(stack.pop());
    }

    private int getPriority(char sym) {
        return switch (sym) {
            case '*', '/' -> 3;
            case '+', '-' -> 2;
            case '(' -> 1;
            case ')' -> -1;
            default -> 0;
        };
    }

    private boolean stringIsCorrect(String input) {
        if (input.length() < 3) {
            return false;
        } else {
            Stack<Character> brackets = new Stack<>();
            int operations = 0;
            int values = 0;

            for (int i = 0; i < input.length(); i++) {
                int priority = getPriority(input.charAt(i));

                switch (priority) {
                    case 2, 3 -> {
                        if (i == 0 || (input.charAt(i) == input.charAt(i - 1))) {
                            return false;
                        }
                        operations++;
                    }
                    case 0 -> {
                        if (input.charAt(i) == '0' && input.charAt(i - 1) == '/') {
                            return false;
                        }
                        values++;

                        int j = i + 1;
                        while (j < input.length() && getPriority(input.charAt(j)) == 0) {
                            j++;
                        }
                        i = j - 1;
                    }
                    case 1 -> brackets.push('(');
                    case -1 -> {
                        if (brackets.isEmpty()) {
                            return false;
                        }
                        brackets.pop();
                    }
                }
            }

            if (!brackets.isEmpty()) {
                return false;
            }

            return values > operations;
        }
    }
}
