package _14_algorithm_sort_java.exercise;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            System.out.println("-------------------------");
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
                System.out.println("inner" + i + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array= {5,33,6,78,8,2,4,7};
        insertionSort(array);
    }
}
