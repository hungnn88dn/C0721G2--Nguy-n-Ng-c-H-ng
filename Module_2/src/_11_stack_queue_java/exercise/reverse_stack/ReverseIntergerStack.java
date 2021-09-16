package _11_stack_queue_java.exercise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntergerStack {
    public static void main(String[] args) {
        Stack<Integer> myStack= new Stack<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int number= scanner.nextInt();
        int[] array= new int[number];
        for( int i=0; i < number; i++) {
            System.out.println("Nhập giá trị phần tử trong mảng");
            array[i]= scanner.nextInt();
        }
        System.out.println("Giá trị của mảng trước khi đảo ");
        System.out.println(Arrays.toString( array));
        for( int i=0; i < array.length; i++) {
            myStack.push(array[i]);
        }
        for( int i=0; i < array.length; i++) {
            array[i] = myStack.pop();
        }
        System.out.println("---------");
        System.out.println("Giá trị của mảng sau khi đảo ");
        System.out.println(Arrays.toString(array));
    }
}
