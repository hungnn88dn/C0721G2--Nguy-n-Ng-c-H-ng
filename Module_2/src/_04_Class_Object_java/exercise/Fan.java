package _04_Class_Object_java.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public String toString() {
        if (isOn()) {
            return "Fan{speed " + speed + " , color "  + color + " , radius "  + radius + " , fan is on }"  ;

        } else  {
             return "Fan{speed " + speed + " , color "  + color + " , radius "  + radius + " , fan is off }"  ;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "yellow", true);
        Fan fan2 = new Fan(2, 5, "blue", false);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
