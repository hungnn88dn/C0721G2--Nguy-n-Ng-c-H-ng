package _06_inheritance_java.exercise.point2d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D= new Point2D(1.0f,2.0f);
        Point3D point3D= new Point3D(3.0f,4.0f,5.0f);
        System.out.println(point2D);
        System.out.println(point3D);
        Point2D point2D1= new Point3D(6.0f,7.0f,8.0f);
        System.out.println(Arrays.toString(point2D1.getXY()));
        System.out.println(Arrays.toString(((Point3D)point2D1).getXY()));
    }
}
