package _19_string_regex_java.exercise.validate_class_name;

import _19_string_regex_java.practice.validate_email.EmailExample;

public class NameClassTest {
    public static final String[] validNameClass = new String[]{"C0318G", "A0348G", "P0312G"};
    public static final String[] invalidNameClass = new String[]{"M0318G", "P0323A"};

    public static void main(String args[]) {
        for (String nameClass : validNameClass) {
            boolean isvalid = NameClass.validateClassName(nameClass);
            System.out.println("ClassName is " + nameClass + " is valid: " + isvalid);
        }
        for (String nameClass : invalidNameClass) {
            boolean isvalid = NameClass.validateClassName(nameClass);
            System.out.println("ClassName is " + nameClass + " is valid: " + isvalid);
        }
    }
}
