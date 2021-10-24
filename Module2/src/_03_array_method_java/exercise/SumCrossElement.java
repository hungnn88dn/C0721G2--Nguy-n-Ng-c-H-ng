package _03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumCrossElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng và cột của mảng 2 chiều vuông");
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Nhập giá trị phần tử " + i + " " + j + " của mảng");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng hiện tại có giá trị là : " + Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i  == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo trong mảng 2 chiêu vuông  là: " + sum);
    }
}
