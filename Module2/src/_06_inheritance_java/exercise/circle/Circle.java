package _06_inheritance_java.exercise.circle;

public class Circle {
    private double radius;
    private String color;
    private double area;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area= this.radius*this.radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area= this.radius*this.radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area= area ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                ", area=" +this.area +
                '}';
    }
}
