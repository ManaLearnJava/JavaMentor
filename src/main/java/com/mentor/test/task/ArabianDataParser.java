package main.java.com.mentor.test.task.consoleCalc.test;

public class ArabianDataParser {

    private static String[] str;

    public static int parseNumbers(String[] args) {
        ArabianDataParser.str = args;

        int firstNumber = Integer.parseInt(args[0]);
        int secondFirst = Integer.parseInt(args[2]);
        int result;

        if (firstNumber < 0 || firstNumber > 10 || secondFirst < 0 || secondFirst > 10 || args.length != 3) {
            throw new IllegalArgumentException("Вы ввели неверное число или более 3 аргументов");
        } else {
            result = Calculator.calculate(firstNumber, secondFirst, args[1]);
        }

        return result;
    }

}
