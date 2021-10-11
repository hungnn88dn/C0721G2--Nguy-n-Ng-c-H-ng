package _06_inheritance_java.exercise.triangle;

import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh :");
        double side1= Double.parseDouble(scanner.nextLine());
        double side2= Double.parseDouble(scanner.nextLine());
        double side3= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu của tam giác: ");
        String color= scanner.nextLine();
        Triangle triangle= new Triangle(color,true,side1,side2,side3);
        System.out.println("Màu sắc của tam giác là: " + color + ", chu vi của tam giác là : " + triangle.getPerimeter() + ", diện tích của tam giác là : " + triangle.getArea());

    }
}
