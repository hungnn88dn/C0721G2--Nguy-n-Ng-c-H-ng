package _03_array_method_java.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array= {1,2,3,4,5,6,7,0,0};
        System.out.println("Nhập số cần chèn : ");
        int number= scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn vào : ");
        int index= scanner.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        for ( int i = array.length -2; i > index; i --) {
             int temp = array[i];
             array[i]= array[i -1];
             array[i -1]= temp;
        }
        array[index]= number;
        System.out.println(Arrays.toString(array));
    }
}
