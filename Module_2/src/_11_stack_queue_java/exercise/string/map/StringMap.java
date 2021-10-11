package _11_stack_queue_java.exercise.string.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringMap {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String str = scanner.nextLine();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (myMap.containsKey(str.charAt(i))) {
                myMap.put(str.charAt(i),myMap.get(str.charAt(i)) + 1 );
            } else {
                myMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(myMap);
    }


}
