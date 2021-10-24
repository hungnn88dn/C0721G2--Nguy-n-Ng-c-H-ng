package _11_stack_queue_java.exercise.reverse_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần đảo : ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        for (int i=0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        for (int i=0; i < str.length(); i++) {
            charArray[i] =wStack.pop();
        }
        str= new String(charArray);
        System.out.println("----------------");
        System.out.println("Chuỗi sau khi đảo: " + str);
    }
}
