package _11_stack_queue_java.exercise.optional;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr= {6,2,3,8};
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
