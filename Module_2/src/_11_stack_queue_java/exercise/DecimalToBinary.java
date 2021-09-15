package _11_stack_queue_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> binaryStack= new Stack<>();
        System.out.println("Nhập số cần chuyển sang nhị phân: ");
        int num= scanner.nextInt();
        int d= 0;
        do {
            d=num%2;
            binaryStack.add(d);
            num=Integer.parseInt(String.valueOf(num/2));
        } while(num > 0);
        System.out.println("Số nhị phân là : ");
        for(int i =binaryStack.size() - 1; i >= 0; i--) {
            System.out.print(binaryStack.get(i));
        }
    }
}
