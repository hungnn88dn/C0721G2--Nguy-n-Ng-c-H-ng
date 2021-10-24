package _10_list_java.exercise.arraylist;

import _10_list_java.pratice.mylist.MyList;

import java.util.Arrays;

public class TestMyArrayList extends MyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList= new MyArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
       myArrayList.remove(2);
       myArrayList.add(2,5);
       MyList<Integer> myArrayList1= new MyList<Integer>();
       myArrayList1 = myArrayList.clone();
        for( int i =0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList1.get(i));
        }
        System.out.println(myArrayList.contains(1));
        System.out.println(myArrayList.indexOf(2));
        System.out.println(myArrayList.get(2));
        myArrayList.clear();
        for( int i =0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}