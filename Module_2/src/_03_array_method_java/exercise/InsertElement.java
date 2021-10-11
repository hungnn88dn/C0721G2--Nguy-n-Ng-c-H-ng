package _03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Nhập số cần chèn : ");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn vào : ");
        int index = scanner.nextInt();

        int[] array1 = new int[array.length + 1];
        array1[index] = number;
        for (int i = 0; i < array1.length; i++) {
            if (i < index) {
                array1[i] = array[i];
            }
            if (i > index) {
                array1[i] = array[i - 1];
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
