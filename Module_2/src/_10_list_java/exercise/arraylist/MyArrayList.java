package _10_list_java.exercise.arraylist;


import _10_list_java.pratice.mylist.MyList;

import java.util.Arrays;

public class MyArrayList<E>  {
    private static final int DEFAULT_CAPACITY = 10;
    int size = 0;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }
    public void add(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            if (size == elements.length) {
                ensureCapa();
            }
            size++;
            for (int i = size - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
    }

    public E remove(int index) {
        ensureCapa();
        if (index >= 0 && index < size) {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
        return (E) elements;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> clone = new MyList<>();
        for (int i = 0; elements[i] != null; i++) {
            clone.add((E) elements[i]);
        }
        return clone;
    }

    public boolean contains(E element) {
        for (int i = 0; i < elements.length; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (element.equals(elements[i])) {
                index = i;
            }
        }
        return index;
    }

    public boolean addElement(E element) {
        if (size == elements.length) {
            ensureCapa();
            elements[size++] = element;
        }
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i <DEFAULT_CAPACITY ; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
