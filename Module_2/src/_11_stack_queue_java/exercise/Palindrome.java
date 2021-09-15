package _11_stack_queue_java.exercise;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra Palindrome : ");
        String str = scanner.nextLine();
        Stack<Character> palindromeStack = new Stack<>();
        Queue<Character> palindromeQueue = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            palindromeStack.push(str.charAt(i));
            palindromeQueue.add(str.charAt(i));
        }
          while (palindromeQueue.size() != 0) {
              if (palindromeQueue.peek() != palindromeStack.peek()) {
                  System.out.println("Đây ko phải chuỗi Palindrome");
                  break;
              }
              else {
                  palindromeQueue.remove();
                  palindromeStack.pop();
              }
          }
        if ((palindromeQueue.size() == 0) && (palindromeStack.size() == 0)) {
            System.out.println("Dây là chuổi Palindrome");
        }
    }
}
