package _05_static_modifier_java.exercise.access_modifier_circle;

import com.sun.javaws.IconUtil;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle= new Circle(4.0,"blue");
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
