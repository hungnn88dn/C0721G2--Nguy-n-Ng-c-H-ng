package _06_inheritance_java.exercise.circle;

public class Cylinder extends Circle{
   private double height;
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
        return super.getRadius()*super.getRadius()*this.height*3.14;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
