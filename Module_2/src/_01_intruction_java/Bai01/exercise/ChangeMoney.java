package _01_intruction_java.Bai01.exercise;
 import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so tien USD can chuyen sang VND: ");
        int number = scanner.nextInt();
        int rate = 23000;
        int value = number * rate;
        System.out.println(number + " USD doi sang VND là : " + value + " VND");
    }
}
