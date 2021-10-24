package _07_abstract_interfacce_java.exercise.resizeable;


import _06_inheritance_java.practice.Circle;
import _06_inheritance_java.practice.Rectangle;
import _06_inheritance_java.practice.Shape;
import _06_inheritance_java.practice.Square;

import java.util.Arrays;

public class TestResizeable {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Circle circle = new Circle(4.0);
        Square square = new Square(6.0);
        Shape[] shapes = {rectangle, circle, square};

        System.out.println("Diện tích các hình trước khi chạy phương thức resize: ");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
            if (shapes[i] instanceof Circle) {
                System.out.println(((Circle) shapes[i]).getArea());
            }
        }

        System.out.println("Diện tích các hình sau khi chạy phương thức resize: ");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                ((Rectangle) shapes[i]).resize(((float) Math.floor(((Math.random() * 100) + 1)) / 100));
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
            if (shapes[i] instanceof Circle) {
                ((Circle) shapes[i]).resize(((float) Math.floor(((Math.random() * 100) + 1)) / 100));
                System.out.println(((Circle) shapes[i]).getArea());
            }
        }
    }
}
