package _06_inheritance_java.exercise.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"blue");
        Cylinder cylinder= new Cylinder(4.0, "red",5.0);
        System.out.println(circle);
        System.out.println(cylinder);
        Circle cylinder1= new Cylinder(6.0,"green",7.0);
        System.out.println("Diện tích mặt tròn của hình trụ là: " + cylinder1.area());
    }
}
