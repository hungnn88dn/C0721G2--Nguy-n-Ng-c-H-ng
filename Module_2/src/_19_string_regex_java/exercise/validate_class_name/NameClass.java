package _19_string_regex_java.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static boolean validateClassName(String nameClass) {
        boolean b = nameClass.matches(NAME_CLASS_REGEX);
        return b;
    }
}
