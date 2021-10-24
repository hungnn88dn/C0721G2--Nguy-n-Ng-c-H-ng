package _15_exception_debug_java.exercise;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
