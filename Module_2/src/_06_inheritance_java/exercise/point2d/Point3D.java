package _06_inheritance_java.exercise.point2d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D() {

    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array= {getX(),getY(),this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D (" +
                " x=" + getX() +
                ", y=" + getY() +
                ", z=" + this.z +
                ')';
    }
}
