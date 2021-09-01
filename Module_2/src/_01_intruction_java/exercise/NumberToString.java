package _01_intruction_java.exercise;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số vào đây: ");
        String numToString = "";
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("vui lòng nhập số lớn hơn 0");
        } else if (number < 10) {
            switch (number) {
                case 1:
                    numToString = "One";
                    break;
                case 2:
                    numToString = "Two";
                    break;
                case 3:
                    numToString = "Three";
                    break;
                case 4:
                    numToString = "Four";
                    break;
                case 5:
                    numToString = "Five";
                    break;
                case 6:
                    numToString = "Six";
                    break;
                case 7:
                    numToString = "Seven";
                    break;
                case 8:
                    numToString = "Eight";
                    break;
                case 9:
                    numToString = "Nine";
                    break;
                case 10:
                    numToString = "Ten";
                    break;

            }
            System.out.print(numToString);
        } else if (number < 20) {

            switch (number) {
                case 11:
                    numToString = "Eleven";
                    break;
                case 12:
                    numToString = "Twelve";
                    break;
                case 13:
                    numToString = "Thirteen";
                    break;
                case 14:
                    numToString = "Fourteen";
                    break;
                case 15:
                    numToString = "Fifteen";
                    break;
                case 16:
                    numToString = "Sixteen";
                    break;
                case 17:
                    numToString = "Seventeen";
                    break;
                case 18:
                    numToString = "Eighteen";
                    break;
                case 19:
                    numToString = "Nineteen";
                    break;
            }
            System.out.print(numToString);
        } else if (number < 100) {
            String tensOfNumber = "";
            String onesOfNumber = "";
            String s = String.valueOf(number);
            ;
            char tens = s.charAt(0);
            char ones = s.charAt(1);
            switch (tens) {
                case '2':
                    tensOfNumber = "Twenty";
                    break;
                case '3':
                    tensOfNumber = "Thirty";
                    break;
                case '4':
                    tensOfNumber = "Forty";
                    break;
                case '5':
                    tensOfNumber = "Fifty";
                    break;
                case '6':
                    tensOfNumber = "Sixty";
                    break;
                case '7':
                    tensOfNumber = "Seventy";
                    break;
                case '8':
                    tensOfNumber = "Eighty";
                    break;
                case '9':
                    tensOfNumber = "Ninety";
                    break;

            }

            switch (ones) {
                case '1':
                    onesOfNumber = "One";
                    break;
                case '2':
                    onesOfNumber = "Two";
                    break;
                case '3':
                    onesOfNumber = "Three";
                    break;
                case '4':
                    onesOfNumber = "Four";
                    break;
                case '5':
                    onesOfNumber = "Five";
                    break;
                case '6':
                    onesOfNumber = "Six";
                    break;
                case '7':
                    onesOfNumber = "Seven";
                    break;
                case '8':
                    onesOfNumber = "Eight";
                    break;
                case '9':
                    onesOfNumber = "Nine";
                    break;
            }
            System.out.printf("%s %s", tensOfNumber, onesOfNumber);
        } else if (number < 999) {
            String s = String.valueOf(number);
            String hundredOfNumber = "";
            String tensOfNumber = "";
            String onesOfNumber = "";
            char hundred = s.charAt(s.length() -3);
            char tens = s.charAt(s.length() -2);
            char ones = s.charAt(s.length() -1);
            switch (hundred) {
                case '1':
                    hundredOfNumber = "One hundred";
                    break;
                case '2':
                    hundredOfNumber = "Two hundred";
                    break;
                case '3':
                    hundredOfNumber = "Three hundred";
                    break;
                case '4':
                    hundredOfNumber = "Four hundred";
                    break;
                case '5':
                    hundredOfNumber = "Five hundred";
                    break;
                case '6':
                    hundredOfNumber = "Six hundred";
                    break;
                case '7':
                    hundredOfNumber = "Seven hundred";
                    break;
                case '8':
                    hundredOfNumber = "Eight hundred";
                    break;
                case '9':
                    hundredOfNumber = "Nine hundred";
                    break;
                default: hundredOfNumber = "";
            }
            switch (tens) {
                case '2':
                    tensOfNumber = "Twenty";
                    break;
                case '3':
                    tensOfNumber = "Thirty";
                    break;
                case '4':
                    tensOfNumber = "Forty";
                    break;
                case '5':
                    tensOfNumber = "Fifty";
                    break;
                case '6':
                    tensOfNumber = "Sixty";
                    break;
                case '7':
                    tensOfNumber = "Seventy";
                    break;
                case '8':
                    tensOfNumber = "Eighty";
                    break;
                case '9':
                    tensOfNumber = "Ninety";
                    break;
                default: tensOfNumber = "";
            }
            switch (ones) {
                case '1':
                    onesOfNumber = "One";
                    break;
                case '2':
                    onesOfNumber = "Two";
                    break;
                case '3':
                    onesOfNumber = "Three";
                    break;
                case '4':
                    onesOfNumber = "Four";
                    break;
                case '5':
                    onesOfNumber = "Five";
                    break;
                case '6':
                    onesOfNumber = "Six";
                    break;
                case '7':
                    onesOfNumber = "Seven";
                    break;
                case '8':
                    onesOfNumber = "Eight";
                    break;
                case '9':
                    onesOfNumber = "Nine";
                    break;
            }
            System.out.printf("%s %s %s", hundredOfNumber, tensOfNumber, onesOfNumber);
        }
    }
}

