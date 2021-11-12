package _05_static_modifier_java.exercise.access_modifier_circle;

public class Circle {
    private double radius = 1.0;
    private String color= "red";
    Circle() {

    }
    Circle(double radius, String color){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius*this.radius*3.14;
    }
}
