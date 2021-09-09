package _06_inheritance_java.exercise.point;

public class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    MoveablePoint() {

    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "(" + x + "," + y + ")" + ",speed=(" + xSpeed + "," + ySpeed + ")" +
                '}';
    }

    public String move() {
        x += xSpeed;
        y += ySpeed;
        return "(" + x + "," + y + ")";
    }
}
