package _02_loop_java.exercise;

import java.util.Scanner;

public class PrimeNumber20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong cac so nguyen to can in ra :");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i < N; i++) {
                if ((N % i) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(N + " ");
                count = count + 1;
            }
            N= N + 1;
        }
    }
}
