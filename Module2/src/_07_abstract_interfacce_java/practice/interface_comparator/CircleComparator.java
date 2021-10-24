package _07_abstract_interfacce_java.practice.interface_comparator;


import _06_inheritance_java.practice.Circle;

public class CircleComparator extends Circle implements Comparable<Circle> {


    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}
