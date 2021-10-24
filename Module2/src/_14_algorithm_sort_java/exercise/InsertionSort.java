package _14_algorithm_sort_java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(List<Integer> list){
        int pos, x;
        for(int i = 1; i < list.size(); i++){
            x = list.get(i);
            pos = i;
            while(pos > 0 && x < list.get(pos-1)){
                list.set(pos,list.get(pos -1)) ;
                pos--;
            }
            list.set(pos,x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập độ dài của danh sách cần sắp xếp: ");
        int number= scanner.nextInt();
        List<Integer> myList= new ArrayList<>();
        for ( int i =0; i <number; i++) {
            System.out.println("Nhập giá trị phần tử thứ  " + (i + 1) + " trong danh sách mảng: ");
            int value= scanner.nextInt();
            myList.add(value);
        }
        insertionSort(myList);
        System.out.println(myList);
    }
}

