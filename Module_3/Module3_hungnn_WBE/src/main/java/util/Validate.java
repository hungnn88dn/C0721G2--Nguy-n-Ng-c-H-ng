package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Validate  {
    public static final String NAME_SERVICE_VILLA = "^[S][V][V][L]-\\d{4}$";
    public static final String NAME_SERVICE_HOUSE = "^[S][V][H][O]-\\d{4}$";
    public static final String EMAIL= "^\\w+@\\w+(.\\w+)+$";
    public static final String AREA = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String COST_FLOOR = "^(([1-9])|([1-9]+\\d)|(([1-9]+\\d]+\\d)))$";
    public static final String MAX_PEOPLE = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String PHONE = "^([0]|[8][4])\\d{9}$";
    public static boolean validateInput(String str, String regex) {
        boolean b = str.matches(regex);
        return b;
    }
}
