package _03_array_method_java.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array= {1,2,3,4,5,6};
        System.out.println("Nhập số cần xoá : ");
        int number = scanner.nextInt();
        int index= 0;
        boolean flag= false;
        for (int i = 0; i < array.length ; i++) {
            if (number == array[i]) {
                index += i;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Số bạn nhập không nằm trong mảng");
        }
        for(int i = index + 1; i < array.length; i++) {
            array[i -1] = array[i];
        }
        array[array.length -1]=0;
        System.out.println(Arrays.toString(array));
    }
}
