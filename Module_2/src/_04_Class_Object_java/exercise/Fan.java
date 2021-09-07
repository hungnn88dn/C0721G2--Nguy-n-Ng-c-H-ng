package _04_Class_Object_java.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST  = 3;

    private int speed() {
        return 1;
    }
    private boolean on() {
        return false;
    }
    private double radius() {
        return 5;
    }
    private String color() {
        return "blue";
    }

    private int getSLOW() {
        return SLOW;
    }
    private int getMEDIUM() {
        return MEDIUM;
    }
    private int getFAST() {
        return FAST;
    }
}
