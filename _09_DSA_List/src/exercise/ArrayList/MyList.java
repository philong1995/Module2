package exercise.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[elements.length+capacity];
    }

    public void add(E e){
        elements[size] = e;
        size++;
    }

    public void add(E e,int index) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        }
        return null;
    }

    public E remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i-1] = elements[i];
            }
            size--;
        }
        return null;
    }

    public E clone(){
        MyList<E> clone = new MyList<>(elements.length);
        clone.elements = Arrays.copyOf(elements, size);
        return (E) clone;
    }

// Mở rộng mảng.
    public void ensureCapacity(int minCapacity){
        if (minCapacity > 0){
            int newSize = elements.length+minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }

    public int indexOf(E e){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(e)){
                return i;
            }
        }
        return index;
    }

    public boolean contains (E e) {
        return this.indexOf(e) >=0;
    }

    public int size(){
        return size;
    }

    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
