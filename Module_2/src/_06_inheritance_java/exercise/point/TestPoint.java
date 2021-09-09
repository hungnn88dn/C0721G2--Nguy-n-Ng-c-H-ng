package _06_inheritance_java.exercise.point;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestPoint {
    public static void main(String[] args) {
        Point point= new Point(1.0f,2.0f);
        MoveablePoint moveablePoint = new MoveablePoint(3.0f,4.0f,5.0f,6.0f);
        System.out.println(point);
        System.out.println(moveablePoint);
        Point point1 = new MoveablePoint(7.0f,8.0f,9.0f,10.0f);
        System.out.println(((MoveablePoint)point1).move());
    }
}
