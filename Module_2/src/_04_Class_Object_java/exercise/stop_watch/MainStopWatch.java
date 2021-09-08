package _04_Class_Object_java.exercise.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(((Math.random() * 100000) + 1));
        }
        stopwatch.start();
        SelectionSort.sort(arr);
        stopwatch.stop();
        stopwatch.getElapsedTime();
        System.out.println(stopwatch.getElapsedTime() + " milisecond giay");

    }
}
