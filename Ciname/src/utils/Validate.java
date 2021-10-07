package utils;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public static final String MOVIE_SHOWING_ID = "^[C][I]-\\d{4]$";
    public static final String NAME_MOVIE = "^([A-Z][a-z]*)+$";
    public static final String TICKET_NUMBER = "^(([1-9])|([1-9]+\\d)|(([1-9]+\\d]+\\d)))$";

    public static boolean validateInput(String str, String regex) {
        boolean b = str.matches(regex);
        return b;
    }

    public static String valadateDay() {
        System.out.println("Input day movie Showing - dd/MM/yyyy");
        String dayShowing = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String day = simpleDateFormat.format(date);
        boolean flag = false;
        do {
            if (dayShowing.compareTo(day) > 0) {
                flag = true;
                return  dayShowing;
            } else {
                System.out.println("Please input again");
                 dayShowing = scanner.nextLine();
            }
        } while (flag);
        return dayShowing;
    }
}
