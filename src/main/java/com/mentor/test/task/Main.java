package main.java.com.mentor.test.task.consoleCalc.test;

public class Main {

    public static void main(String[] args) {

        String[] stringData = DataReceiver.getData();

        if (RomeDataParser.isRome(stringData[0]) && RomeDataParser.isRome(stringData[2])) {
            RomeDataParser.main(stringData);
            int result = ArabianDataParser.parseNumbers(stringData);
            System.out.println(RomeDataParser.arabicToRome(result));
        } else {
            System.out.println(ArabianDataParser.parseNumbers(stringData));
        }
    }

}

