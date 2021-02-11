package main.java.com.mentor.test.task.consoleCalc.test;

import java.util.List;

public class RomeDataParser {

    private static int result;
    private static String dozen;
    private static String units;

    public static void main(String[] romanNumber) {
        for (int i = 0; i < 3; i++) romanNumber[i] = romeToArabic(romanNumber[i]);
    }

    public static String romeToArabic(String romeNumber) {
        return switch (romeNumber) {
            case "I" -> "1";
            case "II" -> "2";
            case "III" -> "3";
            case "IV" -> "4";
            case "V" -> "5";
            case "VI" -> "6";
            case "VII" -> "7";
            case "VIII" -> "8";
            case "IX" -> "9";
            case "X" -> "10";
            default -> romeNumber;
        };
    }

    public static boolean isRome(String number) {

        List<String> strings = List.of("I", "V", "X");
        for (String elements : strings) {
            if (number.contains(elements)) {
                return true;
            }
        }
        return false;
    }

    public static String arabicToRome(int result) {
        RomeDataParser.result = result;
        String dozen = String.valueOf(result / 10 * 10);
        String units = String.valueOf(result % 10);
        return getRomeDozen(dozen) + getRomeUnits(units);
    }

    public static String getRomeDozen(String dozen) {
        RomeDataParser.dozen = dozen;
        return switch (dozen) {
            case "10" -> "X";
            case "20" -> "XX";
            case "30" -> "XXX";
            case "40" -> "XL";
            case "50" -> "L";
            case "60" -> "LX";
            case "70" -> "LXX";
            case "80" -> "LXXX";
            case "90" -> "XC";
            case "100" -> "C";
            default -> "";
        };
    }

    public static String getRomeUnits(String units) {
        RomeDataParser.units = units;

        return switch (units) {
            case "1" -> "I";
            case "2" -> "II";
            case "3" -> "III";
            case "4" -> "IV";
            case "5" -> "V";
            case "6" -> "VI";
            case "7" -> "VII";
            case "8" -> "VIII";
            case "9" -> "IX";
            default -> "";
        };
    }

}