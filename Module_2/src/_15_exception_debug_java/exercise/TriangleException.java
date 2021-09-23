package _15_exception_debug_java.exercise;

import java.util.Scanner;

public class TriangleException {


    public static void inputSideTriangle() throws IllegalTriangleException {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Nhập độ dài cạnh a của tam giác: ");
          int a = scanner.nextInt();
          System.out.println("Nhập độ dài cạnh b của tam giác: ");
          int b = scanner.nextInt();
          System.out.println("Nhập độ dài cạnh c của tam giác: ");
          int c = scanner.nextInt();
          if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
              throw new IllegalTriangleException();
          } else {
              System.out.println(" Độ dài lần lượt các cạnh của tam giác là : " + a + " , " + b + " , " + c);
          }
    }

    public static void main(String[] args) throws IllegalTriangleException {
      try{
          TriangleException.inputSideTriangle();
      }catch (IllegalTriangleException e) {
          System.out.println("Đây không phải là một tam giác");
      }
    }
}
