package main.java.com.mentor.test.task.consoleCalc.test;

public class Calculator {

    public static int calculate(int number1, int number2, String operation) {

        return switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            case "%" -> number1 % number2;
            default -> throw new IllegalArgumentException("Неверный знак операции");
        };
    }

}
