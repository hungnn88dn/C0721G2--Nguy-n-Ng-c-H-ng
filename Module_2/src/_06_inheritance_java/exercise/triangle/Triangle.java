package _06_inheritance_java.exercise.triangle;

import _06_inheritance_java.practice.Shape;

public class Triangle extends Shape {
    double side1=1.0;
    double side2=1.0;
    double side3=1.0;
  Triangle(){

  }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    double getPerimeter(){
      return this.side1 + this.side2 + this.side3;
    }
    double getArea() {
      double p= (this.side1 + this.side2 + this.side3)/2;
      return (double)Math.sqrt(p*(p- this.side1)*(p - this.side2)*(p - this.side3));
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
