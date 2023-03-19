package HW4;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Inputs {

    public static String dateEnd(){
        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        int month = scanner.nextInt();
//        int year = scanner.nextInt();
        int day = 30;
        int month = 3;
        int year = 2023;
        int hour = 15;
        int min = 30;
        int sec = 10;
        scanner.close();
        return new GregorianCalendar(year, month, day, hour, min, sec).getTime().toString();
    }
}
