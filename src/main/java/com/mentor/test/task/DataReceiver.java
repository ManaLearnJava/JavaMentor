package main.java.com.mentor.test.task.consoleCalc.test;

import java.util.Scanner;

public class DataReceiver {

    public static String[] getData() {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString.split(" ");
    }

}