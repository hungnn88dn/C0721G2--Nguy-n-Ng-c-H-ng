package _03_array_method_java.exercise;
import java.util.Scanner;
public class CharInString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String str= scanner.nextLine();
        System.out.println("Nhập từ cần kiểm tra số lần xuất hiện trong chuỗi trên: ");
        String str2= scanner.nextLine();
        if ( str2.length() > 1) {
            System.out.println("Vui lòng chỉ nhập 1 ký tự");
        }
        char c= str2.charAt(0);
        int count = 0;
         for (int i =0; i < str.length(); i ++) {
               if ( c == str.charAt(i)) {
                   count++;
               }
         }
        System.out.println("Ký tự " + c + " xuất hiên " + count + " lần");
    }
}
