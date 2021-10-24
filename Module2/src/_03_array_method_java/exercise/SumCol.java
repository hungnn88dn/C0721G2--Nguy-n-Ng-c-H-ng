package _03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị phần tử " + i + " " + j + " của mảng");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng hiện tại có giá trị là : " + Arrays.deepToString(array));
        System.out.println("Nhập giá trị của cột bạn cần cộng : ");
        int number = scanner.nextInt();
        if (number > col || number == 0) {
            System.out.println("Số thư tự của cột bạn nhập không chính xác");
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(number == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của cột thứ " + number + " là " + sum);
    }
}
