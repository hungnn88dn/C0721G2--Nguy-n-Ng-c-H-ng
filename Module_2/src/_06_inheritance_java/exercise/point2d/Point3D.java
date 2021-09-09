package _06_inheritance_java.exercise.point2d;

public class Point3D extends Point2D {
    float z = 0.0f;

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
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array= {this.x,this.y,this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D (" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                ')';
    }
}
