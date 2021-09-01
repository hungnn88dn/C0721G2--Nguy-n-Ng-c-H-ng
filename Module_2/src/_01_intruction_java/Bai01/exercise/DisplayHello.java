package _01_intruction_java.Bai01.exercise;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}