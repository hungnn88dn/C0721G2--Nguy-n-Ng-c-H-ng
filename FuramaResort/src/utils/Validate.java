package utils;

import models.Villa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private Matcher matcher;

    public static boolean validateServiceName(String serviceName) {
        boolean b = serviceName.matches("^[S][V][VHR][LO]-[0-9]{4}$");
        return b;
    }

    public static boolean validateServiceType(String serviceType) {
        boolean b = serviceType.matches("^[A-Z][a-z]+$");
        return b;
    }

    public static boolean validateArea(String area) {
        boolean b = area.matches("^(([3-9]+[0-9])|(([1-9]+[0-9]+[0-9]))).[0-9]+$");
        return b;
    }
    public static boolean validateCostAndFloor(String costfloor) {
        boolean b = costfloor.matches("^(([1-9])|([1-9]+[0-9])|(([1-9]+[0-9]+[0-9])))$");
        return b;
    }
    public static boolean validateMaxPeople(String maxPeople) {
        boolean b = maxPeople.matches("^(([1-9])|([1]+[0-9]))$");
        return b;
    }
    public static boolean validateAllName(String allName) {
        boolean b = allName.matches("^[A-Z][a-z]*$");
        return b;
    }

    public static boolean validateBirthOfDay(String birthDay) {
        boolean b = birthDay.matches("^(([0][1-9]|[1-2][0=9])|([3][0]|[3][31]))/(([0][1-9])|([1][0-2]))/(([2][0][0][0-3])|([1][9][2-9][1-9])|([1][9][3-9][0-9]))$");
        return b;
    }
}
