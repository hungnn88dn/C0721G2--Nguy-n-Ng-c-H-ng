package utils;

import models.Villa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private Matcher matcher;

    public static boolean validateVillaName(String villaName) {
        boolean b = villaName.matches("^[S][V][V][L]-[0-9]{4}$");
        return b;
    }
    public static boolean validateHouseName(String houseName) {
        boolean b = houseName.matches("^[S][V][H][O]-[0-9]{4}$");
        return b;
    }
    public static boolean validateRoomName(String roomName) {
        boolean b = roomName.matches("^[S][V][R][O]-[0-9]{4}$");
        return b;
    }
    public static boolean validateVillaType(String villaType) {
        boolean b = villaType.matches("^[V][i][l][l][a]$");
        return b;
    }
    public static boolean validateHouseType(String houseType) {
        boolean b = houseType.matches("^[H][o][u][s][e]$");
        return b;
    }
    public static boolean validateRoomType(String roomType) {
        boolean b = roomType.matches("^[R][o][o][m]$");
        return b;
    }
    public static boolean validateArea(String area) {
        boolean b = area.matches("^(([3-9]+[0-9])|(([1-9]+[0-9]+[0-9]))).[0-9]+$");
        return b;
    }
    public static boolean validateRentalCost(String rentalCost) {
        boolean b = rentalCost.matches("^(([1-9])|([1-9]+[0-9])|(([1-9]+[0-9]+[0-9])))$");
        return b;
    }
    public static boolean validateMaxPeople(String maxPeople) {
        boolean b = maxPeople.matches("^(([1-9])|([1]+[0-9]))$");
        return b;
    }
    public static boolean validateFloor(String floor) {
        boolean b = floor.matches("^(([1-9])|([1-9]+[0-9])|(([1-9]+[0-9]+[0-9])))$");
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

    public static void main(String[] args) {
        System.out.println(Validate.validateBirthOfDay("01/10/1988"));
    }
}
