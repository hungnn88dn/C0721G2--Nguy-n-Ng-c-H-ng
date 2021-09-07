package _04_Class_Object_java.exercise.StopWatch;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch() {

    }
    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        double getelapsedtime =  this.endTime - this.startTime;
        return getelapsedtime;
    }

}
