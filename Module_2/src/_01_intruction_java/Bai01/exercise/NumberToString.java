package _01_intruction_java.Bai01.exercise;
import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số vào đây: ");
        String numToString;
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
        } else {
            if (number < 20) {
                switch (number) {
                    case 11:
                        numToString = "Eleven";
                        break;
                    case 12:
                        numToString = "Two";
                        break;
                    case 13:
                        numToString = "Three";
                        break;
                    case 14:
                        numToString = "Four";
                        break;
                    case 15:
                        numToString = "Five";
                        break;
                    case 16:
                        numToString = "Six";
                        break;
                    case 17:
                        numToString = "Seven";
                        break;
                    case 18:
                        numToString = "Eight";
                        break;
                    case 19:
                        numToString = "Nine";
                        break;
                }
            }
        }
    }
}

