package bean;

import java.util.EmptyStackException;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

   public double add() {
        return  this.a + this.b;
    }
    public double sub() {
        return  this.a - this.b;
    }
    public double mul() {
        return  this.a * this.b;
    }
    public double div() throws Exception {
        if (this.b != 0) {
            return this.a/this.b;
        }else {
            throw new Exception("Second operand not zero") ;
        }
    }

}
