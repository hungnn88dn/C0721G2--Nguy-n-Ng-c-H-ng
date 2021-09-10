package _07_abstract_interfacce_java.exercise.colorable;

import _06_inheritance_java.practice.Circle;
import _06_inheritance_java.practice.Rectangle;
import _06_inheritance_java.practice.Shape;
import _06_inheritance_java.practice.Square;

import java.util.Arrays;

public class TestColorable {
    public static void main(String[] args) {
        Shape retangle= new Rectangle(3.0,4.0);
        Shape circle= new Circle(5.0);
        Shape square= new Square(6.0);
        Shape[] shapes= {retangle,circle,square};
        System.out.println(Arrays.toString(shapes));
    }
}
