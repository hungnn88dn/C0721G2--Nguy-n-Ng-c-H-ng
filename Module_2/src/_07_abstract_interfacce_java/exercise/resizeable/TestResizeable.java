package _07_abstract_interfacce_java.exercise.resizeable;


import _06_inheritance_java.practice.Circle;
import _06_inheritance_java.practice.Rectangle;
import _06_inheritance_java.practice.Shape;
import _06_inheritance_java.practice.Square;

import java.util.Arrays;

public class TestResizeable {
    public static void main(String[] args) {
//        Shape rectangle= new Rectangle(3.0,4.0);
//        Shape circle= new Circle(4.0);
//        Shape square= new Square(6.0);
//        Shape[] shapes= {rectangle,circle,square};
//        System.out.println(Arrays.toString(shapes));
//        ((Rectangle)rectangle).resize(((Math.random() * 100) + 1));
//        ((Circle)circle).resize(((Math.random() * 100) + 1));
//        ((Square)square).resize(((Math.random() * 100) + 1));
//        System.out.println(Arrays.toString(shapes));

        Rectangle rectangle= new Rectangle(3.0,4.0);
        Circle circle= new Circle(4.0);
        Square square= new Square(6.0);
        double[] shapes= {rectangle.getArea(),circle.getArea(),square.getArea()};
        System.out.println(Arrays.toString(shapes));
        rectangle.resize(((float) Math.floor(((Math.random() * 100) + 1))/100));
        circle.resize(((float) Math.floor(((Math.random() * 100) + 1))/100));
        square.resize(((float) Math.floor(((Math.random() * 100) + 1))/100));
        double[] shapes1= {rectangle.getArea(),circle.getArea(),square.getArea()};
        System.out.println(Arrays.toString(shapes1));
    }
}
