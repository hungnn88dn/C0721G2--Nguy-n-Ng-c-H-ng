package _19_string_regex_java.exercise.validate_phone_number;

import _19_string_regex_java.exercise.validate_class_name.NameClass;
import _19_string_regex_java.practice.validate_email.EmailExample;

public class PhoneNumberTest {

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(84)-(0978489426)", "(84)-(0978239652)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(2222222222)", "(88)-(0222222a22)", "(84)-(22222224444)", "81)-(022222224444)"};

    public static void main(String args[]) {
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = PhoneNumber.validatePhoneNumber(phoneNumber);
            System.out.println("Phone Number is " + phoneNumber + " is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = NameClass.validateClassName(phoneNumber);
            System.out.println("Phone Number is " + phoneNumber + " is valid: " + isvalid);
        }
    }
}