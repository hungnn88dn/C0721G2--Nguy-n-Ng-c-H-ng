package _04_Class_Object_java.exercise.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        int arr[] = new int[100000];
        for (int i = arr.length -1; i >= 0; i--) {
            arr[i] = i;
        }
        stopwatch.sort(arr);
        stopwatch.stop();
        stopwatch.getElapsedTime();
        System.out.println(stopwatch.getElapsedTime() + " milisecond giay");
    }
}
