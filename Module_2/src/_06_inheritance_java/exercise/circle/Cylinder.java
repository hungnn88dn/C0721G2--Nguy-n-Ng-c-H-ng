package _06_inheritance_java.exercise.circle;

public class Cylinder extends Circle{
    double height;
    Cylinder(double radius, String color, double height ) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    double volume() {
        return this.radius*this.radius*height*3.14;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
