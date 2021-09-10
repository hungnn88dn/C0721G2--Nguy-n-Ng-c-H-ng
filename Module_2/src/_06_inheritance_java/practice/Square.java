package _06_inheritance_java.practice;

import _06_inheritance_java.practice.Rectangle;
import _07_abstract_interfacce_java.exercise.colorable.Colorable;
import _07_abstract_interfacce_java.exercise.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

//    @Override
//    public String toString() {
//        return "A Square with side="
//                + getSide()
//                + ", which is a subclass of "
//                + super.toString();
//    }
}
