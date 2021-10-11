package _06_inheritance_java.practice;

import _07_abstract_interfacce_java.exercise.colorable.Colorable;
import _07_abstract_interfacce_java.exercise.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Diện tích là " +
                getArea() + " "
               ;
    }

    @Override
    public void resize(double percent) {
        this.radius= this.radius*percent;
    }
}
