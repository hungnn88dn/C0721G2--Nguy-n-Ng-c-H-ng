package _13_algorithm_search_java.exercise;


import java.util.*;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần sắp xếp");
        String str = scanner.nextLine();
        List<String> listMax = new ArrayList<>();
        listMax.add(Character.toString(str.charAt(0)));
        for (int i = 0; i < str.length(); i++) {
            List<String> listTemp = new ArrayList<>();
            listTemp.add(Character.toString(str.charAt(i)));
            for (int j = i + 1; j < str.length(); j++) {
                if (Character.toString(str.charAt(j)).compareTo(listTemp.get(listTemp.size() - 1)) > 0) {
                    listTemp.add(Character.toString(str.charAt(j)));
                }
            }
            if (listTemp.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(listTemp);
            }
            listTemp.clear();
        }
        System.out.println(listMax);
    }
}
//  Độ phức tạp của bài toán:
//    1 vòng lặp ngoài = m ;
//    1 vòng lặp trong = n ;
//    1 câu lệnh = 1;
//    T(n) = (m * n) + 1;
//    T(n)= O(mn);
//    ==> Độ phực tạp là O(mn);