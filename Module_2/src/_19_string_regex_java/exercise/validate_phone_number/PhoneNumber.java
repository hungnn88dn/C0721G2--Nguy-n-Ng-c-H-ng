package _19_string_regex_java.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER_REGEX = "[(]\\d{2}[)]-[(][0]\\d{9}[)]";

    public static boolean validatePhoneNumber(String nameClass) {
        boolean b = nameClass.matches(PHONE_NUMBER_REGEX);
        return b;
    }
}
