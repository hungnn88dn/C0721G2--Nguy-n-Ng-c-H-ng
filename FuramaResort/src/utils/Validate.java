package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Validate  {
    public static final String NAME_SERVICE_VILLA = "^[S][V][V][L]-\\d{4}$";
    public static final String NAME_SERVICE_HOUSE = "^[S][V][H][O]-\\d{4}$";
    public static final String NAME_SERVICE_ROOM = "^[S][V][R][O]-\\d{4}$";
    public static final String AREA = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String COST_FLOOR = "^(([1-9])|([1-9]+\\d)|(([1-9]+\\d]+\\d)))$";
    public static final String MAX_PEOPLE = "^(([3-9]+\\d)|(([1-9]+\\d+\\d))).\\d+$";
    public static final String SERVICE_TYPE = "^[A-Z][a-z]*$";
    public static final String PHONE = "^([0]|[84])\\d{9}*$";
    static Scanner scanner = new Scanner(System.in);
   public static boolean validateInput(String str, String regex) {
       boolean b = str.matches(regex);
       return b;
   }
    public static String inputBirthday() {
        while (true) {
            System.out.println("Enter birthday (dd/MM/yyyy) ");
            String birthday = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date birth = simpleDateFormat.parse(birthday);
                int yearOld = LocalDate.now().getYear()-birth.getYear()-1900;
                System.out.println(yearOld);
                if (yearOld>17&&yearOld<100) {
                    System.out.println(birthday + " is valid date");
                    return simpleDateFormat.format(birth);
                } else {
                    System.out.println("Age must be between 18 and 100");
                }

            } catch (ParseException e) {
                System.out.println("Please enter birthday again");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Validate.validateInput("0938655065",PHONE));
    }
}
