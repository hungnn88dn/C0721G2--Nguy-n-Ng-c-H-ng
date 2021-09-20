package _13_algorithm_search_java.exercise;


import java.util.*;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần sắp xếp");
        String str = scanner.nextLine();
        List<String> listStr = new ArrayList<>();
        listStr.add(Character.toString(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
                if (Character.toString(str.charAt(i)).compareTo(listStr.get(listStr.size() - 1)) > 0) {
                    listStr.add(Character.toString(str.charAt(i)));
                }
        }
        System.out.println(listStr);
    }
}
//  Độ phức tạp của bài toán:
//    1 vòng lặp = n ;
//    1 câu lệnh = 1;
//    T(n) = n + 1;
//    T(n)= O(n);
//    ==> Độ phực tạp là O(n);