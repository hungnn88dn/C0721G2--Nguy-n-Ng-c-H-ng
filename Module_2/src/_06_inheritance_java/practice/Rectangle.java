package _06_inheritance_java.practice;

import _07_abstract_interfacce_java.exercise.colorable.Colorable;
import _07_abstract_interfacce_java.exercise.resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable, Colorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Diện tích là:" +
                 getArea() + "-" +
                howToColor()
                ;
    }

    @Override
    public void resize(double percent) {
        this.width= width*percent;
        this.length= length*percent;
    }

    @Override
    public String howToColor() {
        return  "Color all four sides";
    }
}