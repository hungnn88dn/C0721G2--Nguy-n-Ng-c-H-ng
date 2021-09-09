package _04_class_object_java.exercise;

public class QuadraticEquation {

    double a,b,c;
    public QuadraticEquation(double a,double b,double c) {
        this.a= a;
        this.b= b;
        this.c= c;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation= new QuadraticEquation(1,3,1);
        System.out.println(quadraticEquation.getDiscriminant());
       if (quadraticEquation.getDiscriminant() >= 0) {
           System.out.println("Phương trình có 2 nghiệm là " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
       }else if (quadraticEquation.getDiscriminant() >= 0) {
           System.out.println("Phương trình có 1 nghiệm là " +quadraticEquation.getRoot1());
       }else {
           System.out.println("Phương trình vô nghiệm");
       }
    }

    public double getDiscriminant() {
        double delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1() {
        double r1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        return r1;
    }
    public double getRoot2() {
        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
        return r2;
    }


}
