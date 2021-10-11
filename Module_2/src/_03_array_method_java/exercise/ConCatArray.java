package _03_array_method_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ConCatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " của mảng array1");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " của mảng array2");
            array2[i] = scanner.nextInt();
        }
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = array1.length; i < array.length; i++) {
            array[i] = array2[i - array1.length];
        }
        System.out.println(Arrays.toString(array));
    }
}
