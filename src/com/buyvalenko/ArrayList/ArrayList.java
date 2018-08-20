package com.buyvalenko.ArrayList;


public class ArrayList implements List {
    public static final int INITIAL_ARRAY_SIZE = 5;
    private Object[] array;

    public ArrayList() {

        this.array = new Object[INITIAL_ARRAY_SIZE * 2];
    }

    private Object[] tempDestArray = new Object[INITIAL_ARRAY_SIZE];
    private int size;

    @Override
    public void add(Object value) {
        extendArray();
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {

        if (index >= size) {
            extendArray();
        }

        Object temp = array[index];
        System.arraycopy(array, index, tempDestArray, 0, size);
        array[index] = value;
        System.arraycopy(tempDestArray, 0, array, index + 1, tempDestArray.length);
        array[index + 1] = temp;
        size++;

    }

    @Override
    public Object remove(int index) {
        if (index > size) {
            indexOutExeption();
        }
        if (index == size - 1) {
            array[index] = null;

        } else {
            System.arraycopy(array, index, tempDestArray, 0, size);
            System.arraycopy(tempDestArray, 1, array, index , tempDestArray.length-1);
            size--;
        }

        return array;
    }

    @Override
    public Object get(int index) {
        if (index <= size) {
            return array[index];
        } else {
            return indexOutExeption();
        }
    }

    @Override
    public Object set(Object value, int index) {
        if (index <= size) {
            return array[index] = value;
        } else {
            return indexOutExeption();
        }

    }

    @Override
    public void clear() {
        for (int i=0; i<=array.length; i++)
        {
            array[i]=null;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size <= 0) ? true : false;
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

    private void extendArray() {
        if (array.length == size) {
            Object[] newArray = new Object[(size * 3) / 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    private IndexOutOfBoundsException indexOutExeption() {
        IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
        return ex;
    }

}

