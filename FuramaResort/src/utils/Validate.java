package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate  {
    public static final String NAME_SERVICE_VILLA = "^[S][V][V][L]-\\d{4}$";
    public static final String NAME_SERVICE_HOUSE = "^[S][V][H][O]-\\d{4}$";
    public static final String NAME_SERVICE_ROOM = "^[S][V][R][O]-\\d{4}$";
    public static final String AREA = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String COST_FLOOR = "^(([1-9])|([1-9]+\\d)|(([1-9]+\\d]+\\d)))$";
    public static final String MAX_PEOPLE = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String SERVICE_TYPE = "^[A-Z][a-z]*$";

   public static boolean validateInput(String str, String regex) {
       boolean b = str.matches(regex);
       return b;
   }
//    public static boolean validateBirthOfDay(String birthDay) {
//        boolean b = birthDay.matches("^(([0][1-9]|[1-2][0=9])|([3][0]|[3][31]))/(([0][1-9])|([1][0-2]))/(([2][0][0][0-3])|([1][9][2-9][1-9])|([1][9][3-9][0-9]))$");
//        return b;
//
//    }

    public static void main(String[] args) {
       String str ="SVHO-0001";
        System.out.println(Validate.validateInput(str,NAME_SERVICE_HOUSE));
    }
}
