package _02_loop_java.exercise;

import java.util.Scanner;

public class DisplayPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int number = scanner.nextInt();
        if (number < 0 || number > 4) {
            System.out.println("Bạn nhập không đúng số trong danh sách");
        }
        switch (number) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" *");
                    }
                    System.out.print("\n");
                }
                ;
                break;
            case 2:
                System.out.println("Print the square triangle: ");
                System.out.println("1. The square triangle: top-left");
                System.out.println("2. The square triangle: top-right");
                System.out.println("3. The square triangle: botton-left");
                System.out.println("4. The square triangle: botton-right");
                int number2 = scanner.nextInt();
                if (number2 < 0 || number2 > 4) {
                    System.out.println("Bạn nhập không đúng số trong danh sách");
                }
                switch (number2) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 5; j > i; j--) {
                                System.out.print("* ");
                            }
                            System.out.print("\n");
                        }
                        ;
                        break;
                    case 2:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (j >= i) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.print("\n");
                        }
                        ;
                        break;
                    case 3:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.print("\n");
                        }
                        ;
                        break;
                    case 4:

                        for (int i = 5; i > 0; i--) {
                            for (int j = 0; j <= 5; j++) {
                                if (j >= i) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }

                            }
                            System.out.print("\n");
                        }
                        ;
                        break;
                }
                ;
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int k = 5; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                ;
                break;
            case 4:
                System.out.println("Chương trình đã thoát");
        }


    }
}
