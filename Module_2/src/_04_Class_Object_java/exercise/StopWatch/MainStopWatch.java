package _04_Class_Object_java.exercise.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int[] array = {1, 2, 3, 4, 5};
        int sum=0;
        stopwatch.getStartTime();
        for(int i=0; i < array.length; i++) {
            sum+= array[i];
        }
        System.out.println(sum);
        stopwatch.getEndTime();
        System.out.println(stopwatch.getElapsedTime());
    }
}
