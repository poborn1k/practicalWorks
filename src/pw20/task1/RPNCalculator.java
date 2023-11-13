package pw20.task1;

import java.util.Stack;

public class RPNCalculator {
    RPNCalculator(String expression) {
        if (!expression.isEmpty()) {
            System.out.println("Usual: " + expression);
            System.out.println("RPN: " + expressionToRPN(expression));
            System.out.println("Answer: " + RPNToAnswer(expressionToRPN(expression)));
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String expressionToRPN(String expression) {
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

    public static double RPNToAnswer(String rpn) {
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

        return stack.pop();
    }

    private static int getPriority(char token) {
        return switch (token) {
            case '*', '/' -> 3;
            case '+', '-' -> 2;
            case '(' -> 1;
            case ')' -> -1;
            default -> 0;
        };
    }
}
