package _03_array_method_java.exercise;
import java.util.Scanner;
public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array= new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị của phần tử " + i + " của mảng");
            array[i]= Integer.parseInt(scanner.nextLine() );
        }
        int min= array[0];
        for (int i = 1; i < array.length ; i++) {
            if ( min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là : " + min);
    }
}
