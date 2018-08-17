package com.buyvalenko.ArrayList;


public class ArrayList implements List {
    private Object[] array = new Object[5];
    private Object[] tempDestArray = new Object[10];
    private int size;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {

        if (index <= array.length - 1)
            System.arraycopy(array, index, tempDestArray, 0, array.length);
        array[index] = value;

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        if (index <=size) {
            return array[index];
        }
        else
        {
            IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
            return  ex;
        }
    }

    @Override
    public Object set(Object value, int index) {
        if (index <=size) {
            return array[index] = value;
        }
        else
        {
            IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
            return  ex;
        }

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}

